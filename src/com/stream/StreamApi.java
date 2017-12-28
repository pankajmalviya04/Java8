package com.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

		//Before Java 8
		private static int sumIterator(List<Integer> list) {
			Iterator<Integer> it = list.iterator();
			int sum = 0;
			while (it.hasNext()) {
				int num = it.next();
				if (num > 10) {
					sum += num;
				}
			}
			return sum;
		}
		
		//In Java 8
		/*Here code is unaware of iteration logic in the background.
		 * Focus is only on business logic*/		
		private static int sumStream(List<Integer> list) {
			return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
		}
			
	
}
