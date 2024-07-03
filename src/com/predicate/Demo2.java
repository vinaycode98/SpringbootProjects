package com.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employe {
	String employeName;
	double Salary;
	int Experieance;

	Employe(String Name, double Sal, int Exp) {

		employeName = Name;
		Salary = Sal;
		Experieance = Exp;
	}

}

public class Demo2 {

	public static void main(String[] args) {
//		Employe emp = new Employe("vinayak", 50000, 5);
//		Predicate<Employe> pr = e -> (e.Salary > 30000 && e.Experieance > 3);
//		System.out.println(pr.test(emp));

		ArrayList<Employe> al = new ArrayList<Employe>();
		al.add(new Employe("jhon", 50000, 4));
		al.add(new Employe("scoot", 5000, 5));
		al.add(new Employe("jai", 20000, 4));
		al.add(new Employe("jhons", 30000, 5));
		al.add(new Employe("jram", 40000, 3));
		al.add(new Employe("vinay", 90000, 6));
		al.add(new Employe("helo", 100000, 10));
		for (Employe e : al) {
//			if(pr.test(e))
			if (e.Salary > 30000 && e.Experieance > 3) {
				System.out.println(e.employeName + " " + e.Salary);
			}

		}

	}

}
