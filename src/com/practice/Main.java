package com.practice;

@FunctionalInterface
interface car {
	public void bookcab(String Source, String Destination);
}
	public class Main {
		public static void main(String[] args) {
			car c =(Source,Destination)-> System.out.println("ola cab is booked " 
		+  Source + " to " + Destination);

			c.bookcab("puna", "bengaluru");
		}
	}


