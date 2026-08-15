public class Calculator {
    public static int add(int a,int b){
        return a+b;
    }
    public static int multiply(int a,int b){
        return a*b;
    }

    public static boolean isEven(int number){
        if (number % 2 ==0){ //return number % == 0;
            return true;
        }else {
            return false;
        }
    }
    public static int max(int a,int b){
        if(a > b){
            return a;
        }else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(Calculator.add(5,6));
        System.out.println(Calculator.multiply(5,4));
        System.out.println(Calculator.isEven(8));
        System.out.println(Calculator.max(8,9));
    }
}
