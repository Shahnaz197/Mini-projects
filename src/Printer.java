public class Printer {
    public void message(String msg){
        System.out.println(msg);
    }
    public void message(String msg,int times){
        for(int i = 1;i <= times;i++){
            System.out.println(msg);
        }
    }
    public void message(boolean uppercase,String msg){
        if(uppercase){
            System.out.println(msg.toUpperCase());
        }else {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        Printer p = new Printer();
        p.message("ba bab bananan");
        p.message("banana",2);
        p.message(true,"banana");
    }
}
