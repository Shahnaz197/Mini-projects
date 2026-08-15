package Concu;

public class Kitchen {

    public void cookFood(String dish){
        for(int i =0;i <3; i++) {
            System.out.println("cooking : " + dish);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void prepIngredients(String ingredient) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Prepping: " + ingredient);

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

            Kitchen kitchen = new Kitchen();

            Thread t1 = new Thread(() -> kitchen.cookFood("pasta"));
            Thread t2 = new Thread(() -> kitchen.prepIngredients("vegetables"));

            t1.start();
            t2.start();

    }
}
