
public class PostgraduateStudent extends Student {

    // Additional attributes for postgraduate students
    private String researchTopic;
    private double researchLevy;

    // Parameterized constructor to receives the postgraduate student's information.
    public PostgraduateStudent(String studentId, String name, int age,
                               String course, int semester, double cgpa,
                               boolean isRegistered,
                               String researchTopic,
                               double researchLevy) {

        // Calls the constructor of the parent class (Student) to initialize the common student attributes.
        // This avoids repeating the initialization code here.
        super(studentId, name, age, course, semester, cgpa, isRegistered);

        this.researchTopic = researchTopic;
        this.researchLevy = researchLevy;
    }

    // Getters methods allow other classes to access private attributes.
    // Returns the research topic of the postgraduate student.
    public String getResearchTopic() {
        return researchTopic;
    }

    // Returns the research Levy percentage.
    public double getResearchLevy() {
        return researchLevy;
    }

    // Setter methods allow other classes to modify private attributes.
    // Updates the research topic of the postgraduate student.
    public void setResearchArea(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    // Updates the research Levy.
    // Validation ensures that the Levy cannot be a negative value.
    public void setResearchLevy(double researchLevy) {
        if (researchLevy >= 0) {
            this.researchLevy = researchLevy;
        }
    }

    // Override tuition fee calculation
    // Overrides the calculateTuitionFee() method from the parent class.
    @Override
    public double calculateTuitionFee(double feePerCredit, int creditHours) {

        double totalFee = feePerCredit * creditHours;

        // Calculates the research levy based on the basic tuition fee.
        totalFee = totalFee + (totalFee * researchLevy / 100);

        return totalFee;
    }

    // Override student type
    // Overrides the getStudentType() method from the parent class.
    @Override
    public String getStudentType() {
        return "Postgraduate Student";
    }

    // Additional method for postgraduate students.
    // Displays students's research information.
    public void displayResearchInfo() {

        System.out.println("\n--- RESEARCH INFORMATION ---");
        System.out.println("Research Area: " + researchTopic);
        System.out.println("Research Levy: " + researchLevy + "%");
    }
}

