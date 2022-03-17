package com.java.trainings;

import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

import com.java.trainings.interfaces.Messageable;

public class ConstructorReference {

	public static void main(String[] args) {
		
		//Messageable hello = Message  ::  new;
		//hello.getMessage("Hello");
		//hello.getMessage();

		
	/*	Predicate<String> checkvalue= s -> s.length()>1;
		
		Predicate<String> checkvalue1= s -> s.length()>2;
		
		
		System.out.println(checkvalue.and(checkvalue1).test("Sabari"));
		
		System.out.println(checkvalue.or(checkvalue1).test("s"));
		
		System.out.println(checkvalue.negate().test("s"));
		
	*/
		
		
		
		 Consumer<String> printConsumer = t -> System.out.println(t);
		 printConsumer.accept("Sabariii");
		 
		 //Stream<String> cities = Stream.of("Sydney", "Dhaka", "New York", "London");
		// cities.forEach(printConsumer);
		
		 
		 Supplier<Double> doubleSupplier1 = () -> Math.random();
		    DoubleSupplier doubleSupplier2 = Math::random;

		    System.out.println(doubleSupplier1.get());
		    
		    
		    
		    
		 /*   
		    Predicate -> test
		    Function -> apply
		    Consumer -> Accept
		    Supplier -> get
		 */
		
	}

}
