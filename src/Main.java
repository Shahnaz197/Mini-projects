import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("laptop ",1222.0);
        Product p2 = new Product("mac",500000.0);

        Shop shop = new Shop();

        shop.sellProduct(p1);
        shop.applyDiscountPrice(p1,500);

        Product expensive = shop.getMostExpensive(p1,p2);

        Product p =shop.createProduct("usb",5000.2);
        System.out.println(p.name);
        System.out.println(p.getPrice());
        System.out.println("most expensive : " + expensive.name);





























        /*
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double price = scanner.nextDouble();
        Hotel h1 = new Hotel(name, price);



        System.out.println("hotel please : ");
       // h1.hotelName

        System.out.println("price please : ");
        h1.setRoomPrice (scanner.nextDouble());

    //    h1.bookRoom() = scanner.nextLine();

        System.out.println("Hotel: " + h1.hotelName);
        System.out.println("Room Price: " + h1.getRoomPrice());
        System.out.println("Total Rooms: " + Hotel.getTotalRooms());
/*
        GymMembership g1 = new GymMembership();

        System.out.print("Enter your name : ");
        g1.memberName = scanner.nextLine();

        System.out.println("Enter membership fee : ");
        g1.setMembershipFee(scanner.nextDouble());

        g1.joinGym();

        System.out.println("Member: " + g1.memberName);
        System.out.println("Fee: " + g1.getMemberhipFee());
        System.out.println(totalMembers);

        scanner.close();



 */




    }


}