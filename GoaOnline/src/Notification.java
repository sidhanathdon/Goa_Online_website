public class Notification {
    private int notificationId;
    private int userId;
    private String message;
    private String date;
    private String status;

    // Constructor
    public Notification(int notificationId, int userId, String message, String date, String status) {
        this.notificationId = notificationId;
        this.userId = userId;
        this.message = message;
        this.date = date;
        this.status = status;
    }

    // Methods
    public void sendNotification(int userId, String message) {
        System.out.println("Notification sent to user ID: " + userId);
    }

    public void markAsRead(int notificationId) {
        System.out.println("Notification ID " + notificationId + " marked as read.");
    }

    public void getNotifications(int userId) {
        System.out.println("Getting notifications for user ID: " + userId);
    }
}
