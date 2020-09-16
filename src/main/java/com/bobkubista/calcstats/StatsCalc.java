package com.bobkubista.calcstats;

import java.util.stream.IntStream;

public class StatsCalc {

	private int minimum = Integer.MIN_VALUE;
	private int maximum = Integer.MAX_VALUE;
	private double average = 0;
	private int amount = 0;

	public void calculate(int[] array) {
		minimum = calcMin(array);
		maximum = calcMax(array);
		average = calcAverage(array);
		amount = array.length;
	}

	private int calcMin(int[] array) {
		return IntStream.of(array).min().orElse(Integer.MIN_VALUE);
	}

	private double calcAverage(int[] array) {
		return IntStream.of(array).average().orElse(0d);
	}

	private int calcMax(int[] array) {
		return IntStream.of(array).max().orElse(Integer.MAX_VALUE);
	}

	public int getMinimum() {
		return minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public double getAverage() {
		return average;
	}

	public Integer amountOfItems() {
		return amount;
	}

}
