package paymentApplication;

public class DebitCardPayment implements IPayment{

	@Override
	public boolean processPayment(double billAmt) {
		 System.out.println("Debit Card Payment Processed");
		return true;
	}

}
