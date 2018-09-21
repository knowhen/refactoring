package com.when.refactoring.chapter1;

public abstract class Price {

	abstract int getPriceCode();

	abstract double getCharge(int daysRented);

	int getFrenquentRenterPoints(int daysRented) {
		return 1;
	}
}
