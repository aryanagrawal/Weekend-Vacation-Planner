package database;

import static org.junit.Assert.*;

import org.junit.Test;

import request.Application;
import request.SearchController;

public class TestDatabase {

	@Test
	public void test() {
//		fail("Not yet implemented");
	
		SearchController cont = new SearchController();
//		System.out.println(cont.getDate());
		
		JDBC database = new JDBC();
		database.addUser("sesion id", true, 12233433);
	}

}
