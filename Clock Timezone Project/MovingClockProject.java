/*
Author: Juan Castillo Pineda
Date: 05/25/2023

This program will give the user their current day, date, time, and timezone. Along with this, it'll display the UTC timezone and three other timezones based on the western hemisphere, namely ones in the US. 
*/
import java.util.Scanner;

public class MovingClockProject {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Clock clock = new Clock();
		Clock clock1 = new Clock();
		Clock clock2 = new Clock(12, 20, 30);
		
		System.out.println(clock.toString());
		
		System.out.println("\nCurrent Army Time in UTC:" + "\n" + clock1.getHour() + ":" + clock1.getMinute() + ":" + clock1.getSecond());
		
		System.out.println("\nCurrent Army Time in PDT:" + "\n" + (clock1.getHour() - 7) + ":" + clock1.getMinute() + ":" + clock1.getSecond());
		
		System.out.println("\nCurrent Army Time in MDT:" + "\n" + (clock1.getHour() - 6) + ":" + clock1.getMinute() + ":" + clock1.getSecond());
		
		System.out.println("\nCurrent Army Time in CDT:" + "\n" + (clock1.getHour() - 5) + ":" + clock1.getMinute() + ":" + clock1.getSecond());
		
		System.out.println("\nCurrent Army Time in EDT:" + "\n" + (clock1.getHour() - 4) + ":" + clock1.getMinute() + ":" + clock1.getSecond());
		
		System.out.println("\nYour Custom Clock in Army Time:" + "\n" + clock2.getHour() + ":" + clock2.getMinute() + ":" + clock2.getSecond());
	}
}