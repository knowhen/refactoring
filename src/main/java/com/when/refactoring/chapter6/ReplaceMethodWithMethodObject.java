package com.when.refactoring.chapter6;

/**
 * @author: when
 * @create: 2019-02-22  15:36
 * <p>
 * 以函数对象取代函数
 **/
public class ReplaceMethodWithMethodObject {

	int gamma(int inputVal, int quantity, int yearToDate) {
		return new Gamma(this, inputVal, quantity, yearToDate).compute();
	}

	int delta() {
		return 10;
	}

}
