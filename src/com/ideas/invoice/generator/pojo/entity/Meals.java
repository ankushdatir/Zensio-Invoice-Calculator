package com.ideas.invoice.generator.pojo.entity;

import com.ideas.invoice.generator.interfaces.Seating;

public class Meals implements Seating {

	private static final int PRICE = 100;
	private static final double GST_PERCENTAGE = 0.12;

	private double amount;

	private double gstAmount;

	private int mealsCount;

	public Meals(int mealsCount) {
		this.mealsCount = mealsCount;
	}

	public void generateInvoice() {
		amount = calculateAmountWithoutGst(mealsCount, PRICE);
		gstAmount = calculateGstAmount(amount, GST_PERCENTAGE);
	}

	public double getAmount() {
		return amount;
	}

	public double getGstAmount() {
		return gstAmount;
	}
}
