package database;

import java.io.Serializable;

import java.util.Hashtable;

/*
Visual Representation of the hash table

* flight			[company		, count]
* hotel				[name   		, count]
* amenity			[description	, count]
* origin			[name			, count]
* destination		[name			, count]
* carcompany		[name			, count]
* 
* starttime			[starttime		, count]
* endtime			[endtime		, count]
* vacationduration	[vacationdurtion, count]
* 
* timeperiod		{[origin		, count],		[destination		, count],		[duration	, count]}
*/

public class SearchHistory implements Serializable{
	
	private Hashtable<String, Hashtable<String, Integer>> memory;
	
	public SearchHistory(){
		memory = new Hashtable<String, Hashtable<String, Integer>>();
		
		memory.put("flight"				, new Hashtable<String, Integer>());
		memory.put("hotel"				, new Hashtable<String, Integer>());
		memory.put("amenity"			, new Hashtable<String, Integer>());
		memory.put("origin"				, new Hashtable<String, Integer>());
		memory.put("destination"		, new Hashtable<String, Integer>());
		memory.put("carcompany"			, new Hashtable<String, Integer>());
		memory.put("starttime"			, new Hashtable<String, Integer>());
		memory.put("endtime"			, new Hashtable<String, Integer>());
		memory.put("vacationduration"	, new Hashtable<String, Integer>());
	}
}










