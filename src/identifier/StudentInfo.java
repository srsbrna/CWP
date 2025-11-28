package lib.identifier;

public class StudentInfo {

    public String showStudentInfo(String name, int age, double gpa) {
        
        String result = "Name : " + name + "\n" + 
                        "Age : " + age + "\n" +
                        "GPA : " + gpa + "\n" ; 
        return result ;
    }
}
