package oops.busreservation;

import java.util.ArrayList;
import java.util.Scanner;

public class BusMain {
    public static void main(String[] args) {
        ArrayList<Bus> bus=new ArrayList<>();

        ArrayList<Booking>bookings=new ArrayList<Booking>();

        bus.add(new Bus(1,true,3));
        bus.add(new Bus(2,true,2));
        bus.add(new Bus(3,true,4));

        int userOpt=1;
        Scanner scan=new Scanner(System.in);
        for(Bus b:bus){
            b.displayBusInfo();
        }
        while(userOpt==1){
            System.out.println("Enter 1 to book and 2 to exit ");
            userOpt=scan.nextInt();
            if(userOpt==1){
                Booking booking=new Booking();
                if(booking.isAvailable(bookings,bus)){
                    bookings.add(booking);
                    System.out.println("Your booking is Confirmed : ");
                }else{
                    System.out.println("Sorry no seats are available  ");
                }
            }
       }
    }
}
