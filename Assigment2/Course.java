

public class Course {

    // Attributes
    private String courseCode;
    private String courseName;
    private int creditHours;
    private double feePerCredit;

    // Parameterized constructor
    public Course(String courseCode, String courseName,
                 int creditHours, double feePerCredit) {

        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.feePerCredit = feePerCredit;
    }

    // Getter methods
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public double getFeePerCredit() {
        return feePerCredit;
    }

    // Setter methods
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // Validation ensures that credit hours must be greater than 0.
    public void setCreditHours(int creditHours) {
        if (creditHours > 0) {
            this.creditHours = creditHours;
        }
    }

    // Validation prevents the fee from being a negative value.
    public void setFeePerCredit(double feePerCredit) {
        if (feePerCredit >= 0) {
            this.feePerCredit = feePerCredit;
        }
    }

    // Displays course information
    public void displayCourseInfo() {

        System.out.println("\n--- COURSE INFORMATION ---");
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credit Hours: " + creditHours);
        System.out.printf("Fee Per Credit: RM %.2f%n", feePerCredit);
    }
}

