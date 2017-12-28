package com.forEach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {

public static void main(String[] args) {
		
		//creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<10; i++) myList.add(i);
		
		//traversing using Iterator
		/*This type of iteration called external iterations
		as we need to put out collection into some box which is iterating values*/
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()){
			Integer i = it.next();
			System.out.println("Value: "+i);
		}
		
		//traversing in Java 8
		/*This is internal iterations, instead of putting collection 
		in separate box for each is used within the collection.
		This improves performance as collection is iterated within the box*/
		myList.forEach(i -> System.out.println("Value: "+i));
		
	}

}

//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer>{

	public void accept(Integer t) {
		System.out.println("Consumer impl Value::"+t);
	}


}