package com.nt.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("cktr")
public interface Cricketer {
	
	@Lookup
	public abstract CricketBat createCricketBat(); // any name
	
	public default void fielding() {
		System.out.println("Cricketer is doing fielding");
	}
	public default void bowling() {
		System.out.println("Cricketer is doing bowling");
	}
	public default void wicketKeeping() {
		System.out.println("Cricketer is doing wicketkeeping");
	}
	public default void batting() {
		System.out.println("Cricketer.batting()");
		// create an extra IOC container
		// perform Dependency Lookup to get Dependent class object
		CricketBat bat = createCricketBat();
		// use Dependent class obj
		int runs = bat.scoreRuns();
		System.out.println("Crickter is doing batting and his current score is::"+runs);
	}
}
