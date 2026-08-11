package StudentManagementSystem;

import java.util.HashMap;
import java.util.Map;

public class Student {

   public String name;
   private int age;
   private HashMap<String,Double> grades;

   public Student(String name,int age){
       this.name = name;
       this.age =age;
       this.grades = new HashMap<>();
   }
   public int getAge(){
       return age;
   }
   public void setAge(int age){
       this.age = age;
   }
   public void addGrade(String subject,double grade){
       grades.put(subject,grade);
   }
   public double getGrade(String subject){
       return grades.get(subject);
   }
   public double getAverage(){
       double total = 0;

       for(double grade:grades.values()){
           total +=grade;
       }
       return total /grades.size();
   }
   public void showGrades(){
       for(Map.Entry<String,Double> entry :grades.entrySet()) {
           System.out.println(entry.getKey() + " : " + entry.getValue());
       }
   }
}
