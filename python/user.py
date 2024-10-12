class User:
    def __init__(self, user_id, name, email, phone_number, address, user_type):
        self.user_id = user_id
        self.name = name
        self.email = email
        self.phone_number = phone_number
        self.address = address
        self.user_type = user_type

    def register(self):
        print("User registered.")

    def login(self):
        print("User logged in.")

    def update_profile(self):
        print("User profile updated.")

    def view_services(self):
        print("Viewing available services.")

    def submit_feedback(self):
        print("Feedback submitted.")

