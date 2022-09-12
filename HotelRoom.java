package hotel_room_project;

public class HotelRoom { //variables of the class
    Person guestOne;
    Person guestTwo;
    int roomNumber;

    public HotelRoom (int n){ //constructor
        roomNumber = n;
    }

    void checkIn(Person guest){ //when called, adds the specified guest to the first available slot in a room. if the room is full, it does not add them.
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

    void checkOut(Person guest){ //when called, removes the specified guest from their slot (by setting the slot to null)
        if (guestOne == guest){
            guestOne = null;
        }
        else if (guestTwo == guest){
            guestTwo = null;
        }
    }

    int checkCapacity(){ //when called, returns the number of guests occupying a room (by seeing if each slot is not null)
        int c = 0;
        if (guestOne != null){
            c++;
        }
        if (guestTwo != null){
            c++;
        }
        return c;
    }

    void printGuestInfo(){ //when called, prints Guest One's name, height, age, and hair color (each on different lines) then does the same for Guest Two
        System.out.println("Guest one: \nName " + guestOne.name + "\nHeight: " + guestOne.height + "\nAge: " + guestOne.age + "\nHair Color: " + guestOne.hairColor);
        System.out.println("Guest two: \nName " + guestTwo.name + "\nHeight: " + guestTwo.height + "\nAge: " + guestTwo.age + "\nHair Color: " + guestTwo.hairColor);
    }
}