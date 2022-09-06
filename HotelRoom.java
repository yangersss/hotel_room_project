package hotel_room_project;

public class HotelRoom {
    Person guestOne;
    Person guestTwo;
    int roomNumber;

    public HotelRoom (int n){
        roomNumber = n;
    }

    void checkIn(Person guest){
        if (guestOne == null){
            guestOne = guest;
        }
        else if (guestTwo == null){
            guestTwo = guest;
        }
        else{
            System.out.println("Sorry, this room is already full. The guest was not added.");
        }
    }

    void checkOut(Person guest){

    }

    int checkCapacity(){
        return 0;
    }

    void printGuestInfo(){

    }
}
