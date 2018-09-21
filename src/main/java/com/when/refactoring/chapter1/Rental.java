package com.when.refactoring.chapter1;

/**
 * 顾客租赁一部影片
 * 
 * @author when
 *
 */
public class Rental {

	private Movie movie;
	private int daysRented;

	public Rental(Movie movie, int daysRented) {
		super();
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public int getDaysRented() {
		return daysRented;
	}

}
