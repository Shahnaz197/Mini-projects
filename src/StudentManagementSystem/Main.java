package StudentManagementSystem;

public class Main {

    public static void main(String[] args) {

        try {

            Student s1 = new Student("Shahnaz", 23);
            Student s2 = new Student("Ali", 22);
            Student s3 = new Student("Sara", 24);

            s1.addGrade("Java", 90);
            s1.addGrade("Math", 85);
            s1.addGrade("Database", 95);

            s2.addGrade("Java", 80);
            s2.addGrade("Math", 75);
            s2.addGrade("Database", 85);

            s3.addGrade("Java", 95);
            s3.addGrade("Math", 90);
            s3.addGrade("Database", 100);

            StudentManager manager = new StudentManager();

            manager.addStudent(s1);
            manager.addStudent(s2);
            manager.addStudent(s3);

            System.out.println("ALL STUDENTS");
            manager.showAll();

            manager.saveToFile("studnetlogboog.txt");

            // ✅ load into new manager
            System.out.println("\nLOADED FROM FILE:");
            StudentManager loadedManager = new StudentManager();
            loadedManager.loadFromFile("students.txt");
            loadedManager.showAll();

            Student found = manager.findStudent("Shahnaz");
            System.out.println("Found: " + found.name);

            System.out.println(
                    "Math grade: " + found.getGrade("Math")
            );

            Student top = manager.getTopStudent();
            System.out.println("Top student: " + top.name);

            System.out.println(
                    "Class average: " + manager.getClassAverage()
            );

        } catch (StudentNotFoundException e) {

            System.out.println("Student error: " + e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println("Input error: " + e.getMessage());

        } catch (IllegalStateException e) {

            System.out.println("State error: " + e.getMessage());

        } finally {

            System.out.println("Program finished.");

        }
    }
}