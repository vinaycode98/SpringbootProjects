package com.predicate;

import java.util.function.Predicate;

public class Demo1 {
	public static void main(String[] args) {
//		Predicate<Integer> p = i -> (i > 10);
//		System.out.println(p.test(20));
//		System.out.println(p.test(2));
//		Predicate<String> t = s -> (s.length() >4);
//
//
////		System.out.println(t.test("hellosghjks"));
//		String name[] = { "vinayak", "vijay", "vinod", "veera","ram" ,"rtyu"};
//		for (String names : name) {
//			if (t.test(names)) {
//				System.out.println(name);
		String name[] = { "vinayak", "vijay", "vinod", "veera", "ram", "rtyu" };
		Predicate<String> t = s -> (s.length() > 3);

		for (String names : name) {
		    if (t.test(names)) {
		        System.out.println(names);
		    
			}

		}

	}
}
