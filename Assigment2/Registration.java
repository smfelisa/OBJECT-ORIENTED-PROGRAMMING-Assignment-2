

public class Registration {

    // Attributes
    private String registrationId;
    private Student student;
    private Course course;
    private boolean active;

    //Parameterized constructor
    public Registration(String registrationId, Student student, Course course){

        this.registrationId = registrationId;
        this.student = student;
        this.course = course;
        this.active = false;
    }

    // Getter methods
    public String getRegistrationId(){
        return  registrationId;
    }

    public Student getStudent(){
        return student;
    }

    public Course getCourse(){
        return course;
    }

    public boolean getActive(){
        return active;
    }

    //Setter methods
    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    // Registers the student for a course
    public void registerCourse() {

        // Checks whether the registration is currently inactive.
        if (!active) {

            // Calls the registerStudent() method from the Student class.
            student.registerStudent();
            active = true;

            System.out.println("Registration " + registrationId
                    + " is successful.");
        } else {
            System.out.println("This registration is already active.");
        }
    }

    // Calculates course fee using polymorphism
    // This method calculates the tuition fee for the registered student.
    // The actual calculation depends on the student's class type.
    public double calculateFee() {

        return student.calculateTuitionFee(
                course.getFeePerCredit(),
                course.getCreditHours()
        );
    }

    // Displays registration information.
    public void displayRegistration() {

        System.out.println("\n--- REGISTRATION INFORMATION ---");
        System.out.println("Registration ID: " + registrationId);
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Type: " + student.getStudentType());
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Registration Active: " + active);
        System.out.printf("Tuition Fee: RM %.2f%n", calculateFee());
    }
}


