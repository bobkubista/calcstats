package com.bobkubista.calcstats;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalcStatsTest {

	@Test()
	public void testEmptyArray() {
		StatsCalc calc = new StatsCalc();
		int array[] = {};
		calc.calculate(array);
		assertCalc(calc, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
	}

	@Test
	public void testSingletonArray() {
		StatsCalc calc = new StatsCalc();
		int array[] = { 0 };
		calc.calculate(array);
		assertCalc(calc, 0, 0, 0, 1);
	}

	@Test
	public void testSingletonMinValue() {
		StatsCalc calc = new StatsCalc();
		int array[] = { Integer.MIN_VALUE };
		calc.calculate(array);
		assertCalc(calc, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 1);
	}

	@Test
	public void testSingletonMaxValue() {
		StatsCalc calc = new StatsCalc();
		int array[] = { Integer.MAX_VALUE };
		calc.calculate(array);
		assertCalc(calc, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 1);
	}

	@Test
	public void testTwoElementList() {
		StatsCalc calc = new StatsCalc();
		int array[] = { 1, 3 };
		calc.calculate(array);
		assertCalc(calc, 1, 3, 2, 2);
	}

	@Test
	public void testTwoElementListReversed() {
		StatsCalc calc = new StatsCalc();
		int array[] = { 3, 1 };
		calc.calculate(array);
		assertCalc(calc, 1, 3, 2, 2);
	}

	private void assertCalc(StatsCalc calc, int min, int max, double avg, int length) {
		assertEquals(min, calc.getMinimum());
		assertEquals(max, calc.getMaximum());
		assertEquals(avg, calc.getAverage());
		assertEquals(length, calc.amountOfItems());
	}

	@Test
	public void testLargeList() {
		StatsCalc calc = new StatsCalc();
		int array[] = { 6, 9, 15, -2, 92, 11 };
		calc.calculate(array);
		assertCalc(calc, -2, 92, 21.833333333333332, 6);
	}
}
