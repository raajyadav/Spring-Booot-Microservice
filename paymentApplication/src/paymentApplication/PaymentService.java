package paymentApplication;

public class PaymentService {

	private IPayment payments;
	
	PaymentService(IPayment payments){
		this.payments=payments;
	}
	public void doPayment(double billAmt) {
		boolean status = payments.processPayment(billAmt);
		if(status) {
			System.out.println("Printing recipit");
			System.out.println("Total amount is: "+billAmt);
		}else {
			System.out.println("Payment Decline");
		}
	}
}
