package com.twhyd.hmr.suman;

public class MetroTicket {
	private String sourceStation;
	private String destinationStation;
	private int distance;
	private float fare;
	
	MetroTicket(String sourceStation, String destinationStation, int distance, float fare){
		this.sourceStation = sourceStation;
		this.destinationStation = destinationStation;
		this.distance = distance;
		this.fare = fare;
	}
	
	public void printTicket(){
		String RUPEE = "\u20B9";
		
		System.setProperty("file.encoding","UTF-8");

		System.out.println("*************************************************************");
		System.out.println("                   Hyderabad Metro Rail");
		System.out.print("Source:   "      + this.sourceStation);
		System.out.println("\t" + "Distance(stations): " + this.distance);

		System.out.print("Destination:   " + this.destinationStation);
		System.out.println("\t" + "Cost: "+ RUPEE + String.format("%.2f",this.fare));
		System.out.println("*************************************************************");
		
	}
}
