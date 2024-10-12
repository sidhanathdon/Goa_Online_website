class Notification:
    def __init__(self, notification_id, user_id, message, date, status):
        self.notification_id = notification_id
        self.user_id = user_id
        self.message = message
        self.date = date
        self.status = status

    def send_notification(self, user_id, message):
        print(f"Notification sent to user ID: {user_id}")

    def mark_as_read(self, notification_id):
        print(f"Notification ID {notification_id} marked as read.")

    def get_notifications(self, user_id):
        print(f"Getting notifications for user ID: {user_id}")

