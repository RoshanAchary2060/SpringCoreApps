package com.nt.beans;

public abstract class Cricketer {
	
	public abstract CricketBat createCricketBat(); // any name
	
	public Cricketer() {
		System.out.println("Cricketer::0-param constructor");
	}
	
	public void fielding() {
		System.out.println("Cricketer is doing fielding");
	}
	public void bowling() {
		System.out.println("Cricketer is doing bowling");
	}
	public void wicketKeeping() {
		System.out.println("Cricketer is doing wicketkeeping");
	}
	public void batting() {
		System.out.println("Cricketer.batting()");
		// create an extra IOC container
		// perform Dependency Lookup to get Dependent class object
		CricketBat bat = createCricketBat();
		// use Dependent class obj
		int runs = bat.scoreRuns();
		System.out.println("Crickter is doing batting and his current score is::"+runs);
	}
}
