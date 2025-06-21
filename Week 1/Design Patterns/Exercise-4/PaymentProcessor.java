public interface PaymentProcessor {
    void processPayment(double amount);
}

class OldGateway {
    public void makePayment(double amt) {
        System.out.println("Payment made using Old Gateway: " + amt);
    }
}

class OldGatewayAdapter implements PaymentProcessor {
    private OldGateway oldGateway = new OldGateway();

    public void processPayment(double amount) {
        oldGateway.makePayment(amount);
    }
}

class AdapterTest {
    public static void main(String[] args) {
        PaymentProcessor processor = new OldGatewayAdapter();
        processor.processPayment(1500.0);
    }
}