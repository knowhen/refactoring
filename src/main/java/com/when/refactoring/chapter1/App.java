package com.when.refactoring.chapter1;

public class App {
	public static void main(String[] args) {
		Customer customer = new Customer("呵呵");
		for (int i = 0; i < 3; i++) {
			Movie movie = new Movie("片名", i);
			Rental rental = new Rental(movie, i);
			customer.addRental(rental);
		}
		System.out.println(customer.statement());
	}
	
}
