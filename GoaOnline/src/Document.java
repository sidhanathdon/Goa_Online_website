public class Document {
    private int documentId;
    private String documentType;
    private String documentPath;
    private int applicationId;

    // Constructor
    public Document(int documentId, String documentType, String documentPath, int applicationId) {
        this.documentId = documentId;
        this.documentType = documentType;
        this.documentPath = documentPath;
        this.applicationId = applicationId;
    }

    // Methods
    public void uploadDocument() {
        System.out.println("Document uploaded.");
    }

    public void downloadDocument(int documentId) {
        System.out.println("Document with ID " + documentId + " downloaded.");
    }

    public void validateDocument() {
        System.out.println("Document validated.");
    }
}
