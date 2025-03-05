import java.util.*;

class Student {
    int roll;
    String name;  // name should be a String, not an int
    int marks;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

public class Que15 {

    // Recursive function to determine grade based on marks using switch-case
    public static String determineGrade(int marks) {
        
        switch (marks / 10) {  // Divide marks by 10 to determine the range
            case 10:  // Marks between 100-110 (if marks could go higher)
            case 9:   // Marks between 90-99
            
                // System.out.println("A");
                return "A";
               
            case 8:   // Marks between 80-89
            return "B";
            case 7:   // Marks between 70-79
            return "C";
            case 6:   // Marks between 60-69
            return "D";
            case 5:   // Marks between 50-59
            case 4:   // Marks between 40-49
            return "E";
            default:   // Marks below 40
            return "F";
        }
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get student name and marks
        System.out.println("Enter the name of student:");
        String studentName = sc.nextLine();

        System.out.println("Enter the roll number of student:");
        int rollNumber = sc.nextInt();

        System.out.println("Enter the marks of student:");
        int marks = sc.nextInt();

        // Create a student object and set the values
        Student student = new Student();
        student.setName(studentName);
        student.setRoll(rollNumber);
        student.setMarks(marks);

        // Call the recursive method to determine grade
        determineGrade(student.getMarks());

        // Optional: Print student information
        System.out.println("Student Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRoll());
        System.out.println("Marks: " + student.getMarks());
        System.out.println("Grade: "+determineGrade(student.getMarks()));
    }
}
