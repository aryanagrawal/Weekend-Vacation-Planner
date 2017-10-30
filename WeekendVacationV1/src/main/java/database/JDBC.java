package database;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

public class JDBC implements Serializable {

	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/Searches";

	final String USER = "root";
	final String PASS = "370bc@AA#cgm";

	Connection conn = null;

	private ArrayList<Integer> user_ids;
	private ArrayList<Integer> hotel_ids;
	private ArrayList<Integer> room_ids;
	private ArrayList<Integer> ammenity_ids;
	private ArrayList<Integer> hotelAmmenities_ids;
	private ArrayList<Integer> sight_ids;
	private ArrayList<Integer> carCompany_ids;
	private ArrayList<Integer> carRate_ids;
	
	public JDBC() {
		user_ids = new ArrayList<Integer>();
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Functions to insert one new record to the Database
	public int	TEST_getuserid(){
		return user_ids.get(0);
	
	}
	
	
	
	private boolean runQuery(String query){
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(query);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	// Add a new User to the Database
	public boolean addUser(String session_id, boolean isMember, int member_id) {
		int member = (isMember) ? 1 : 0;
		int userId = getUserId();

		String query = "INSERT INTO Users " + "VALUES(" + userId + ", '" + session_id + "', " + member + ", "
				+ member_id + ")";

		return runQuery(query);
	}
	// Generate a new 5 digit unique user Id
	private int getUserId() {
		Random generator = new Random();
		int key;
		while (true) {
			key = generator.nextInt(89999) + 10000;
			if (!user_ids.contains(key)) {
				user_ids.add(key);
				return key;
			}
		}
	}
	

	// Add a new Flight to the Database
	public boolean addFlight(int flight_id,
							 String departure,
							 String arrival,
							 String airline,
							 String depart_time,
							 String arrival_time,
							 double cost,
							 String currency,
							 int user_id){
		
		if(!user_ids.contains(user_id)) return false;
		if(departure.length() > 4 || arrival.length() > 4) return false;
		// 2017-11-11 12:12:40		-> 		Date Time Format
		
		String query = "INSERT INTO Flights VALUES "
						+ "("+flight_id+", '"+departure+"', '"+arrival+"', "
						+ "'"+airline+"', '"+depart_time+"', '"+arrival_time+"', "
						+ cost+", '"+currency+"', "+user_id+")";
		return runQuery(query);
	}
	
	// Generate a new 5 digit unique user Id
		private int getHotelId() {
			Random generator = new Random();
			int key;
			while (true) {
				key = generator.nextInt(899999) + 100000;
				if (!hotel_ids.contains(key)) {
					hotel_ids.add(key);
					return key;
				}
			}
		}
	public boolean addHotel(String name,
							String address,
							String url,
							double cost,
							String currency,
							String checkin,
							String checkout,
							String more_rooms,
							int userId){
		
		if(!user_ids.contains(userId)) return false;
		int hotelId = getHotelId();
		String query = "INSERT INTO Hotels VALUES"
				+ "("+hotelId+", '"+name+"', '"+address+"' ,'"+url+"', "+
				cost+", '"+currency+"', '"+checkin+"', '"+checkout+"', '"+more_rooms+"', "+
				userId+")";

		return runQuery(query);
	}
	
	
	private int getRoomId() {
		Random generator = new Random();
		int key;
		while (true) {
			key = generator.nextInt(8999) + 1000;
			if (!room_ids.contains(key)) {
				room_ids.add(key);
				return key;
			}
		}
	}
	public boolean addRooms(double cost,
							String roomType,
							String bedType,
							int numberOfBeds,
							int hotelId){
		
		if(!hotel_ids.contains(hotelId)) return false;
		
		int roomId = getRoomId();
		String query = "INSERT INTO Rooms values("+roomId+", "+cost+", '"+roomType
						+"', '"+bedType+"', "+numberOfBeds+", "+hotelId+")";
		
		return runQuery(query);
	}
	
	
	
	private int getAmmenityId() {
		Random generator = new Random();
		int key;
		while (true) {
			key = generator.nextInt(899) + 100;
			if (!ammenity_ids.contains(key)) {
				ammenity_ids.add(key);
				return key;
			}
		}
	}
	public boolean addAmmenity(String description){
		int ammenityId = getAmmenityId();
		String query = "INSERT INTO Ammenities VALUES ("+ammenityId+", '"+description+"')";
		
		return runQuery(query);
	}
	
	private int getHotelAmmenityId() {
		Random generator = new Random();
		int key;
		while (true) {
			key = generator.nextInt(8999) + 1000;
			if (!hotelAmmenities_ids.contains(key)) {
				hotelAmmenities_ids.add(key);
				return key;
			}
		}
	}
	public boolean addHotelAmaneties(int hotelId, int ammenityId){
		if (!hotel_ids.contains(hotelId)) return false;
		if(!ammenity_ids.contains(ammenityId)) return false;
		
		int primaryKey = getHotelAmmenityId();
		String query = "insert into Hotel_Ammenities VALUES("+primaryKey+", "+hotelId+", "+ammenityId+")";
		
		return runQuery(query);
	}
	
	
	
	private int getSightId() {
		Random generator = new Random();
		int key;
		while (true) {
			key = generator.nextInt(89999) + 10000;
			if (!sight_ids.contains(key)) {
				sight_ids.add(key);
				return key;
			}
		}
	}
	public boolean addSight(String sight,
							String image,
							int rating,
							String description,
							String wiki,
							int userId){
		
		if(!user_ids.contains(userId)) return false;
		
		int sightId = getSightId();
		String query = "INSERT INTO Sights VALUES("+sightId+", '"+sight+"', '"+image+"', "+rating
						+", '"+description+"', '"+wiki+"', "+userId+")";
		return runQuery(query);
	}
	
	
	
	private int getCarCompanyId() {
		Random generator = new Random();
		int key;
		while (true) {
			key = generator.nextInt(89999) + 10000;
			if (!carCompany_ids.contains(key)) {
				carCompany_ids.add(key);
				return key;
			}
		}
	}
	public boolean addCarCompany(String company, String airport, int userId){
		if(!user_ids.contains(userId)) return false;
		
		int carCompanyId = getCarCompanyId();
		String query = "INSERT INTO Car_Companies VALUES("+carCompanyId
						+", '"+company+"', '"+airport+"', "+userId+")";
		
		return runQuery(query);
	}
	
	private int getCarRateId() {
		Random generator = new Random();
		int key;
		while (true) {
			key = generator.nextInt(8999) + 1000;
			if (!carRate_ids.contains(key)) {
				carRate_ids.add(key);
				return key;
			}
		}
	}
	public boolean addCarRates(double price, 
							   String currency, 
							   String rateType, 
							   String carCategory, 
							   int companyId){
		
		if(!carCompany_ids.contains(companyId)) return false;
		
		int carRateId = getCarRateId();
		String query = "INSERT INTO Car_Rates VALUES("+carRateId+", "+price
						+", '"+currency+"', '"+rateType+"', '"+carCategory
						+"', "+companyId+")";
		
		return runQuery(query);
	}
}
