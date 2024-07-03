package com.practice;

@FunctionalInterface
interface cab {
	public void bookcab();
}

public class Demo {
	public static void main(String[] args) {
		cab c = () -> System.out.println("cab is booked");

		c.bookcab();
	}
}
