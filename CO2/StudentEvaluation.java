public abstract class StudentEvaluation {
    protected String studentId;
    protected String studentName;
    protected String courseType;

    public StudentEvaluation(String studentId, String studentName, String courseType) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courseType = courseType;
    }

    public void displayDetails() {
        System.out.println("--------------------------------------------------");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Course Type  : " + courseType);
    }

    public abstract double calculateTotalMarks();
    public abstract void displayGrade();

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("       UNIVERSITY STUDENT EVALUATION SYSTEM       ");
        System.out.println("==================================================");

        StudentEvaluation[] students = new StudentEvaluation[] {
            new UGCourseEvaluation("UG-101", "Alice Johnson", 88.0, 92.0),
            new UGCourseEvaluation("UG-102", "Bob Smith", 64.0, 58.0),
            new PGCourseEvaluation("PG-201", "Catherine Zeta", 85.0, 95.0),
            new CertificateCourseEvaluation("CERT-301", "David Miller", 72.0, 68.0),
            new ExecutiveCourseEvaluation("EXEC-401", "Emma Watson", 90.0, 85.0, 95.0)
        };

        for (StudentEvaluation student : students) {
            student.displayDetails();
            student.displayGrade();
        }
        System.out.println("--------------------------------------------------");
    }
}

class UGCourseEvaluation extends StudentEvaluation {
    private double theoryMarks;
    private double practicalMarks;

    public UGCourseEvaluation(String studentId, String studentName, double theoryMarks, double practicalMarks) {
        super(studentId, studentName, "Undergraduate (UG)");
        this.theoryMarks = theoryMarks;
        this.practicalMarks = practicalMarks;
    }

    @Override
    public double calculateTotalMarks() {
        return (theoryMarks * 0.70) + (practicalMarks * 0.30);
    }

    @Override
    public void displayGrade() {
        double total = calculateTotalMarks();
        String grade = (total >= 85) ? "A+" : (total >= 70) ? "A" : (total >= 50) ? "B" : "F";
        System.out.printf("Total Marks  : %.2f / 100\n", total);
        System.out.println("Final Grade  : " + grade);
    }
}

class PGCourseEvaluation extends StudentEvaluation {
    private double theoryMarks;
    private double researchMarks;

    public PGCourseEvaluation(String studentId, String studentName, double theoryMarks, double researchMarks) {
        super(studentId, studentName, "Postgraduate (PG)");
        this.theoryMarks = theoryMarks;
        this.researchMarks = researchMarks;
    }

    @Override
    public double calculateTotalMarks() {
        return (theoryMarks * 0.50) + (researchMarks * 0.50);
    }

    @Override
    public void displayGrade() {
        double total = calculateTotalMarks();
        String grade = (total >= 90) ? "Distinction" : (total >= 75) ? "Merit" : (total >= 60) ? "Pass" : "Fail";
        System.out.printf("Total Marks  : %.2f / 100\n", total);
        System.out.println("Final Grade  : " + grade);
    }
}

class CertificateCourseEvaluation extends StudentEvaluation {
    private double caMarks;
    private double finalExamMarks;

    public CertificateCourseEvaluation(String studentId, String studentName, double caMarks, double finalExamMarks) {
        super(studentId, studentName, "Certificate Program");
        this.caMarks = caMarks;
        this.finalExamMarks = finalExamMarks;
    }

    @Override
    public double calculateTotalMarks() {
        return (caMarks * 0.40) + (finalExamMarks * 0.60);
    }

    @Override
    public void displayGrade() {
        double total = calculateTotalMarks();
        String grade = (total >= 65) ? "Certified (Honors)" : (total >= 50) ? "Certified" : "Not Certified";
        System.out.printf("Total Marks  : %.2f / 100\n", total);
        System.out.println("Final Grade  : " + grade);
    }
}

class ExecutiveCourseEvaluation extends StudentEvaluation {
    private double caseStudyMarks;
    private double capstoneMarks;
    private double vivaMarks;

    public ExecutiveCourseEvaluation(String studentId, String studentName, double caseStudyMarks, double capstoneMarks, double vivaMarks) {
        super(studentId, studentName, "Executive Diploma");
        this.caseStudyMarks = caseStudyMarks;
        this.capstoneMarks = capstoneMarks;
        this.vivaMarks = vivaMarks;
    }

    @Override
    public double calculateTotalMarks() {
        return (caseStudyMarks * 0.30) + (capstoneMarks * 0.50) + (vivaMarks * 0.20);
    }

    @Override
    public void displayGrade() {
        double total = calculateTotalMarks();
        String grade = (total >= 80) ? "Executive Excellence" : (total >= 65) ? "Competent" : "Needs Improvement";
        System.out.printf("Total Marks  : %.2f / 100\n", total);
        System.out.println("Final Grade  : " + grade);
    }
}
