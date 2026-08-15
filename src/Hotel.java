public class Hotel {
    public String hotelName;


    private double roomPrice;
    private static int totalRooms = 100;

    public Hotel(String hotelName,double roomPrice){
        this.hotelName=hotelName;
        this.roomPrice = roomPrice;
    }

    public void bookRoom(){
        totalRooms--;
    }
    private void checkoutRoom(){
        totalRooms++;

    }
    public double getRoomPrice(){
        return roomPrice;
    }

    public void setRoomPrice(double Price){
        roomPrice=Price;
    }

    public static int getTotalRooms() {
        return totalRooms;
    }

}
