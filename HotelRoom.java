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
        if (guestOne == guest){
            guestOne = null;
        }
        else if (guestTwo == guest){
            guestTwo = null;
        }
    }

    int checkCapacity(){
        int c = 0;
        if (guestOne != null){
            c++;
        }
        if (guestTwo != null){
            c++;
        }
        return c;
    }

    void printGuestInfo(){
        System.out.println("Guest one: \nName " + guestOne.name + "\nHeight: " + guestOne.height + "\nAge: " + guestOne.age + "\nHair Color: " + guestOne.hairColor);
        System.out.println("Guest two: \nName " + guestTwo.name + "\nHeight: " + guestTwo.height + "\nAge: " + guestTwo.age + "\nHair Color: " + guestTwo.hairColor);
    }
}
