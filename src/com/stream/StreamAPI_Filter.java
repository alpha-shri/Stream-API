package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI_Filter {

	public static void main(String[] args) {

// USE OF FILTER WITH STREAM-API	
		
//	Filter return a predicate (predicate is a Boolean value)
//  e -> e>10		
		
// Create a List of Integers
// filter all the even numbers.	
		
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,22,1,2131,311,22,13,1,25,2,341,5,4,23,2,41,6,33,1,42,63,76,252,3);
		
		List<Integer> evenNos = new ArrayList<Integer>();
		
// Traditional Approach
		for(int e : numbers) {
			if(e % 2 == 0) {
				evenNos.add(e);
			}
		}
		System.out.println("Without Stream API +++~~~~~~~~~~~>" +evenNos);
		
// Use of stream API		
		
		Stream<Integer> streamNumbers = numbers.stream();
		List<Integer> evenList = streamNumbers.filter( element -> element % 2==0)
					 						 .collect(Collectors.toList()); 
		
		System.out.println("Stream API +++~~~~~~~~~~~>" +numbers.stream()
															    .filter( e -> e%2==0)
															    .collect(Collectors.toList()));
	

	}

}
