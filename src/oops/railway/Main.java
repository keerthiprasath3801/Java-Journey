package oops.railway;

import java.util.Scanner;

public class Main {
    public static void bookTicket(Passenger p){
        TicketBooker booker=new TicketBooker();
        if(TicketBooker.availableWaitingList==0){
            System.out.println("No tickets available ");
        }
        if((p.berthPreferance.equals("L") && TicketBooker.availableLowerBerths>0)||
                (p.berthPreferance.equals("M") && TicketBooker.availableMiddleBerths>0)||
                (p.berthPreferance.equals("U") && TicketBooker.availableUpperBerths>0)
        ){
            System.out.println("Prefered berth available : ");
            if(p.berthPreferance.equals("L")){
                System.out.println("Lower Berth Given ");
                booker.bookTicket(p,(TicketBooker.lowerBerthsPositions.get(0)),"L");
                TicketBooker.lowerBerthsPositions.remove(0);
                TicketBooker.availableLowerBerths--;
            } else if (p.berthPreferance.equals("M")) {
                System.out.println("Middle berth given : ");
                booker.bookTicket(p,(TicketBooker.middleBerthPosition.get(0)),"M");
                TicketBooker.middleBerthPosition.remove(0);
                TicketBooker.availableMiddleBerths--;
            } else if (p.berthPreferance.equals("U")) {
                System.out.println("Upper berth given : ");
                booker.bookTicket(p,(TicketBooker.upperBerthPosition.get(0)),"U");
                TicketBooker.upperBerthPosition.remove(0);
                TicketBooker.availableUpperBerths--;
            }
        } else if (TicketBooker.availableLowerBerths > 0) {
            System.out.println("Lower Berth Given ");
            booker.bookTicket(p,(TicketBooker.lowerBerthsPositions.get(0)),"L");
            TicketBooker.lowerBerthsPositions.remove(0);
            TicketBooker.availableLowerBerths--;

        } else if (TicketBooker.availableMiddleBerths>0) {
            System.out.println("Middle berth Given ");
            booker.bookTicket(p,(TicketBooker.middleBerthPosition.get(0)),"M");
            TicketBooker.middleBerthPosition.remove(0);
            TicketBooker.availableMiddleBerths--;
        } else if (TicketBooker.availableUpperBerths>0) {
            System.out.println("Upper berth given : ");
            booker.bookTicket(p,(TicketBooker.upperBerthPosition.get(0)),"U");
            TicketBooker.upperBerthPosition.remove(0);
            TicketBooker.availableUpperBerths--;
        } else if (TicketBooker.availableRacTickets>0) {
            System.out.println("RAC available : ");
            booker.addToRAC(p,(TicketBooker.racPositions.get(0)),"RAC");
        } else if (TicketBooker.availableWaitingList>0) {
            System.out.println("Added to waiting List ");
            booker.addToWaitingList(p,(TicketBooker.waitingListPositions.get(0)),"WL");
        }

    }
    public static void cancelTicket(int id ){
        TicketBooker booker=new TicketBooker();
        if(!booker.passenger.containsKey(id)){
            System.out.println("The passenger detail is unknown : ");
        }else {
            booker.cancelTicket(id);
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        boolean loop=true;

        while (loop){
            System.out.println(" 1.Book Ticket \n 2. Cancel Ticket \n 3. Available Ticket \n 4.Booked Tickets \n 5.Exit ");
            int choice = scan.nextInt();
            switch (choice){
                case 1:
                {
                    System.out.println("Enter the passenger name,age and berth preference (L,M,U) ");
                    String name= scan.next();
                    int age=scan.nextInt();
                    String berthPreference=scan.next();
                    Passenger p=new Passenger(name,age,berthPreference);
                    bookTicket(p);
                }
                break;
                case 2:
                {
                    System.out.println("Enter passenger id to cancel : ");
                    int id=scan.nextInt();
                    cancelTicket(id);
                }
                break;
                case 3:
                {
                    TicketBooker booker=new TicketBooker();
                    booker.printAvailable();
                }
                break;
                case 4:
                {
                    TicketBooker booker=new TicketBooker();
                    booker.printPassengers();
                }
                case 5:
                {
                    loop=false;
                }
                break;
                default:
                    break;
            }
        }
    }
}
