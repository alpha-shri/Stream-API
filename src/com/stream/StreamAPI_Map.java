package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI_Map {

	public static void main(String[] args) {
		
// USE OF MAP WITH STREAM-API	
		
//	MAP will perform a function on each element of the collection
//  Map -> Each element
//	map(function)	
		System.out.println("Welcome to Stream - Map");
		
		List<String> cities = List.of("Mumbai", "Cuttack", "Pune", "Bengaluru");
		
		List<String> collect = cities.stream()
									 .map( e -> e.concat(" New"))
									 .collect(Collectors.toList());
		
		System.out.println(cities.stream().filter( e -> e.contains("n")).collect(Collectors.toList()));
		
		cities.stream().forEach(System.out::println);
			
		
		System.out.println("MAP +++~~~~~~~~~~~>" +collect);		  

	}
	
	
	


}
