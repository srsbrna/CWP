package condition2;

public class GradeNested {
    
    public String getGradeInfo(String subject, int score) {
        String grade;

        if (subject.equals("Math")) {
            if (score >= 90) {
                grade = "A";
            } else if (score >= 75) {
                grade = "B";
            } else  {
                grade = "C";
            }
        } else if (subject.equals("English")) {
            if (score >= 85) {
                grade = "A";
            } else if (score >= 70) {
                grade = "B";
            } else {
                grade = "C";
            }
        } else {
            subject = "Unknown";
            grade = "N/A";
        }

        return "Subject: " + subject + ", Grade: " + grade;
    }
}
