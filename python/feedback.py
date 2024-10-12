class Feedback:
    def __init__(self, feedback_id, user_id, message, date, response):
        self.feedback_id = feedback_id
        self.user_id = user_id
        self.message = message
        self.date = date
        self.response = response

    def submit_feedback(self, user_id, message):
        print(f"Feedback submitted by user ID: {user_id}")

    def view_feedback(self, feedback_id):
        print(f"Viewing feedback ID: {feedback_id}")

    def response_to_feedback(self, feedback_id, response):
        print(f"Responded to feedback ID {feedback_id}")

