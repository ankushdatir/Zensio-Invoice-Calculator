package com.ideas.invoice.generator.pojo.entity;

import com.ideas.invoice.generator.interfaces.Seating;

public class Conference implements Seating {

	private static final int PRICE = 200;
	private static final double GST_PERCENTAGE = 0.18;

	private double amount;

	private double gstAmount;

	private int remainingHours;

	public Conference(int remainingHours) {
		this.remainingHours = remainingHours;
	}

	public void generateInvoice() {

		if (remainingHours > 0) {
			amount = calculateAmountWithoutGst(remainingHours, PRICE);
			gstAmount = calculateGstAmount(amount, GST_PERCENTAGE);
		}
	}

	public double getAmount() {
		return amount;
	}

	public double getGstAmount() {
		return gstAmount;
	}

}
