public class Payment {
    private int paymentId;
    private int applicationId;
    private double amount;
    private String paymentDate;
    private String paymentStatus;

    // Constructor
    public Payment(int paymentId, int applicationId, double amount, String paymentDate, String paymentStatus) {
        this.paymentId = paymentId;
        this.applicationId = applicationId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentStatus = paymentStatus;
    }

    // Methods
    public void makePayment() {
        System.out.println("Payment made.");
    }

    public void getPaymentStatus() {
        System.out.println("Payment status: " + paymentStatus);
    }

    public void generateReceipt() {
        System.out.println("Receipt generated.");
    }
}
