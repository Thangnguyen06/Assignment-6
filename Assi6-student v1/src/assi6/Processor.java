
package giabao;

import java.util.Date;

public class Processor {
    public static void main(String[] args) {
        // Create a StudentList
        StudentList studentList = new StudentList();

        // Add some students
        studentList.addStudent(new Student("S001", "Alice Smith", new Date(1995, 4, 20), 3.9f, "Computer Science"));
        studentList.addStudent(new Student("S002", "Bob Johnson", new Date(1996, 2, 15), 3.7f, "Mechanical Engineering"));
        studentList.addStudent(new Student("S003", "Charlie Lee", new Date(1995, 11, 5), 4.0f, "Mathematics"));

        // Display all students
        System.out.println("All Students:");
        studentList.displayAllStudents();

        // Find and display the top student
        System.out.println("Top Student:");
        Student topStudent = studentList.findTopStudent();
        if (topStudent != null) {
            topStudent.displayInfo();
        }

        // Delete a student by ID
        studentList.deleteStudentById("S002");

        // Display all students after deletion
        System.out.println("All Students After Deletion:");
        studentList.displayAllStudents();
    }
}

