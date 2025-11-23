package com.jspider.beans;

public class DebitCardPayment implements IPayment{

	@Override
	public boolean processPayment(double billAmount) {
            System.out.println("DebitCard Payment Successfull");
		return false;
	}

}
