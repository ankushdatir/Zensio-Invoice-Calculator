package com.ideas.invoice.generator.interfaces;

public interface Seating {

	default double calculateAmountWithoutGst(int seats, int price) {
		return seats * price;
	}

	default double calculateGstAmount(double totalAmount, double gst) {
		return totalAmount * gst;
	}
}