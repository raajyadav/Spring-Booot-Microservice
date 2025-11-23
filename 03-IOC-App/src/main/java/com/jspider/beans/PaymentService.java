package com.jspider.beans;

public class PaymentService {

	private IPayment payment;
	
	public PaymentService() {
		System.out.println("Default-Constructor");
	}
	
	public PaymentService(IPayment payment) {
		this.payment=payment;
	}
	
	public void doPayment(double billAmount) {
		
		boolean status = payment.processPayment(billAmount);
		if(status) {
			System.out.println("Recipt Printing....");
		}else {
			System.out.println("Card Decline... ");
		}
	}
}
