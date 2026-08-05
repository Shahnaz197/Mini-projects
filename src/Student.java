public class Student {
    public String name ;
    public int grade;

    public Student(String name,int grade){
        this.name =name;
        this.grade = grade;
    }
}

/*
public class Classroom{
    public String className;

    public void addStudent(Student student){
        System.out.println(student.name + " added to " + className);
    }

    public Student getBestStudent(Student s1,Student s2){
        if(s1.grade > s2.grade){
            return s1;
        }
        else{
            return s2;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Shahnaz", 99);
        Student s2 = new Student("ara", 89);

        Classroom c = new Classroom();
        c.className = "L6";
        c.addStudent(s1);
        Student best = c.getBestStudent(s1, s2);

        System.out.println("Best student: " + best.name);

    }



}
*/