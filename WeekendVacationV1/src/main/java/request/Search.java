package request;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import io.swagger.client.model.HotelPropertyResponse;

public class Search {
	
	private String plane;
	private String hotel;
	private String budget;
	private String origin;
	private String destination;
	private String deptDate;
	private String returnDate;
	private String deptMonth;
	private String deptDay;
	private String deptYear;
	private String returnMonth;
	private String returnDay;
	private String returnYear;
	public String list;
	public String hotelName;
	public String hotelStreet;
	public String hotelCity;
	public String hotelState;
	public String hotelZip;
	public String hotelCountry;
	public String hotelAddress;
	public String hotelPrice;
	public String deptFlightAirline;
	public String deptFlightAirport;
	public String deptFlightTime;
	public String returnFlightAirline;
	public String returnFlightAirport;
	public String returnFlightTime;
	public String totalFlightPrice;
	
	
	/////////////////////////////////////////UserSearch///////////////////////////////////////////////////
	private int membershipId;
	private boolean isMember;
	ArrayList<Integer> membershipIds = new ArrayList<Integer>();

	public void checkmembership(){
		for(int i=0;i<membershipIds.size();i++){
			if(this.membershipId == membershipIds.get(i)){
				setMemberShip(true);
				return;
			}
		}
		setMemberShip(true);//only set to true for debugging purposes
	}
	// true if member
	// false if not
	public void setMemberShip(boolean isMember){
		this.isMember = isMember;
	}
	
	public boolean isUserAMember(){
		return this.isMember;
	}
	
	private int getMemberShipId() {
		Random generator = new Random();
		int key;
		while (true) {
			key = generator.nextInt(89999999) + 10000000;
			if (!membershipIds.contains(key)) {
				membershipIds.add(key);
				return key;
			}
		}
	}
	
	public int setMemberShipId(){
		this.membershipId = getMemberShipId();
		return membershipId;
	}
	public void setMemberShipId(int key){
		this.membershipId = key;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////

	
	
	/*
	 * HotelList
	 */
	public String getHotelList(){
		return list;
	}
	
	public void setHotelList(List<HotelPropertyResponse> list){
		this.list = list.toString();
	}
	
	/*
	 * Origin
	 */
	public String getOrigin(){
		return origin;
	}
	
	public void setOrigin(String origin){
		this.origin = origin;
	}
	
	/*
	 * Destination
	 */
	public String getDestination(){
		return destination;
	}
	
	public void setDestination(String destination){
		this.destination = destination;
	}

	/*
	 * Departure Date Info
	 */
	public void setDeptMonth(String deptMonth){
		this.deptMonth = deptMonth;
	}
	public String getDeptMonth(){
		return deptMonth;
	}
	
	public void setDeptDay(String deptDay){
		this.deptDay = deptDay;
	}
	public String getDeptDay(){
		return deptDay;
	}
	
	public void setDeptYear(String deptYear){
		this.deptYear = deptYear;
	}
	public String getDeptYear(){
		return deptYear;
	}
	
	public void setDeptDate(String deptDate){
		this.deptDate = deptDate;
	}
	public String getDeptDate(){
		return deptDate;
	}
	
	/*
	 * Return Date Info
	 */
	public void setReturnMonth(String returnMonth){
		this.returnMonth = returnMonth;
	}
	public String getReturnMonth(){
		return returnMonth;
	}
	
	public void setReturnDay(String returnDay){
		this.returnDay = returnDay;
	}
	public String getReturnDay(){
		return returnDay;
	}
	
	public void setReturnYear(String returnYear){
		this.returnYear = returnYear;
	}
	public String getReturnYear(){
		return returnYear;
	}
	public void setReturnDate(String returnDate){
		this.returnDate = returnDate;
	}
	public String getReturnDate(){
		return returnDate;
	}
	
	public String getPlane(){
		return plane;
	}
	
	public void setPlane(String plane){
		this.plane = plane;
	}
	
	public String getHotel(){
		return hotel;
	}
	
	public void setHotel(String hotel){
		this.hotel = hotel;
	}
	
	/*
	 * Budget
	 */
	public String getBudget(){
		return budget;
	}
	
	public void setBudget(String budget){
		this.budget = budget;
	}
	
	/*
	 * Hotel Response Items
	 */
	public String getHotelName(){
		return hotelName;
	}
	public void setHotelName(String hotelName){
		this.hotelName = hotelName;
	}
	
	
	public String getHotelStreet(){
		return hotelStreet;
	}
	
	public void setHotelStreet(String hotelStreet){
		this.hotelStreet = hotelStreet;
	}
	
	public String getHotelCity(){
		return hotelCity;
	}
	
	public void setHotelCity(String hotelCity){
		this.hotelCity = hotelCity;
	}
	public String getHotelState(){
		return hotelState;
	}
	
	public void setHotelState(String hotelState){
		this.hotelState = hotelState;
	}
	public String getHotelZip(){
		return hotelZip;
	}
	
	public void setHotelZip(String hotelZip){
		this.hotelZip = hotelZip;
	}
	public String getHotetCountry(){
		return hotelCountry;
	}
	
	public void setHotelCountry(String hotelCountry){
		this.hotelCountry = hotelCountry;
	}
	
	public String getHotetAddress(){
		return hotelAddress;
	}
	
	public void setHotelAddress(String hotelAddress){
		this.hotelAddress = hotelAddress;
	}
	
	public String getHotelPrice(){
		return hotelPrice;
	}
	
	public void setHotelPrice(String hotelPrice){
		this.hotelPrice = hotelPrice;
	}
	
	/*
	 * Flight Request Items
	 */
	public String getDeptFlightAirline(){
		return deptFlightAirline;
	}
	
	public void setDeptFlightAirline(String deptFlightAirline){
		this.deptFlightAirline = deptFlightAirline;
	}
	public String getDeptFlightAirport(){
		return deptFlightAirport;
	}
	
	public void setDeptFlightAirport(String deptFlightAirport){
		this.deptFlightAirport = deptFlightAirport;
	}
	public String getDeptFlightTime(){
		return deptFlightTime;
	}
	
	public void setDeptFlightTime(String deptFlightTime){
		this.deptFlightTime = deptFlightTime;
	}
	
	public String getReturnFlightAirline(){
		return returnFlightAirline;
	}
	
	public void setReturnFlightAirline(String returnFlightAirline){
		this.returnFlightAirline = returnFlightAirline;
	}
	public String getReturnFlightAirport(){
		return returnFlightAirport;
	}
	
	public void setReturnFlightAirport(String returnFlightAirport){
		this.returnFlightAirport = returnFlightAirport;
	}
	public String getReturnFlightTime(){
		return returnFlightTime;
	}
	
	public void setReturnFlightTime(String returnFlightTime){
		this.returnFlightTime = returnFlightTime;
	}
	public String getTotalFlightPrice(){
		return totalFlightPrice;
	}
	public void setTotalFlightPrice(String totalFlightPrice){
		this.totalFlightPrice = totalFlightPrice;
	}



}
