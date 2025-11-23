package paymentApplication;

public class App {

	public static void main(String[] args) {
		IPayment p = new CreditCardPayment();
		PaymentService paymentService = new PaymentService(p);
//		PaymentService paymentService = new PaymentService(new CreditCardPayment()); this is also right method
		paymentService.doPayment(1255);
	}
}
