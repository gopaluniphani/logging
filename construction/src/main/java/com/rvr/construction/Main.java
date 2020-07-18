package com.rvr.construction;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	final static Logger LOGGER = LogManager.getLogger(Main.class);
	
	public static void driver() {
		Scanner input = new Scanner(System.in);
		OutputStreamWriter out = new OutputStreamWriter(System.out);
		int option, area, finalCost, automation;
		
		try {
			out.write("1.standard materials \n2.above standard materials \n3.high standard materials \nenter your option : ");
			out.flush();
			option = input.nextInt();
			
			out.write("enter total area of the house in square feet : ");
			out.flush();
			area = input.nextInt();
			
			out.write("enter fully automatic or not  if yes type 1 ,otherwise type 2 :   ");
			out.flush();
			automation = input.nextInt();
			
			finalCost = Estimate.estimate(option, area, automation);
			out.write("\n total amount is : " + finalCost + "INR\n\n");
			out.flush();
			LOGGER.info("Final cost of the construction is estimated");
		}
		catch(Exception e) {
			System.out.println(e);
			LOGGER.error("IOException in driver class");
		}
	}
	
}