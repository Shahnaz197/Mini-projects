package StudentManagementSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
    //saving to the file
    public void saveToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (Student s : students) {
                writer.write(s.name + "," + s.getAge() + "," + s.getAverage() + "\n");
            }
            System.out.println("saved to " + filename);
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    public void loadFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(","); // split by comma
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                students.add(new Student(name, age));
            }
            System.out.println("loaded from " + filename);
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}







