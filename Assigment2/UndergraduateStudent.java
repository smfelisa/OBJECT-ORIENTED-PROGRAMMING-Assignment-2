

public class UndergraduateStudent extends Student{

    private boolean scholarshipEligible;
    private double scholarshipDiscount;

    //Parameterized Constructor
    public UndergraduateStudent (String studentId, String name,
            int age, String course, int semester,
            double cgpa, boolean isRegistered,
            boolean scholarshipEligible,
            double scholarshipDiscount) {

                // Calls the parameterized constructor of the parent Student class.
                super(studentId, name, age, course, semester, cgpa, isRegistered);

                this.scholarshipEligible = scholarshipEligible;
                this.scholarshipDiscount = scholarshipDiscount;
            }

            // Getter for scholarshipEligible.
            // Allows other classes to retrieve the student's scholarship eligibility.
            // Returns true if eligible and false if not eligible.
            public boolean getScholarshipEligible(){
                return scholarshipEligible;
            }

            // Getter for scholarshipDiscount.
            // Returns the scholarship discount percentage.
            // For example, it may return 20.0 for a 20% discount.
            public double getScholarshipDiscount(){
                return scholarshipDiscount;
            }

            //Setters
            public void setScholarshipEligible(boolean scholarshipEligible) {
                this.scholarshipEligible = scholarshipEligible;
            }
            
            // Validation is used to ensure the discount is between 0% and 100%.
            public void setScholarshipDiscount(double scholarshipDiscount) {
                // Checks whether the discount percentage is within the valid range.
                // Discount cannot be negative or exceed 100%.
                if (scholarshipDiscount >= 0 && scholarshipDiscount <= 100) {
                    this.scholarshipDiscount = scholarshipDiscount;
                }
            }

            // Overrides the calculateTuitionFee() method from the parent Student class.
            // To calculated diffently from general students.
           @Override
           public double calculateTuitionFee(double feePerCredit, int creditHours) {
            double totalFee = feePerCredit * creditHours;
            if (scholarshipEligible) {
                totalFee = totalFee - (totalFee * scholarshipDiscount / 100);
            }
            return totalFee;
        }
        
        // Overrides the getStudentType() method from the parent Student class.
        @Override
        public String getStudentType() {
            return "Undergraduate Student";
        }
        
        // Additional method for undergraduate students.
        // Display the students's scholarship eligibility and discount percentage.
        public void displayScholarshipInfo() {
            System.out.println("\n--- SCHOLARSHIP INFORMATION ---");
            System.out.println("Scholarship Eligible: " + scholarshipEligible);
            System.out.println("Scholarship Discount: " + scholarshipDiscount + "%");
        }


    
}
