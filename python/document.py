class Document:
    def __init__(self, document_id, document_type, document_path, application_id):
        self.document_id = document_id
        self.document_type = document_type
        self.document_path = document_path
        self.application_id = application_id

    def upload_document(self):
        print("Document uploaded.")

    def download_document(self, document_id):
        print(f"Document with ID {document_id} downloaded.")

    def validate_document(self):
        print("Document validated.")

