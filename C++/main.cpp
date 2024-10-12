#include <iostream>
#include <string>
#include <vector>
using namespace std;

// User class
class User {
private:
    int userId;
    string name, email, phoneNumber, address, userType;

public:
    // Constructor
    User(int userId, string name, string email, string phoneNumber, string address, string userType) {
        this->userId = userId;
        this->name = name;
        this->email = email;
        this->phoneNumber = phoneNumber;
        this->address = address;
        this->userType = userType;
    }

    // Methods
    void registerUser() {
        cout << "User registered." << endl;
    }

    void login() {
        cout << "User logged in." << endl;
    }

    void updateProfile() {
        cout << "User profile updated." << endl;
    }

    void viewServices() {
        cout << "Viewing available services." << endl;
    }

    void submitFeedback() {
        cout << "Feedback submitted." << endl;
    }
};

// Service class
class Service {
private:
    int serviceId;
    string serviceName, description;
    int departmentId;
    double fee;
    vector<string> requiredDocuments;

public:
    // Constructor
    Service(int serviceId, string serviceName, string description, int departmentId, double fee, vector<string> requiredDocuments) {
        this->serviceId = serviceId;
        this->serviceName = serviceName;
        this->description = description;
        this->departmentId = departmentId;
        this->fee = fee;
        this->requiredDocuments = requiredDocuments;
    }

    // Methods
    void listAllServices() {
        cout << "Listing all services..." << endl;
    }

    void getServiceDetails(int serviceId) {
        cout << "Getting details of service ID: " << serviceId << endl;
    }

    double calculateFee() {
        return fee;
    }
};

// Application class inheriting from User
class Application : public User {
private:
    int applicationId, serviceId;
    string applicationDate, status;
    vector<string> documents;

public:
    // Constructor
    Application(int userId, string name, string email, string phoneNumber, string address, string userType, int applicationId, int serviceId, string applicationDate, string status, vector<string> documents)
        : User(userId, name, email, phoneNumber, address, userType) {
        this->applicationId = applicationId;
        this->serviceId = serviceId;
        this->applicationDate = applicationDate;
        this->status = status;
        this->documents = documents;
    }

    // Methods
    void submitApplication() {
        cout << "Application submitted." << endl;
    }

    void submitApplication(int serviceId) {
        cout << "Application for service ID " << serviceId << " submitted." << endl;
    }

    void checkStatus() {
        cout << "Checking application status: " << status << endl;
    }

    void uploadDocuments(vector<string> docs) {
        documents = docs;
        cout << "Documents uploaded." << endl;
    }

    void editApplication() {
        cout << "Application edited." << endl;
    }
};

// Payment class
class Payment {
private:
    int paymentId, applicationId;
    double amount;
    string paymentDate, paymentStatus;

public:
    // Constructor
    Payment(int paymentId, int applicationId, double amount, string paymentDate, string paymentStatus) {
        this->paymentId = paymentId;
        this->applicationId = applicationId;
        this->amount = amount;
        this->paymentDate = paymentDate;
        this->paymentStatus = paymentStatus;
    }

    // Methods
    void makePayment() {
        cout << "Payment made." << endl;
    }

    void getPaymentStatus() {
        cout << "Payment status: " << paymentStatus << endl;
    }

    void generateReceipt() {
        cout << "Receipt generated." << endl;
    }
};

// Document class
class Document {
private:
    int documentId, applicationId;
    string documentType, documentPath;

public:
    // Constructor
    Document(int documentId, string documentType, string documentPath, int applicationId) {
        this->documentId = documentId;
        this->documentType = documentType;
        this->documentPath = documentPath;
        this->applicationId = applicationId;
    }

    // Methods
    void uploadDocument() {
        cout << "Document uploaded." << endl;
    }

    void downloadDocument(int documentId) {
        cout << "Document with ID " << documentId << " downloaded." << endl;
    }

    void validateDocument() {
        cout << "Document validated." << endl;
    }
};

// Department class
class Department {
private:
    int departmentId;
    string departmentName, contactInfo;

public:
    // Constructor
    Department(int departmentId, string departmentName, string contactInfo) {
        this->departmentId = departmentId;
        this->departmentName = departmentName;
        this->contactInfo = contactInfo;
    }

    // Methods
    void listDepartments() {
        cout << "Listing all departments." << endl;
    }

    void getDepartmentInfo(int departmentId) {
        cout << "Information of department ID: " << departmentId << endl;
    }
};

// Notification class
class Notification {
private:
    int notificationId, userId;
    string message, date, status;

public:
    // Constructor
    Notification(int notificationId, int userId, string message, string date, string status) {
        this->notificationId = notificationId;
        this->userId = userId;
        this->message = message;
        this->date = date;
        this->status = status;
    }

    // Methods
    void sendNotification(int userId, string message) {
        cout << "Notification sent to user ID: " << userId << endl;
    }

    void markAsRead(int notificationId) {
        cout << "Notification ID " << notificationId << " marked as read." << endl;
    }

    void getNotifications(int userId) {
        cout << "Getting notifications for user ID: " << userId << endl;
    }
};

// Feedback class
class Feedback {
private:
    int feedbackId, userId;
    string message, date, response;

public:
    // Constructor
    Feedback(int feedbackId, int userId, string message, string date, string response) {
        this->feedbackId = feedbackId;
        this->userId = userId;
        this->message = message;
        this->date = date;
        this->response = response;
    }

    // Methods
    void submitFeedback(int userId, string message) {
        cout << "Feedback submitted by user ID: " << userId << endl;
    }

    void viewFeedback(int feedbackId) {
        cout << "Viewing feedback ID: " << feedbackId << endl;
    }

    void responseToFeedback(int feedbackId, string response) {
        cout << "Responded to feedback ID " << feedbackId << endl;
    }
};

// Main function
int main() {
    // Creating a User object (based on dummy data)
    User user(101, "Rajesh Kumar", "rajesh.kumar@example.com", "1234567890", "Goa, India", "Citizen");
    user.registerUser();
    user.login();
    user.updateProfile();
    user.viewServices();

    // Creating a Service object (based on dummy data)
    vector<string> requiredDocs = { "Proof of Birth" };
    Service service(201, "Birth Certificate Issuance", "Issuance of Birth Certificate", 301, 100.0, requiredDocs);
    service.listAllServices();
    service.getServiceDetails(201);
    cout << "Service Fee: " << service.calculateFee() << endl;

    // Creating an Application object (based on dummy data)
    vector<string> documents = { "Proof of Birth" };
    Application application(101, "Rajesh Kumar", "rajesh.kumar@example.com", "1234567890", "Goa, India", "Citizen",
                            301, 201, "2024-10-05", "Pending", documents);
    application.submitApplication();
    application.checkStatus();
    application.uploadDocuments(documents);
    application.editApplication();

    // Creating a Payment object (based on dummy data)
    Payment payment(401, 301, 100.0, "2024-10-05", "Completed");
    payment.makePayment();
    payment.getPaymentStatus();
    payment.generateReceipt();

    // Creating a Document object (based on dummy data)
    Document document(501, "Proof of Birth", "/documents/proof_of_birth.pdf", 301);
    document.uploadDocument();
    document.downloadDocument(501);
    document.validateDocument();

    // Creating a Department object (based on dummy data)
    Department department(301, "Civil Registration", "contact@civildept.gov.in");
    department.listDepartments();
    department.getDepartmentInfo(301);

    // Creating a Notification object (based on dummy data)
    Notification notification(601, 101, "Your birth certificate application is pending", "2024-10-05", "Unread");
    notification.sendNotification(101, "Your birth certificate application is pending.");
    notification.markAsRead(601);
    notification.getNotifications(101);

    // Creating a Feedback object (based on dummy data)
    Feedback feedback(701, 101, "The process was efficient", "2024-10-05", "No response yet");
}
