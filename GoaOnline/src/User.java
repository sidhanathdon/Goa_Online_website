public class User {
    private int userId;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String userType;

    // Constructor
    public User(int userId, String name, String email, String phoneNumber, String address, String userType) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.userType = userType;
    }

    // Encapsulation: Getters and Setters
    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getUserType() { return userType; }
    public void setUserType(String userType) { this.userType = userType; }

    // Methods
    public void register() {
        System.out.println("User registered.");
    }

    public void login() {
        System.out.println("User logged in.");
    }

    public void updateProfile() {
        System.out.println("User profile updated.");
    }

    public void viewServices() {
        System.out.println("Viewing available services.");
    }

    public void submitFeedback() {
        System.out.println("Feedback submitted.");
    }
}
