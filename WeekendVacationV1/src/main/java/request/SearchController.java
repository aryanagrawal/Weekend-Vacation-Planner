package request;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Random;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import database.JDBC;
import io.swagger.client.model.Amenity;
import io.swagger.client.model.FlightSearchItinerary;
import io.swagger.client.model.FlightSearchSegment;
import io.swagger.client.model.HotelPropertyResponse;
import io.swagger.client.model.HotelRoom;
import io.swagger.client.model.LowFareSearchResult;


@Controller
public class SearchController {

	private ArrayList<Integer> member_ids = new ArrayList<Integer>();
	
	private JDBC database = new JDBC();
	

	
    @GetMapping("/search")
    public String searchForm(Model model) {
        model.addAttribute("search", new Search());
        return "search";
    }

    @PostMapping("/search")
    public String searchSubmit(@ModelAttribute Search search) {

    	// departure
    	String deptMonth = search.getDeptMonth();
    	String deptMonthActual = setMonth(deptMonth);
    	String deptDay = search.getDeptDay();
    	String deptYear = search.getDeptYear();
    	String deptDate = deptYear + "-" + deptMonthActual + "-" + deptDay;
    	search.setDeptDate(deptDate);

    	// return
    	String returnMonth = search.getReturnMonth();
    	String returnMonthActual = setMonth(returnMonth);
    	String returnDay = search.getReturnDay();
    	String returnYear = search.getReturnYear();
    	String returnDate = returnYear + "-" + returnMonthActual + "-" + returnDay;
    	search.setReturnDate(returnDate);
    	
    	// from, to, depart, return
        MySearch tempSession = new MySearch(search.getOrigin(), search.getDestination(), search.getDeptDate(),search.getReturnDate());
//        search.setHotelList(tempSession.getHotelResponseList());

        // get hotels
        ArrayList<Object[]> hotels = new ArrayList<Object[]>();

        List<HotelPropertyResponse> allHotels = tempSession.getHotelResponseList();
        for(HotelPropertyResponse hotel : allHotels){
        	String hotelName = hotel.getPropertyName();
            String street = hotel.getAddress().getLine1();
            String city = hotel.getAddress().getCity();
            String state = hotel.getAddress().getRegion();
            String zip = hotel.getAddress().getPostalCode();
            String country = hotel.getAddress().getCountry();
            String fullAddress = street + ", " + city + ", " + state + ", " + zip + ", " + country;
            String hotelPrice = hotel.getMinDailyRate().getAmount();
            String currency = hotel.getMinDailyRate().getCurrency();
            String url = hotel.getContacts().get(0).toString();
            String linkToMoreRooms = "NA";
            try{
            	 linkToMoreRooms = hotel.getMoreRoomsAtThisHotel().toString();
            } catch (Exception e){
            	 linkToMoreRooms = "NA";
            }
            Object[] hotelDetails = new Object[]{
            	hotelName,
            	fullAddress,
            	url,
            	hotelPrice,
            	currency,
            	linkToMoreRooms
            };

            List<HotelRoom> rooms = hotel.getRooms();
            List<Amenity> amenities = hotel.getAmenities();
            hotels.add(new Object[]{
            		amenities, hotelDetails, rooms
            });
        }
        
        search.setHotels(hotels);
        
//        String hotelName = tempSession.getHotelResponseList().get(0).getPropertyName();
//        String street = tempSession.getHotelResponseList().get(0).getAddress().getLine1();
//        String city = tempSession.getHotelResponseList().get(0).getAddress().getCity();
//        String state = tempSession.getHotelResponseList().get(0).getAddress().getRegion();
//        String zip = tempSession.getHotelResponseList().get(0).getAddress().getPostalCode();
//        String country = tempSession.getHotelResponseList().get(0).getAddress().getCountry();
//        String fullAddress = street + ", " + city + ", " + state + ", " + zip + ", " + country;
//        String hotelPrice = tempSession.getHotelResponseList().get(0).getMinDailyRate().getAmount();
//        String url = tempSession.getHotelResponseList().get(0).getContacts().toString();
////
////        //Set Hotel info in Search()
//        search.setHotelName(hotelName);
//        search.setHotelStreet(street);
//        search.setHotelCity(city);
//        search.setHotelState(state);
//        search.setHotelZip(zip);
//        search.setHotelCountry(country);
//        search.setHotelPrice(hotelPrice);
//        search.setHotelAddress(fullAddress);
        
        // Create Flight Info
//        String departAirline = tempSession.getFlightResponseList().get(0).getItineraries().get(0).getOutbound().getFlights().get(0).getMarketingAirline();
//        String departAirport = tempSession.getFlightResponseList().get(0).getItineraries().get(0).getOutbound().getFlights().get(0).getOrigin().getAirport();
//        String departtTime = tempSession.getFlightResponseList().get(0).getItineraries().get(0).getOutbound().getFlights().get(0).getDepartsAt();
//        String returnAirline = tempSession.getFlightResponseList().get(0).getItineraries().get(0).getInbound().getFlights().get(0).getMarketingAirline();
//        String returnAirport = tempSession.getFlightResponseList().get(0).getItineraries().get(0).getInbound().getFlights().get(0).getOrigin().getAirport();
//        String returnTime = tempSession.getFlightResponseList().get(0).getItineraries().get(0).getInbound().getFlights().get(0).getDepartsAt();
//        String flightPrice = tempSession.getFlightResponseList().get(0).getFare().getTotalPrice();
//        
        
        ArrayList<Object[]> outboundFlights = new ArrayList<Object[]>();
        ArrayList<Object[]> inboundFlights = new ArrayList<Object[]>();
        String cost, currency;
        List<LowFareSearchResult> allSearches = tempSession.getFlightResponseList();
        for(LowFareSearchResult fareSearch : allSearches){
        	cost = fareSearch.getFare().getTotalPrice();
        	currency = "USD";
        	
        	for(FlightSearchItinerary iternary : fareSearch.getItineraries()){
        		for(FlightSearchSegment Outbound : iternary.getOutbound().getFlights()){
        			String flightID = Outbound.getFlightNumber();
        			String departure = Outbound.getOrigin().getAirport();
        			String arrival = Outbound.getDestination().getAirport();
        			String airline = Outbound.getMarketingAirline();
        			String departTime = Outbound.getDepartsAt();
        			String arriveTime = Outbound.getArrivesAt();
        			outboundFlights.add(new Object[]{
        					flightID,
        					departure,
        					arrival,
        					airline,
        					departTime,
        					arriveTime,
        					cost,
        					currency
        			});
        		}
        		for(FlightSearchSegment Inbound : iternary.getInbound().getFlights()){
        			String flightID = Inbound.getFlightNumber();
        			String departure = Inbound.getOrigin().getAirport();
        			String arrival = Inbound.getDestination().getAirport();
        			String airline = Inbound.getMarketingAirline();
        			String departTime = Inbound.getDepartsAt();
        			String arriveTime = Inbound.getArrivesAt();
        			inboundFlights.add(new Object[]{
        					flightID,
        					departure,
        					arrival,
        					airline,
        					departTime,
        					arriveTime,
        					cost,
        					currency
        			});
        		}
        	}
        }
        
        //Set Flight info in Search()
//        search.setDeptFlightAirline(departAirline);
//        search.setDeptFlightAirport(departAirport);
//        search.setDeptFlightTime(departtTime);
//        search.setReturnFlightAirline(returnAirline);
//        search.setReturnFlightAirport(returnAirport);
//        search.setReturnFlightTime(returnTime);
//        search.setTotalFlightPrice(flightPrice);
        
        search.setOutboundFlights(outboundFlights);
        search.setInboundFlights(inboundFlights);

        String session_id = getDate();
    	int memberID=-1;
    	while(true){
    		 memberID = getRandomNumber(10);
    		 if(!member_ids.contains(memberID)){
    			 member_ids.add(memberID);
    			 break;
    		 }
    	}
    	
    	// Added new user to the database
    	int userID = addNewUser(session_id, memberID);
    	addFlights(userID, inboundFlights, outboundFlights);
    	addHotels(userID, hotels, deptDate, returnDate);
        return "result";
    }
    
    @GetMapping("/memberId")
    public String usersearchForm(Model model) {
        model.addAttribute("memberId", new Search());
        System.out.println("The GetMapping is running");
        return "memberId";
    }
    
    @PostMapping("/memberId")
    public String userSearchSubmit(@ModelAttribute Search usersearch) {
        System.out.println("The PostMapping is running");
    	usersearch.checkmembership();
    	if (usersearch.isUserAMember()){
    		System.out.println("ismember");
    		return "search";
    	}
    	else{
    		System.out.println("not member");
    		return "memberId";
    	}
    }
    @SuppressWarnings("unchecked")
	private void addHotels(int userID, ArrayList<Object[]> hotels, String deptDate, String returnDate){
    	deptDate += " 00:00:00";
    	returnDate += " 00:00:00";
    	
    	for(Object[] hotel : hotels){
    		
    		List<Amenity> amenities = (List<Amenity>)hotel[0];
    		Object[] hotelDetails = (Object[])hotel[1];
    		List<HotelRoom> roomDetails = (List<HotelRoom>)hotel[2];
    		String hotelName = hotelDetails[0].toString();
    		String address   = hotelDetails[1].toString();
    		String url       = hotelDetails[2].toString();
    		url = url.replaceAll("\n", " ");
    		if(url.length()>128)
    			url = url.substring(0, 128);
    		double cost      = Double.parseDouble(hotelDetails[3].toString());
    		String currency  = hotelDetails[4].toString();
    		String moreRooms = hotelDetails[5].toString();
    		int hotelID = database.addHotel(hotelName, address, url, cost, currency, deptDate, returnDate, moreRooms, userID);
    		if(hotelID==-1) continue;
    		else{
    			for(HotelRoom room : roomDetails){
    				double price = Double.parseDouble(room.getTotalAmount().getAmount());
    				String roomType = room.getRoomTypeInfo().getRoomType();
    				String bedType = room.getRoomTypeInfo().getBedType();
    				int numberOfBeds = -1;
    				try{
    					numberOfBeds = Integer.parseInt(room.getRoomTypeInfo().getNumberOfBeds());
    				} catch(Exception e){
    					
    				}
    				
    				database.addRooms(price, roomType, bedType, numberOfBeds, hotelID);
    			}
    			
    			for(Amenity amenity : amenities){
    				String description = amenity.getDescription();
    				int ammenityID = database.addAmmenity(description);
    				database.addHotelAmaneties(hotelID, ammenityID);
    			}
    		}
    	}
    }
    
    private void addFlights(int userID, ArrayList<Object[]> inboundFlights, ArrayList<Object[]> outboundFlights){
    	for(Object[] flight : inboundFlights){
    		try{
    			int flightId = Integer.parseInt(flight[0].toString());
    			String departure = flight[1].toString();
    			String arrival = flight[2].toString();
    			String airline = flight[3].toString();
    			String departTime = flight[4].toString();
    			String arriveTime = flight[5].toString();
    			double cost = Double.parseDouble(flight[6].toString());
    			String currency = flight[7].toString();
    			database.addFlight(flightId, departure, arrival, airline, departTime, arriveTime, cost, currency, userID);
    		} catch(Exception e){
    			continue;
    		}
    	}
    	
    	for(Object[] flight : outboundFlights){
    		try{
    			int flightId = Integer.parseInt(flight[0].toString());
    			String departure = flight[1].toString();
    			String arrival = flight[2].toString();
    			String airline = flight[3].toString();
    			String departTime = flight[4].toString();
    			String arriveTime = flight[5].toString();
    			double cost = Double.parseDouble(flight[6].toString());
    			String currency = flight[7].toString();
    			database.addFlight(flightId, departure, arrival, airline, departTime, arriveTime, cost, currency, userID);
    		} catch(Exception e){
    			continue;
    		}
    	}
    }

    // Add a new user and return the primary key.
    private int addNewUser(String sessionId, int memberID){
    	return database.addUser(sessionId, true, memberID);
    }

    private int getRandomNumber(int digits){
    	int power = (int)Math.pow(10, digits);
    	return (new Random()).nextInt(power*10 - 1 - power) + power ;
    }
    
    private String getDate() {
    	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    	Date date = new Date();
    	return dateFormat.format(date);
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
