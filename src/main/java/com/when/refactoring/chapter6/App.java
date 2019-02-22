package com.when.refactoring.chapter6;

/**
 * @author: when
 * @create: 2019-02-22  15:32
 **/
public class App {
	public static void main(String[] args) {
		int x = 5;
		triple(x);
		System.out.println(x);
	}

	private static void triple(int x) {
		x = x * 3;
		System.out.println(x);
	}


}
