package paymentApplication;

public class SodexPayment implements IPayment{

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Sodex Card Payment Processed");
		return true;
	}

}
