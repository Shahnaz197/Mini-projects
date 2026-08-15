import java.util.Scanner;

public class School {
    public String schoolName;
    private static int totalStudents = 1000;
    private double annualFee;
    private double totalRevenue;

    //public School(String name,Double annual fee){
    //this.name =name
    //this.fee =fee

    public void enrollStudent(){
        totalStudents++;
        totalRevenue += annualFee;
    }
    public double getTotalRevenue(){
        return totalRevenue;
    }

    public double getAnnualFee(){
        return annualFee;

    }
    public void setAnnualFee(double fee){
         annualFee = fee;
    }

    public int getTotalStudents(){
        return totalStudents;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        // 1. get input first
    System.out.print("Enter school name: ");
    String name = scanner.nextLine();

    System.out.print("Enter annual fee: ");
    double fee = scanner.nextDouble();

    // 2. create object with constructor
    School s1 = new School(name, fee); // ✅ no more setAnnualFee needed!
         */

        School s1 = new School();

        System.out.println("Enter the school name : ");
        s1.schoolName = scanner.nextLine();

        System.out.println(" Amount of money need to pay  : ");
        s1.setAnnualFee (scanner.nextDouble());

        System.out.print("How many students to enroll? ");
        int numberOfStudents = scanner.nextInt();

// loop through and enroll each one
        for (int i = 1; i <= numberOfStudents; i++) {
            s1.enrollStudent();
        }

        System.out.println("School : " + s1.schoolName);
        System.out.println("Annual fee : " + s1.getAnnualFee());
        System.out.println("Total Student : " + s1.getTotalStudents());
        System.out.println("Total Revenue  : " + s1.getTotalRevenue());
    }
}
