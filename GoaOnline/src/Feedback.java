public class Feedback {
    private int feedbackId;
    private int userId;
    private String message;
    private String date;
    private String response;

    // Constructor
    public Feedback(int feedbackId, int userId, String message, String date, String response) {
        this.feedbackId = feedbackId;
        this.userId = userId;
        this.message = message;
        this.date = date;
        this.response = response;
    }

    // Methods
    public void submitFeedback(int userId, String message) {
        System.out.println("Feedback submitted by user ID: " + userId);
    }

    public void viewFeedback(int feedbackId) {
        System.out.println("Viewing feedback ID: " + feedbackId);
    }

    public void responseToFeedback(int feedbackId, String response) {
        System.out.println("Responded to feedback ID " + feedbackId);
    }
}
