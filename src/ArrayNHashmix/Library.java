package ArrayNHashmix;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    HashMap<String, ArrayList<String>> library = new HashMap<>();

    public void addBook(String genre,String book){
        if(!library.containsKey(genre)){
            library.put(genre,new ArrayList<>());
        }
        library.get(genre).add(book);
    }
    public void showGenre(String genre){
        for(String book :library.get(genre)){
            System.out.println(book);
        }

    }
    public void showAll(){
        for(String genre :library.keySet()){
            System.out.println(genre + ": ");
            for(String book : library.get(genre)){
                System.out.println("  " + book);
            }
        }
    }
    public int totalBooks() {
        int total = 0;
        for (String genre : library.keySet()) {
            total += library.get(genre).size();
        }
        return total;
    }

    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Fiction", "Harry Potter");
        lib.addBook("Fiction", "Narnia");
        lib.addBook("Science", "Brief History of Time");
        lib.addBook("Science", "A Short History of Nearly Everything");
        lib.addBook("History", "Sapiens");

        lib.showGenre("Fiction");
        lib.showAll();
        System.out.println ("Total books : " + lib.totalBooks());
    }
}
