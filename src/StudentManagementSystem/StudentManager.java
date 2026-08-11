package StudentManagementSystem;

import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(String name   ){
        students.removeIf(s -> s.name.equals(name));
    }
    public Student findStudent(String name) throws StudentNotFoundException{
        for(Student s :students){
            if(s.name.equals(name)){
                return s;
            }
            throw new StudentNotFoundException("Student not found " + name);
        }
        return null;
    }
    public void showAll() {
        for (Student s : students) {
            System.out.println("Name: " + s.name);
            System.out.println("Age: " + s.getAge());

            s.showGrades();

            System.out.println("Average: " + s.getAverage());
            System.out.println();
        }
    }

    public Student getTopStudent() {
        //Student top = students.get(0);

        if(students.isEmpty()){
            throw new IllegalStateException("No student available");
        }
        Student top = students.get(0);

        for (Student s : students) {
            if (s.getAverage() > top.getAverage()) {
                top = s;
            }
        }

        return top;
    }

    public double getClassAverage() {
        double total = 0;

        for (Student s : students) {
            total += s.getAverage();
        }

        return total / students.size();
    }
}







