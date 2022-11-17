package com.perscholas.java_basics;

public class HomeClass {

	public static void main(String[] args) {
		int a = 3;
		int b = 10;
		double c = 3;
		double d = 10;
		double radius = 4;
		int x = 5;
		int y = 6;

		integerSum(a, b);
		doubleSum(c, d);
		diffTypeSum(b, d);
		intDivision(a, b);
		doubleDivision(c, d);
		printQ(x, y);
		calcCircumference(radius);
		totalOrder();
	}

	/**
	 * @param x
	 * @param y Takes in ints x and y and prints the sum
	 */
	public static void integerSum(int x, int y) {
		int sum = x + y;
		System.out.println(sum);
	}

	/**
	 * @param x
	 * @param y takes in doubles x and y and prints the sum
	 */
	public static void doubleSum(double x, double y) {
		double sum = x + y;
		System.out.println(sum);
	}

	/**
	 * @param x
	 * @param y Takes in an int and a double and produces a sum of type double
	 *          Prints the resulting sum
	 */
	public static void diffTypeSum(int x, double y) {
		double sum = x + y;
		System.out.println(sum);
	}

	/**
	 * @param x
	 * @param y Takes in ints x and y, compares to see which is larger Then prints
	 *          the quotient produced by dividing the larger integer by the smaller
	 *          integer If the larger number is changed to a decimal it needs to
	 *          declared as a double and quotient must be cast as a double as well.
	 */
	public static void intDivision(int x, int y) {
		double quotient;
		double a = 10.0;
		int b = 3;
		if (a > b) {
			quotient = a / b;
		} else {
			quotient = b / a;
		}
		System.out.println(quotient);
	}

	/**
	 * @param x
	 * @param y Takes in doubles x and y, compares to see which is larger Then
	 *          prints the quotient produced by dividing the larger double by the
	 *          smaller double
	 */
	public static void doubleDivision(double x, double y) {
		double quotient;
		if (x > y) {
			quotient = x / y;
		} else {
			quotient = y / x;
		}
		System.out.println(quotient);
		System.out.println("Integer: " + (int) quotient);
	}

	/**
	 * @param x
	 * @param y takes in x = 5. y = 6 assigns y /x to double q Casts y as a double
	 *          and stores to new variable then assigns to q q must be a double to
	 *          support both operations;
	 */
	public static void printQ(int x, int y) {
		double q;
		q = y / x;
		System.out.println("q: " + q);
		q = (double) y;
		System.out.println("Y as double: " + q);

	}

	/**
	 * @param r calculates circumference of a circle based on radius takes in the
	 *          radius and uses PI to calculate and print circumference
	 */
	public static void calcCircumference(double r) {
		final double PI = 3.14;
		double circumference;
		circumference = 2 * PI * r;
		System.out.println(circumference);
	}

	/**
	 * Instantiates three doubles and sales tax as the constant calculates subtotal
	 * based on number of items uses sales tax and subtotal to calculate total
	 * Uses Math.round to format with two decimal places
	 */
	public static void totalOrder() {
		double coffee = 2.99;
		double scones = 3.50;
		double matcha = 4.25;

		final double SALES_TAX = 8.875;

		double subtotal = (3 * coffee) + (4 * scones) + (2 * matcha);
		double totalSale = subtotal + ((subtotal * SALES_TAX) / 100);
		totalSale = Math.round(totalSale * 100);
		totalSale = totalSale/100;
		System.out.println("Total Sale: " + totalSale);

	}
}
