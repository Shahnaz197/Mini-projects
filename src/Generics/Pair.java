package Generics;

public class Pair <T,V> {
    T first;
    V second;

    public Pair (T first,V second){
        this.first = first;
        this.second = second;
    }
    public T getFirst(){
        return first;
    }
    public V getSecond(){
        return second;
    }
    public void swap(){
        System.out.println(second + " " +first);
    }
    @Override
    public String toString(){
        return "(" + first + ", " + second + ")";
    }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Shahnaz", 23);
        Pair<String, String> p2 = new Pair<>("Sri Lanka", "Colombo");
        Pair<Integer, Double> p3 = new Pair<>(1, 99.99);

        // p1
        System.out.println(p1);
        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());
        p1.swap();

        // p2
        System.out.println(p2);
        System.out.println(p2.getFirst());
        System.out.println(p2.getSecond());
        p2.swap();

        // p3
        System.out.println(p3);
        System.out.println(p3.getFirst());
        System.out.println(p3.getSecond());
        p3.swap();

    }

}
