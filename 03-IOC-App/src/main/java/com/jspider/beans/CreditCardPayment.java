package com.jspider.beans;

public class CreditCardPayment implements IPayment{

	@Override
	public boolean processPayment(double billAmount) {
		System.out.println("Credit Card Payment Successfull");
		return true;
	}

}
