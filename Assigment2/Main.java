
public class Main {

    public static void main(String[] args) {

        // 1. Create object using default constructor 
        // Creates a student with default values first.
        Student student1 = new Student();

        // Set student1 attributes using setter methods to assign student information.
        student1.setStudentId("S1001");
        student1.setName("Alex Tan");
        student1.setAge(20);
        student1.setCourse("Computer Science");
        student1.setSemester(2);
        student1.setCgpa(3.60);
        student1.setIsRegistered(false);

        // 2. Create the second student using the parameterized constructor
        Student student2 = new Student("S1002", "Sarah Lim", 21, "Information Technology", 3, 3.20, true);

        // Displays the program title.
        System.out.println("==================================");
        System.out.println("      STUDENT MANAGEMENT SYSTEM");
        System.out.println("==================================");

        // 3. Displays the information of both students.
        System.out.println("\nFIRST STUDENT");
        student1.displayStudentInfo();

        System.out.println("\nSECOND STUDENT");
        student2.displayStudentInfo();

        // 4. Demonstrate getter methods
        // Retrieves and displays selected student information.
        System.out.println("\n--- GETTER DEMONSTRATION ---");
        System.out.println("Student name: " + student1.getName());
        System.out.println("Student ID: " + student1.getStudentId());
        System.out.println("Current CGPA: " + student1.getCgpa());

        // 5. Demonstrates changing a value using a setter.
        System.out.println("\n--- UPDATE CGPA ---");
        student1.setCgpa(3.80);

        // Uses getters to display the updated values.
        System.out.println("Updated CGPA: " + student1.getCgpa());
        System.out.println("Updated academic status: " + student1.checkAcademicStatus());

        // 6. Demonstrate if-else selection
        // Checks the registration status and registers the student if the student is not already registered.
        System.out.println("\n--- REGISTRATION CHECK ---");

        if (student1.checkRegistration()) {
            System.out.println(student1.getName() + " is already registered.");
        } else {
            System.out.println(student1.getName() + " is not registered.");

            // Register the student
            student1.registerStudent();
        }

        // 7. Demonstrate switch selection
        // Selects a message based on the student's academic status.
        System.out.println("\n--- ACADEMIC PERFORMANCE ---");

        switch (student1.checkAcademicStatus()) {
            case "Excellent":
                System.out.println("Outstanding academic performance!");
                break;

            case "Good":
                System.out.println("Good academic performance.");
                break;

            case "Satisfactory":
                System.out.println("Satisfactory academic performance.");
                break;

            default:
                System.out.println("Academic improvement is needed.");
        }

        // 8. Demonstrate a for loop
        // Displays each semester from 1 to the student's current semester.

        // Display the section heading.
        System.out.println("\n--- SEMESTER PROGRESS ---");

        for (int i = 1; i <= student1.getSemester(); i++) {
            System.out.println("Semester " + i);
        }

        // 9. Demonstrate a while loop 
        // This while loop repeats twice to check the registration status of both students.


        System.out.println("\n--- STUDENT REGISTRATION REVIEW ---");

        // Initialize the counter at 0.
        int count = 0;

        // Repeat the loop while count is less than 2.
        while (count < 2) {

            // Create a variable to store the student being reviewed.
            Student currentStudent;

            // If count is 0, select the first student.
            if (count == 0) {
                currentStudent = student1;
            } else {
                // Otherwise, select the second student.
                currentStudent = student2;
            }

             // Displays the selected student's registration status.
            System.out.println("\nReviewing: " + currentStudent.getName());

            if (currentStudent.checkRegistration()) {
                System.out.println("Registration status: Registered");
            } else {
                System.out.println("Registration status: Not registered");
            }

            // Increase count by 1 to move to the next student.
            count++;
        }

        // 10. Demonstrates changing the semester using a method.
        System.out.println("\n--- UPDATE SEMESTER ---");
        student1.updateSemester();

        System.out.println("Current semester: " + student1.getSemester());


    // 11. Create an UndergraduateStudent object
        // UndergraduateStudent inherits from Student class. Therefore, it can use the attributes and methods inherited from Student.
        Student student3 = new UndergraduateStudent(
                "S1003",
                "Jason Lee",
                20,
                "Computer Science",
                2,
                3.75,
                false,
                true,
                20.0
        );

        // 12. Create a PostgraduateStudent object
        // PostgraduateStudent also inherits from Student.
        Student student4 = new PostgraduateStudent(
                "S1004",
                "Mei Wong",
                24,
                "Master of Information Technology",
                1,
                3.80,
                false,
                "Cybersecurity",
                10.0
        );


        // 13. Demonstrate inheritance
        // Both child classes inherit the methods from Student class.
        System.out.println("\n--- INHERITANCE DEMONSTRATION ---");

        student3.displayStudentInfo();
        student4.displayStudentInfo();


        // 14. Demonstrate instanceof and type casting
        // instanceof checks whether an object belongs to a class.

        System.out.println("\n--- SUBCLASS INFORMATION ---");

        // Checks if student3 is an UndergraduateStudent object.
        if (student3 instanceof UndergraduateStudent) {

            // Convert the Student reference into an UndergraduateStudent.
            // Type casting allows access to undergraduate-specific methods.
            UndergraduateStudent undergraduate =
                    (UndergraduateStudent) student3;

            // Displays scholarship information.
            undergraduate.displayScholarshipInfo();
        }

        // Checks if student4 is a PostgraduateStudent object.
        if (student4 instanceof PostgraduateStudent) {

            // Type casting allows access to postgraduate-specific methods.
            PostgraduateStudent postgraduate =
                    (PostgraduateStudent) student4;

            // Displays research information.
            postgraduate.displayResearchInfo();
        }


        // 15. Create Course objects
        // Each Course object stores its own course information.
        System.out.println("\n--- COURSE MANAGEMENT ---");

        // Create the first Course object.
        Course course1 = new Course(
                "CS101",
                "Object Oriented Programming",
                3,
                250.00
        );

        // Create the second Course object.
        Course course2 = new Course(
                "IT701",
                "Research in Information Technology",
                4,
                300.00
        );

        // Displays the information of each course.
        course1.displayCourseInfo();
        course2.displayCourseInfo();

        // 16. Create Registration objects
        // Each registration connects a student with a course.
        System.out.println("\n--- COURSE REGISTRATION ---");

        // Create registration1 for student3 and course1.
        Registration registration1 = new Registration(
                "R001",
                student3,
                course1
        );

        // Create registration2 for student4 and course2.
        Registration registration2 = new Registration(
                "R002",
                student4,
                course2
        );


        // 17. Register students for their courses
        // Calls registerCourse() to activate each registration.
        registration1.registerCourse();
        registration2.registerCourse();

        // 18. Demonstrate polymorphism
        // All student objects are stored inside a Student array.
        // However, each object can have a different student type.
        System.out.println("\n--- POLYMORPHISM DEMONSTRATION ---");

        Student[] studentList = {
                student1,
                student2,
                student3,
                student4
        };

        // Enhanced for loop visits each student in the array.
        for (Student currentStudent : studentList) {

            // Displays the student's name.
            System.out.println("\nStudent Name: "
                    + currentStudent.getName());

            // Calls the overridden getStudentType() method.
            // The result depends on the actual object type.
            System.out.println("Student Type: "
                    + currentStudent.getStudentType());

            // Calls calculateTuitionFee().
            // The calculation depends on the actual student object.
            double tuitionFee =
                    currentStudent.calculateTuitionFee(250.00, 3);

            // Displays the calculated tuition fee.
            System.out.printf("Tuition Fee: RM %.2f%n", tuitionFee);
        }


        // 19. Display registration information
        // Shows the student, course, registration status and fee.
        System.out.println("\n--- REGISTRATION DETAILS ---");

        registration1.displayRegistration();
        registration2.displayRegistration();

        // 20. Create StudentReport object
        // StudentReport contains methods to generate reports, search for students and calculate system summaries.
        System.out.println("\n--- STUDENT REPORT ---");

        StudentReport report = new StudentReport();

        // Passes the studentList array into the report method.
        // The method displays information for all students.
        report.displayStudentReport(studentList);


        // 21. Search student using student ID
        // Searches for student S1003 inside the studentList array.
        System.out.println("\n--- SEARCH STUDENT ---");

        Student searchResult =
                report.searchStudent(studentList, "S1003");

        // If searchResult is not null, the student was found.
        if (searchResult != null) {

            System.out.println("Student found!");

            // Displays the information of the student found.
            searchResult.displayStudentInfo();

        } else {

            // Executes if the student ID cannot be found.
            System.out.println("Student not found.");
        }


        // 22. Display the student system summary
        // Calculates the total students, registered students
        // and average CGPA.
        report.displaySummary(studentList);

        // Displays a message after all program operations finish.
        System.out.println("\nProgram completed successfully.");
}
}




