package hotel_room_project;

public class hotel_test {
    public static void main (String args[]){
        /*Person edward = new Person (57, 17, "Edward", "black");
        HotelRoom room1 = new HotelRoom (1);

        System.out.println(room1.guestOne == null);
        
        System.out.println("ARRAYLIST TEST");
        ArrayList<String> test = new ArrayList<String>();
        test.add("one", "two", "three");
        System.out.println(test);*/

        String n = "test";
        n = null;
        System.out.println(n);

        System.out.println("test \n test");

        System.out.println("Begin real test:\n");
        Person edward = new Person (57, 17,"Edward", "black");
        Person durret = new Person (46, 22, "Durret", "brown");
        HotelRoom room1= new HotelRoom(1); 
        room1.checkIn(edward);
        System.out.println("Capacity: " + room1.checkCapacity());
        room1.checkIn(durret);
        System.out.println("Capacity: " + room1.checkCapacity());

        room1.printGuestInfo();
        room1.checkOut(edward);
        room1.printGuestInfo();
        room1.checkOut(durret);
        System.out.println("Capacity: " + room1.checkCapacity());
    }
}