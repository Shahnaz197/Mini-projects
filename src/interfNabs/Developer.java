package interfNabs;

public class Developer implements Workable{

    @Override
    public void doWork() {
        System.out.println("writing code");
    }

    @Override
    public double getSalary() {
        return 5000.0;
    }

}
