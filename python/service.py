class Service:
    def __init__(self, service_id, service_name, description, department_id, fee, required_documents):
        self.service_id = service_id
        self.service_name = service_name
        self.description = description
        self.department_id = department_id
        self.fee = fee
        self.required_documents = required_documents

    def list_all_services(self):
        print("Listing all services...")

    def get_service_details(self, service_id):
        print(f"Getting details of service ID: {service_id}")

    def calculate_fee(self):
        return self.fee

