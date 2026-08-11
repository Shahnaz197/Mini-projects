package StudentManagementSystem;

public class Main {

    public static void main(String[] args) {

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

        System.out.println("FIND STUDENT");
        Student found = manager.findStudent("Shahnaz");

        if (found != null) {
            found.showGrades();
        }

        System.out.println("\nTOP STUDENT");
        Student top = manager.getTopStudent();
        System.out.println(top.name);
        System.out.println(top.getAverage());

        System.out.println("\nCLASS AVERAGE");
        System.out.println(manager.getClassAverage());

        System.out.println("\nAFTER REMOVING ALI");
        manager.removeStudent("Ali");
        manager.showAll();
    }
}