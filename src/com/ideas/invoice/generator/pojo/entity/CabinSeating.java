package com.ideas.invoice.generator.pojo.entity;

import com.ideas.invoice.generator.interfaces.Seating;

public class CabinSeating implements Seating {

	private static final int PRICE = 10000;
	private static final double GST_PERCENTAGE = 0.18;

	private double amount;

	private double gstAmount;

	private int seats;

	public CabinSeating(int seats) {
		this.seats = seats;
	}

	public void generateInvoice() {
		amount = calculateAmountWithoutGst(seats, PRICE);
		gstAmount = calculateGstAmount(amount, GST_PERCENTAGE);
	}

	public double getAmount() {
		return amount;
	}

	public double getGstAmount() {
		return gstAmount;
	}

}
