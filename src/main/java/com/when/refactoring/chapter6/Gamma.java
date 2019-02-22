package com.when.refactoring.chapter6;

/**
 * @author: when
 * @create: 2019-02-22  15:40
 **/
public class Gamma {
	private final ReplaceMethodWithMethodObject object;
	private int inputVal;
	private int quantity;
	private int yearToDate;
	private int importantVal1;
	private int importantVal2;
	private int importantVal3;

	public Gamma(ReplaceMethodWithMethodObject object, int inputVal, int quantity, int yearToDate) {
		this.object = object;
		this.inputVal = inputVal;
		this.quantity = quantity;
		this.yearToDate = yearToDate;
	}

	int compute() {
		importantVal1 = (inputVal * quantity) + object.delta();
		importantVal2 = (inputVal * yearToDate) + 100;
		importantThing();
		importantVal3 = importantVal2 * 7;
		return importantVal3 - 2 * importantVal1;
	}

	private void importantThing() {
		if ((yearToDate - importantVal1) > 100) {
			importantVal2 -= 70;
		}
	}
}
