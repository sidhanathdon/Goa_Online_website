public class Department {
    private int departmentId;
    private String departmentName;
    private String contactInfo;

    // Constructor
    public Department(int departmentId, String departmentName, String contactInfo) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.contactInfo = contactInfo;
    }

    // Methods
    public void listDepartments() {
        System.out.println("Listing all departments.");
    }

    public void getDepartmentInfo(int departmentId) {
        System.out.println("Information of department ID: " + departmentId);
    }
}
