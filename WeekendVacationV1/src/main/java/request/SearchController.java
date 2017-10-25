package request;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class SearchController {

    @GetMapping("/search")
    public String searchForm(Model model) {
        model.addAttribute("search", new Search());
        return "search";
    }

    @PostMapping("/search")
    public String searchSubmit(@ModelAttribute Search search) {
    	String deptMonth = search.getDeptMonth();
    	String deptMonthActual = setMonth(deptMonth);
    	// Error Check to come if returns 0
    	String deptDay = search.getDeptDay();
    	String deptYear = search.getDeptYear();
    	String deptDate = deptYear + "-" + deptMonthActual + "-" + deptDay;
    	search.setDeptDate(deptDate);
    	
    	String returnMonth = search.getReturnMonth();
    	String returnMonthActual = setMonth(returnMonth);
    	// Error Check to come if returns 0
    	String returnDay = search.getReturnDay();
    	String returnYear = search.getReturnYear();
    	String returnDate = returnYear + "-" + returnMonthActual + "-" + returnDay;
    	search.setReturnDate(returnDate);
    	
        MySearch tempSession = new MySearch(search.getOrigin(), search.getDestination(), search.getDeptDate(),search.getReturnDate());
        search.setHotelList(tempSession.getHotelResponseList());
       
        String hotelName = tempSession.getHotelResponseList().get(0).getPropertyName();
        // Create address
        String street = tempSession.getHotelResponseList().get(0).getAddress().getLine1();
        String city = tempSession.getHotelResponseList().get(0).getAddress().getCity();
        String state = tempSession.getHotelResponseList().get(0).getAddress().getRegion();
        String zip = tempSession.getHotelResponseList().get(0).getAddress().getPostalCode();
        String country = tempSession.getHotelResponseList().get(0).getAddress().getCountry();
        String hotelPrice = tempSession.getHotelResponseList().get(0).getMinDailyRate().getAmount();
        
        //Set Hotel info in Search()
        search.setHotelName(hotelName);
        search.setHotelStreet(street);
        search.setHotelCity(city);
        search.setHotelState(state);
        search.setHotelZip(zip);
        search.setHotelCountry(country);
        search.setHotelPrice(hotelPrice);
        
        // Create Flight Info
        String departAirline = tempSession.getFlightResponseList().get(0).getItineraries().get(0).getOutbound().getFlights().get(0).getMarketingAirline();
        String departAirport = tempSession.getFlightResponseList().get(0).getItineraries().get(0).getOutbound().getFlights().get(0).getOrigin().getAirport();
        String departTime = tempSession.getFlightResponseList().get(0).getItineraries().get(0).getOutbound().getFlights().get(0).getDepartsAt();
        String returnAirline = tempSession.getFlightResponseList().get(0).getItineraries().get(0).getInbound().getFlights().get(0).getMarketingAirline();
        String returnAirport = tempSession.getFlightResponseList().get(0).getItineraries().get(0).getInbound().getFlights().get(0).getOrigin().getAirport();
        String returnTime = tempSession.getFlightResponseList().get(0).getItineraries().get(0).getInbound().getFlights().get(0).getDepartsAt();
        String flightPrice = tempSession.getFlightResponseList().get(0).getFare().getTotalPrice();
        
        //Set Flight info in Search()
        search.setDeptFlightAirline(departAirline);
        search.setDeptFlightAirport(departAirport);
        search.setDeptFlightTime(departTime);
        search.setReturnFlightAirline(returnAirline);
        search.setReturnFlightAirport(returnAirport);
        search.setReturnFlightTime(returnTime);
        search.setTotalFlightPrice(flightPrice);
        
        
        return "result";
    }
    
    public String setMonth(String deptMonth){
    	if (deptMonth.equals("January")){
    		return "01";
    	}
    	if (deptMonth.equals("Feburary")){
    		return "02";
    	}
    	if (deptMonth.equals("March")){
    		return "03";
    	}
    	if (deptMonth.equals("April")){
    		return "04";
    	}
    	if (deptMonth.equals("May")){
    		return "05";
    	}
    	if (deptMonth.equals("June")){
    		return "06";
    	}
    	if (deptMonth.equals("July")){
    		return "07";
    	}
    	if (deptMonth.equals("August")){
    		return "08";
    	}
    	if (deptMonth.equals("September")){
    		return "09";
    	}
    	if (deptMonth.equals("October")){
    		return "10";
    	}
    	if (deptMonth.equals("November")){
    		return "11";
    	}
    	if (deptMonth.equals("December")){
    		return "12";
    	}
    	return "0";
    }

}
