package Hashmap;

import java.util.HashMap;

public class GradeBook {
    HashMap<String,Double> grades = new HashMap<>();

    public void addGrade(String student,Double grade){
        grades.put(student,grade);
       // grades.put(student.toLowerCase(), grade); // always store lowercase
    }
    public double getGrade(String Student){
        return grades.get(Student);
      //  return grades.get(student.toLowerCase()); // always search lowercase

    }

    public void removeStudents(String student){
    //    grades.remove(student.toLowerCase()); // always remove lowercase

        grades.remove(student);
    }
    public void showAll(){
        for(String student: grades.keySet()){
            System.out.println(student + "->" + grades.get(student)) ;
        }
    }
    public double getAverage(){
        double total = 0;
        for(String student:grades.keySet()){
            total +=grades.get(student);
        }
        return total/grades.size();

    }

    public static void main(String[] args) {
        GradeBook g = new GradeBook();
        g.addGrade("ali" ,70.1);
        g.addGrade("rose",65.5);
        g.addGrade("lasa",96.3);
        g.addGrade("iza",85.2);
        g.showAll();

        System.out.println("lasa's grade: " + g.getGrade("lasa"));

        g.removeStudents("iza");

        System.out.println("Average : " + g.getAverage() );

    }

    //here it make sure everything mathches cuse its case sensitive
}
