package interfNabs;

public class Designer implements Workable {

    @Override
    public void doWork() {
        System.out.println("designing UI");
    }

    @Override
    public double getSalary() {
        return 4500.0;
    }
}