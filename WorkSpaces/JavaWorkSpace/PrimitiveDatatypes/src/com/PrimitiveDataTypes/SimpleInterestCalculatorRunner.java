package com.PrimitiveDataTypes;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		SimpleInterestCalculator calc = new SimpleInterestCalculator("4500.00", "7.5");
		BigDecimal totalValue = calc.calculateTotalValue(5);
		System.out.println(totalValue);
	}
}
