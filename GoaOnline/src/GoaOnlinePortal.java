public class GoaOnlinePortal {

    public static void main(String[] args) {
        // Creating a User object (based on dummy data: userId = 101, name = Rajesh Kumar)
        User user = new User(101, "Rajesh Kumar", "rajesh.kumar@example.com", "1234567890", "Goa, India", "Citizen");
        user.register();
        user.login();
        user.updateProfile();
        user.viewServices();

        // Creating a Service object (based on dummy data: serviceId = 201, serviceName = Birth certificate Issuance)
        Service service = new Service(201, "Birth Certificate Issuance", "Issuance of Birth Certificate", 301, 100.0, new String[] {"Proof of Birth"});
        service.listAllServices();
        service.getServiceDetails(201);
        System.out.println("Service Fee: " + service.calculateFee());

        // Creating an Application object (based on dummy data: applicationId = 301)
        String[] documents = {"Proof of Birth"};
        Application application = new Application(101, "Rajesh Kumar", "rajesh.kumar@example.com", "1234567890", "Goa, India", "Citizen",
            301, 201, "2024-10-05", "Pending", documents);
        application.submitApplication();
        application.checkStatus();
        application.uploadDocuments(documents);
        application.editApplication();

        // Creating a Payment object (based on dummy data: paymentId = 401, amount = 100.0)
        Payment payment = new Payment(401, 301, 100.0, "2024-10-05", "Completed");
        payment.makePayment();
        payment.getPaymentStatus();
        payment.generateReceipt();

        // Creating a Document object (based on dummy data: documentId = 501, documentType = Proof of Birth)
        Document document = new Document(501, "Proof of Birth", "/documents/proof_of_birth.pdf", 301);
        document.uploadDocument();
        document.downloadDocument(501);
        document.validateDocument();

        // Creating a Department object (based on dummy data: departmentId = 301, departmentName = Civil Registration)
        Department department = new Department(301, "Civil Registration", "contact@civildept.gov.in");
        department.listDepartments();
        department.getDepartmentInfo(301);

        // Creating a Notification object (based on dummy data: notificationId = 601, userId = 101, message = Your birth certificate application is pending)
        Notification notification = new Notification(601, 101, "Your birth certificate application is pending", "2024-10-05", "Unread");
        notification.sendNotification(101, "Your birth certificate application is pending.");
        notification.markAsRead(601);
        notification.getNotifications(101);

        // Creating a Feedback object (based on dummy data: feedbackId = 701, userId = 101, message = The process was efficient)
        Feedback feedback = new Feedback(701, 101, "The process was efficient", "2024-10-05", "No response yet");
        feedback.submitFeedback(101, "The process was efficient");
        feedback.viewFeedback(701);
        feedback.responseToFeedback(701, "Thank you for your feedback.");
    }
}
