package interfNabs;

public class Main {
    public static void main(String[] args) {

        Developer dev = new Developer();
        Designer desig = new Designer();

        dev.doWork();
        System.out.println(dev.getSalary());

        desig.doWork();
        System.out.println(desig.getSalary());
    }
}
