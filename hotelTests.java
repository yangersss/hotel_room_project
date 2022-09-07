package hotel_room_project;

import java.util.*;
public class hotelTests {
    Scanner input_scanner;
    hotelTests(){
        input_scanner = new Scanner(System.in);
        runTest();
    }

    void printGuestNames(HotelRoom room){
        System.out.println("--- In HotelRoom " + room.roomNumber +" :");
        System.out.println("    guestOne is " + room.guestOne.name);
        System.out.println("    guestTwo is " + room.guestTwo.name);
        System.out.println("------------------------------------------");
    }

    // tests to see if person is checked into a hotel room
    boolean checkedInRoom(HotelRoom room, Person guest){
        if(room.guestOne!=guest && room.guestTwo!=guest){
            System.out.println(guest.name + " was not checked in.");
            printGuestNames(room);
            return false;
        }
        System.out.println(guest.name + " is in room " + room.roomNumber);
        return true;
    }

    void runTest(){
        System.out.println("Type in 1, 2, or 3 to run a test. Type 'e' to exit.");
        String input;
        boolean passed;
        while(true){
            input = input_scanner.nextLine();
            switch(input){
                case "1":
                    passed = runTestOne();
                    break;
                case "2":
                    passed = runTestTwo();
                    break;
                case "3":
                    passed = runTestThree();
                    break;
                case "e":
                    System.exit(0);
                default:
                    System.out.println("Please enter in a valid input.");
            }
            if(passed){
                System.out.println("Ran test " + input + " correctly.");
            }
            else{
                System.out.println("failed test " + input + ".");
            }
        }
    }

    // Testing checkIn and checkOut functions for errors
    boolean runTestOne(){
        try{
            HotelRoom room_one = new HotelRoom(1);
            Person person_one = new Person(5.7, 16, "George", "Brown");
            Person person_two = new Person(3.4, 34, "Joe", "Purple");

            room_one.checkIn(person_one);
            room_one.checkIn(person_two);

            room_one.checkOut(person_one);
            room_two.checkOut(person_two);
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    // tests for people being checked in/out correctly
    boolean runTestTwo(){
        try{
            boolean failure = false;
            HotelRoom room_one = new HotelRoom(1);
            Person person_one = new Person(5.7, 16, "George", "Brown");
            Person person_two = new Person(3.4, 34, "Joe", "Purple");
            
            // check in test
            room_one.checkIn(person_one);
            room_one.checkIn(person_two);

            if(!checkedInRoom(room_one, person_one)){
                failure = true;
            }
            if(!checkedInRoom(room_one, person_two)){
                failure = true;
            }

            // check out test
            room_one.checkOut(person_one);
            if(checkedInRoom(room_one, person_one)){
                System.out.print(person_one.name + " was not checked out properly.\n");
                printGuestNames(room_one);
                failure = true;
            }
            room_one.checkOut(person_two);
            if(checkedInRoom(room_one, person_two)){
                System.out.print(person_two.name + " was not checked out properly.\n");
                printGuestNames(room_one);
                failure = true;
            }

            // third person check
            Person person_three = new Person(6.7, 280, "Old Bill", "Gray");
            room_one.checkIn(person_three);
            if(!checkedInRoom(room_one, person_three)){
                printGuestNames(room_one);
                failure = true;
            }

            if(failure){
                return false;
            }
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }    
    }

    boolean runTestThree(){
        return true;
    }
}
