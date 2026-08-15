public class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println("thread running : " +Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }

}

