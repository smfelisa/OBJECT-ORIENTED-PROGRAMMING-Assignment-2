
public class StudentReport {

    // Displays a report of all students
    // This method receives an array of Student objects
    // and displays the information of every student in the array.
    public void displayStudentReport(Student[] students) {

        System.out.println("\n--- STUDENT REPORT ---");

        // A for loop is used to go through every Student object inside the students array, one student at a time.
        for (int i = 0; i < students.length; i++) {

            // Displays the student number.
            // (i + 1) is used because array indexing starts from 0,
            // but the displayed student numbering starts from 1.
            System.out.println("\nStudent " + (i + 1));

             // Calls displayStudentInfo() from the Student class to display the information of the current student.
            students[i].displayStudentInfo();
        }
    }

    // Searches for a student using student ID
    // The method returns a Students object if a match is found, if no matching student is found, returns null.
    public Student searchStudent(Student[] students, String studentId) {

        // Goes through every Student object in the array to search for the matching student ID.
        for (int i = 0; i < students.length; i++) {

            // .equals() compares the actual String contents to check whether the IDs are the same.
            if (students[i].getStudentId().equals(studentId)) {
                return students[i];
            }
        }

        return null;
    }

    // Displays the summary of all students
    // displays the total number of students, registered students, unregistered students and average CGPA.
    public void displaySummary(Student[] students) {

        // students.length returns the number of Student objects.
        int totalStudents = students.length;
        // Initializes the registered student counter to 0.
        // This variable will increase whenever a registered student is found.
        int registeredStudents = 0;
        // Initializes the total CGPA to 0.
        // Each student's CGPA will be added to this variable.
        double totalCGPA = 0;

        // Loops through every Student object in the array.
        for (int i = 0; i < students.length; i++) {

            // Count registered students
            // Calls checkRegistration() from the Student class.
            if (students[i].checkRegistration()) {
                registeredStudents++;
            }

            // Add each student's CGPA
            totalCGPA = totalCGPA + students[i].getCgpa();
        }

        System.out.println("\n==================================");
        System.out.println("       STUDENT SYSTEM SUMMARY");
        System.out.println("==================================");

        System.out.println("Total Students: " + totalStudents);

        System.out.println("Registered Students: "
                + registeredStudents);

        System.out.println("Not Registered Students: "
                + (totalStudents - registeredStudents));

    }
    
}
