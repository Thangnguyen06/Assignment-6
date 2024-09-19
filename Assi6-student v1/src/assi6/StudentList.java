package giabao;
import java.util.ArrayList;
class StudentList {
    private final ArrayList<Student> studentList;
    public StudentList() {
        studentList = new ArrayList<>();
    }
    public void addStudent(Student student) {
        studentList.add(student);
    }
    public void deleteStudentById(String id) {
        studentList.removeIf(student -> student.getId().equals(id));
    }
    public Student findStudentById(String id) {
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null; 
    }

    public void displayAllStudents() {
        studentList.stream().map((student) -> {
            student.displayInfo();
            return student;
        }).forEachOrdered((_item) -> {
            System.out.println("--------------------");
        });
    }
    public Student findTopStudent() {
        if (studentList.isEmpty()) {
            return null;
        }
        Student topStudent = studentList.get(0);
        for (Student student : studentList) {
            if (student.getGpa() > topStudent.getGpa()) {
                topStudent = student;
            }
        }
        return topStudent;
    }
}


