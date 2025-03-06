import java.util.Scanner;
import java.util.ArrayList;

public class StudentGradeSystem {
    public static void main(String args[]) {
        String studentName;
        String studentDepartment;
        int studentAge = 0;
        int studentMark = 0;
        char studentGrade; 

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentRecords = new ArrayList<>();

        
        System.out.println("Enter the student name:");
        studentName = scanner.nextLine();
        System.out.println("Enter the student department:");
        studentDepartment = scanner.nextLine();

        
        while (true) {
            System.out.println("Enter the student age (5-100): ");
            if (scanner.hasNextInt()) {
                studentAge = scanner.nextInt();
                if (studentAge >= 5 && studentAge <= 100) {
                    scanner.nextLine(); 
                    break;
                } else {
                    System.out.println("Invalid input! Age must be between 5 and 100.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); 
        }

        
        while (true) {
            System.out.println("Enter the student mark (0-100): ");
            if (scanner.hasNextInt()) {
                studentMark = scanner.nextInt();
                if (studentMark >= 0 && studentMark <= 100) {
                    scanner.nextLine(); 
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a value between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); 
            }
        }

        // Grade Calculation (Fixed)
        if (studentMark >= 90) {
            studentGrade = 'A';
        } else if (studentMark >= 80) {
            studentGrade = 'B';
        } else if (studentMark >= 70) {
            studentGrade = 'C';
        } else if (studentMark >= 60) {
            studentGrade = 'D';
        } else {
            studentGrade = 'F';
        }

        // Display Student Details
        System.out.println("\n............... STUDENT DETAILS ...............");
        System.out.println("Name: " + studentName);
        System.out.println("Department: " + studentDepartment);
        System.out.println("Age: " + studentAge);
        System.out.println("Mark: " + studentMark);
        System.out.println("Grade: " + studentGrade);

        
        studentRecords.add("Name: " + studentName + ", Department: " + studentDepartment + ", Age: " + studentAge + ", Mark: " + studentMark + ", Grade: " + studentGrade);

        scanner.close();
    }
}
}