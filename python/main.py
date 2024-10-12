from user import User
from service import Service
from application import Application
from payment import Payment
from document import Document
from department import Department
from notification import Notification
from feedback import Feedback

if __name__ == "__main__":
    # Creating a User object
    user = User(
        user_id=101,
        name="Rajesh Kumar",
        email="rajesh.kumar@example.com",
        phone_number="1234567890",
        address="Goa, India",
        user_type="Citizen"
    )
    user.register()
    user.login()
    user.update_profile()
    user.view_services()

    # Creating a Service object
    service = Service(
        service_id=201,
        service_name="Birth Certificate Issuance",
        description="Issuance of Birth Certificate",
        department_id=301,
        fee=100.0,
        required_documents=["Proof of Birth"]
    )
    service.list_all_services()
    service.get_service_details(201)
    print("Service Fee:", service.calculate_fee())

    # Creating an Application object
    documents = ["Proof of Birth"]
    application = Application(
        user_id=101,
        name="Rajesh Kumar",
        email="rajesh.kumar@example.com",
        phone_number="1234567890",
        address="Goa, India",
        user_type="Citizen",
        application_id=301,
        service_id=201,
        application_date="2024-10-05",
        status="Pending",
        documents=documents
    )
    application.submit_application()
    application.check_status()
    application.upload_documents(documents)
    application.edit_application()

    # Creating a Payment object
    payment = Payment(
        payment_id=401,
        application_id=301,
        amount=100.0,
        payment_date="2024-10-05",
        payment_status="Completed"
    )
    payment.make_payment()
    payment.get_payment_status()
    payment.generate_receipt()

    # Creating a Document object
    document = Document(
        document_id=501,
        document_type="Proof of Birth",
        document_path="/documents/proof_of_birth.pdf",
        application_id=301
    )
    document.upload_document()
    document.download_document(501)
    document.validate_document()

    # Creating a Department object
    department = Department(
        department_id=301,
        department_name="Civil Registration",
        contact_info="contact@civildept.gov.in"
    )
    department.list_departments()
    department.get_department_info(301)

    # Creating a Notification object
    notification = Notification(
        notification_id=601,
        user_id=101,
        message="Your birth certificate application is pending",
        date="2024-10-05",
        status="Unread"
    )
    notification.send_notification(101, "Your birth certificate application is pending.")
    notification.mark_as_read(601)
    notification.get_notifications(101)

    # Creating a Feedback object
    feedback = Feedback(
        feedback_id=701,
        user_id=101,
        message="The process was efficient",
        date="2024-10-05",
        response="No response yet"
    )
    feedback.submit_feedback(101, "The process was efficient")
    feedback.view_feedback(701)
    feedback.response_to_feedback(701, "Thank you for your feedback.")

