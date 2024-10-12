class Department:
    def __init__(self, department_id, department_name, contact_info):
        self.department_id = department_id
        self.department_name = department_name
        self.contact_info = contact_info

    def list_departments(self):
        print("Listing all departments.")

    def get_department_info(self, department_id):
        print(f"Information of department ID: {department_id}")

