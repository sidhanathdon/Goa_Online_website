public class Service {
    int serviceId;
    private String serviceName;
    private String description;
    private int departmentId;
    private double fee;
    private String[] requiredDocuments;

    // Constructor
    public Service(int serviceId, String serviceName, String description, int departmentId, double fee, String[] requiredDocuments) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.description = description;
        this.departmentId = departmentId;
        this.fee = fee;
        this.requiredDocuments = requiredDocuments;
    }

    // Methods
    public void listAllServices() {
        System.out.println("Listing all services...");
    }

    public void getServiceDetails(int serviceId) {
        System.out.println("Getting details of service ID: " + serviceId);
    }

    public double calculateFee() {
        return fee;
    }

    public int getServiceId() {
        // TODO Auto-generated method stub
        return this.serviceId;
    }
}
