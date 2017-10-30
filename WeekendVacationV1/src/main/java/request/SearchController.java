package request;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import database.JDBC;


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
        String fullAddress = street + ", " + city + ", " + state + ", " + zip + ", " + country;
        String hotelPrice = tempSession.getHotelResponseList().get(0).getMinDailyRate().getAmount();
        
        String url = tempSession.getHotelResponseList().get(0).getContacts().toString();
//        JDBC db = new JDBC();
//        System.out.println("n\nHOTEL PRICE: " + hotelPrice+"\n\n");
//        db.addHotel(hotelName, fullAddress, url,Double.parseDouble(hotelPrice), "USD",
//        			deptDate+ " " + "12:00:00", returnDate+" " + "12:00:00", "ii", 41889);
//        
        //Set Hotel info in Search()
        search.setHotelName(hotelName);
        search.setHotelStreet(street);
        search.setHotelCity(city);
        search.setHotelState(state);
        search.setHotelZip(zip);
        search.setHotelCountry(country);
        search.setHotelPrice(hotelPrice);
        search.setHotelAddress(fullAddress);
        
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
        
        
        updateDatabase(search);
        return "result";
    }
    
    
    public void updateDatabase(@ModelAttribute Search search){
    	JDBC database = new JDBC();
    	/*
    	 * 					String name,
							String address,
							String url,
							double cost,
							String currency,
							String checkin,
							String checkout,
							String more_rooms,
							int userId
    	 */
    	String name = search.getHotelName();
    	String address = search.getHotetAddress();
    	String url = "NA";
    	double cost = Double.parseDouble(search.getHotelPrice());
    	String currency = "USD";
    	String checkin = search.getDeptFlightTime();
    	checkin = checkin.substring(0, checkin.indexOf('T')) +" "+ checkin.substring(1+checkin.indexOf('T'))+":00";
    	String checkout = search.getReturnFlightTime();
    	checkout = checkout.substring(0, checkout.indexOf('T')) +" "+ checkout.substring(1+checkout.indexOf('T'))+":00";
    	String more_rooms = "NA";
    	int userId = 81394;
    	
 
    	
    	database.addHotel(name, address, url, cost, currency, checkin, checkout, more_rooms, userId);
//    	Object object[] = new Object[]{address,
//    									url,
//    									cost,
//    									currency,
//    									checkin,
//    									checkout,
//    									more_rooms,
//    									userId};
//    	System.out.println("\n\n");
//    	for(Object o : object){
//    		System.out.println("DEBUG	:	" + o.toString());
//    	}
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
