public class Application extends User {
    int applicationId;
    private int serviceId;
    private String applicationDate;
    private String status;
    private String[] documents;

    // Constructor
    public Application(int userId, String name, String email, String phoneNumber, String address, String userType,
                        int applicationId, int serviceId, String applicationDate, String status, String[] documents) {
        super(userId, name, email, phoneNumber, address, userType);
        this.applicationId = applicationId;
        this.serviceId = serviceId;
        this.applicationDate = applicationDate;
        this.status = status;
        this.documents = documents;
    }

    // Overloaded method
    public void submitApplication() {
        System.out.println("Application submitted.");
    }

    // Overloaded method with parameters
    public void submitApplication(int serviceId) {
        System.out.println("Application for service ID " + serviceId + " submitted.");
    }

    public void checkStatus() {
        System.out.println("Checking application status: " + status);
    }

    public void uploadDocuments(String[] docs) {
        this.documents = docs;
        System.out.println("Documents uploaded.");
    }

    public void editApplication() {
        System.out.println("Application edited.");
    }

    public int getApplicationId() {
        // TODO Auto-generated method stub
        return this.applicationId;
    }
}
