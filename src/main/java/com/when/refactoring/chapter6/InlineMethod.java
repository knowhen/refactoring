package com.when.refactoring.chapter6;

/**
 * @author: when
 * @create: 2019-02-22  14:06
 **/
public class InlineMethod {
	public static void main(String[] args) {
		InlineMethod inlineMethod = new InlineMethod();
		System.out.println(inlineMethod.getRating());
		System.out.println(inlineMethod.getRatingV2());
	}

	private int numberOfLateDelivers = 10;

	int getRating() {
		return (moreThanFiveLateDelivers()) ? 2 : 1;
	}

	boolean moreThanFiveLateDelivers() {
		return numberOfLateDelivers > 5;
	}

	/***************************
	 ******** Refactor **********
	 ****************************/

	int getRatingV2() {
		return (numberOfLateDelivers > 5) ? 2 : 1;
	}
}
