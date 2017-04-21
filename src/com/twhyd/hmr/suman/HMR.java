package com.twhyd.hmr.suman;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class HMR {
	
	
	public static void main(String args[]){
		
 
        System.setProperty("file.encoding","UTF-8");

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            while (true) {
            	
            	try{
            		System.out.println();
        			System.out.println("Enter Source Station Code: ");
                    String input = br.readLine().toUpperCase();
                    if ("QUIT".equalsIgnoreCase(input)) {
                        System.out.println("Exit!");
                        System.exit(0);
                    }
                    String sourceCode = input;
            		StationUtil.validateStationCode(sourceCode);

        			System.out.println("Enter Destination Station Code: ");
                    input = br.readLine().toUpperCase();
                    if ("QUIT".equalsIgnoreCase(input)) {
                        System.out.println("Exit!");
                        System.exit(0);
                    }
                    String destinationCode = input;
            		StationUtil.validateStationCode(destinationCode);
                    
            		StationUtil.printTicket(sourceCode, destinationCode);
            	} catch(InputMismatchException e){
            		System.out.println(e.getMessage());
            	}
            }

        } catch (Exception e) {
            e.printStackTrace();
        } 
	}
	

}
