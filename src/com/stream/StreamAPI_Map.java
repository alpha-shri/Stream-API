package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.stream.constants.StreamConstants;

public class StreamAPI_Map {

	public static void main(String[] args) {

		System.out.println(StreamConstants.MESSAGE);

// USE OF MAP WITH STREAM-API	

//	MAP will perform a function on each element of the collection
//  Map -> Each element
//	map(function)	

		List<String> cities = List.of("Mumbai", "Cuttack", "Pune", "Bengaluru");

		List<String> collect = cities.stream().map(e -> e.concat(" New")).collect(Collectors.toList());

		System.out.println(cities.stream().filter(e -> e.contains("n")).collect(Collectors.toList()));

		cities.stream().forEach(System.out::println);

		System.out.println("MAP +++~~~~~~~~~~~>" + collect);

	}

	public void printMessage() {
		System.out.println("Pull request successful");
	}

}
