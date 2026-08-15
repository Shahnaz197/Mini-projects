package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentList {

    ArrayList <String> students = new ArrayList<>();

    public void addStudent(String name){
        students.add(name);
    }
    public void removeStudent(String name){
        students.remove(name);
    }
    public void sortStudent(){
        Collections.sort(students);
    }
    public void searchStudent(String name){
      //  for(String i:students ){
            if (students.contains(name)){
                System.out.println(name +"found !!! ");
            }else{
                System.out.println( name + " Not found ");
            }
       // }
    }
    public void showStudent(){
        for (String i : students)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        StudentList list =new StudentList();
        list.addStudent("aria");
        list.addStudent("mala");
        list.addStudent("zeana");
        list.addStudent("lara");
        list.addStudent("dhruvi");

        list.removeStudent("mala");

        list.sortStudent();

        list.searchStudent(" dhruvi");

        list.showStudent();
    }


}
