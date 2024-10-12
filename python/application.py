from user import User

class Application(User):
    def __init__(self, user_id, name, email, phone_number, address, user_type,
                 application_id, service_id, application_date, status, documents):
        super().__init__(user_id, name, email, phone_number, address, user_type)
        self.application_id = application_id
        self.service_id = service_id
        self.application_date = application_date
        self.status = status
        self.documents = documents

    def submit_application(self, service_id=None):
        if service_id:
            print(f"Application for service ID {service_id} submitted.")
        else:
            print("Application submitted.")

    def check_status(self):
        print(f"Checking application status: {self.status}")

    def upload_documents(self, docs):
        self.documents = docs
        print("Documents uploaded.")

    def edit_application(self):
        print("Application edited.")

