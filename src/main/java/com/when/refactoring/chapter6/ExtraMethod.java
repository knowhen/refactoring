package com.when.refactoring.chapter6;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author: when
 * @create: 2019-02-22  11:34
 **/
public class ExtraMethod {
	public static void main(String[] args) {
		ExtraMethod method = new ExtraMethod();
		method.printOwing();
		method.printOwingV2();
		method.printOwingV3(1);
	}

	private static Vector order;

	/**
	 * Init data
	 */
	static {
		order = new Vector();
		for (int i = 0; i < 5; i++) {
			order.add(i);
		}
	}

	/***************************
	 ******** Refactor **********
	 ****************************/
	void printOwing() {
		Enumeration e = order.elements();
		double outstanding = 0.0;

		// print banner
		System.out.println("***************************");
		System.out.println("***** Customer owners  *****");
		System.out.println("***************************");

		// calculate outstanding
		while (e.hasMoreElements()) {
			int each = (int) e.nextElement();
			outstanding += each;
		}

		// print details
		System.out.println("name: ");
		System.out.println("amount: " + outstanding);
	}

	void printOwingV2() {
		printBanner();
		double outstanding = getOutstanding();
		printDetails(outstanding);
	}

	double getOutstanding() {
		Enumeration e = order.elements();
		double outstanding = 0.0;
		while (e.hasMoreElements()) {
			int each = (int) e.nextElement();
			outstanding += each;
		}
		return outstanding;
	}

	void printBanner() {
		System.out.println("***************************");
		System.out.println("***** Customer owners  *****");
		System.out.println("***************************");
	}

	void printDetails(double outstanding) {
		System.out.println("name: ");
		System.out.println("amount: " + outstanding);
	}

	/***************************
	 ******** Refactor **********
	 ****************************/

	void printOwingV3(double previousAmount) {
		printBanner();
		double outstanding = getOutstanding(previousAmount * 1.2);
		printDetails(outstanding);
	}

	double getOutstanding(double initialValue) {
		double result = initialValue;
		Enumeration e = order.elements();
		while (e.hasMoreElements()) {
			int each = (int) e.nextElement();
			result += each;
		}
		return result;
	}
}
