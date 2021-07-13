package com.ideas.invoice.generator.runner;

import java.util.Scanner;

import com.ideas.invoice.generator.pojo.entity.CabinSeating;
import com.ideas.invoice.generator.pojo.entity.Conference;
import com.ideas.invoice.generator.pojo.entity.Meals;
import com.ideas.invoice.generator.pojo.entity.OpenSeating;

public class TestRunner {

	public static void main(String[] args) {

		System.out.println("***** Welcome to Zensio Coworking Invoice Generator *****");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Open Seats : ");

		int openSeats = sc.nextInt();

		System.out.println("Enter Cabin Seats : ");

		int cabinSeats = sc.nextInt();

		System.out.println("Hours For Conference Usage : ");

		int conferenceHours = sc.nextInt();

		System.out.println("Total Meals : ");

		int mealsCount = sc.nextInt();

		sc.close();

		System.out.println("***** Invoice Generated As Below *****");

		OpenSeating openSeating = new OpenSeating(openSeats);
		openSeating.generateInvoice();
		System.out.println(openSeats + " Open Seats : " + (openSeating.getAmount() + openSeating.getGstAmount()));

		CabinSeating cabinSeating = new CabinSeating(cabinSeats);
		cabinSeating.generateInvoice();
		System.out.println(cabinSeats + " Cabin Seats : " + (cabinSeating.getAmount() + cabinSeating.getGstAmount()));

		int hoursTobeCalculated = conferenceHours - (openSeats * 5 + cabinSeats * 10);
		Conference conference = new Conference(hoursTobeCalculated);
		conference.generateInvoice();
		System.out.println(conferenceHours + " hours of Conference Room Usage : "
				+ (conference.getAmount() + conference.getGstAmount()));

		Meals meals = new Meals(mealsCount);
		meals.generateInvoice();
		System.out.println(mealsCount + " Meals : " + (meals.getAmount() + meals.getGstAmount()));

		System.out.println("Total : " + (openSeating.getAmount() + openSeating.getGstAmount() + cabinSeating.getAmount()
				+ cabinSeating.getGstAmount() + conference.getAmount() + conference.getGstAmount() + meals.getAmount()
				+ meals.getGstAmount()));

		System.out.println("Total GST: " + (openSeating.getGstAmount() + cabinSeating.getGstAmount()
				+ conference.getGstAmount() + meals.getGstAmount()));

	}

}
