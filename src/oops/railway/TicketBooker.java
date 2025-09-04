package oops.railway;

import java.util.*;

public class TicketBooker {
    static int availableLowerBerths=1;
    static int availableMiddleBerths=1;
    static int availableUpperBerths=1;
    static int availableRacTickets=1;
    static int availableWaitingList=1;

    static Queue<Integer> waitingList=new LinkedList<>();
    static Queue<Integer> racList=new LinkedList<>();
    static List<Integer> bookedTicketList=new ArrayList<>();

    static List<Integer>lowerBerthsPositions=new ArrayList<>(Arrays.asList(1));
    static List<Integer> middleBerthPosition=new ArrayList<>(Arrays.asList(1));
    static List<Integer> upperBerthPosition=new ArrayList<>(Arrays.asList(1));
    static List<Integer> racPositions=new ArrayList<>(Arrays.asList(1));
    static List<Integer> waitingListPositions=new ArrayList<>(Arrays.asList(1));

    static Map<Integer,Passenger> passenger=new HashMap<>();

    public void bookTicket(Passenger p,int berthinfo,String allotedBerth){
        p.number=berthinfo;
        p.alloted=allotedBerth;
        passenger.put(p.passengerId,p);
        bookedTicketList.add(p.passengerId);
        System.out.println("=====================Booked Succesfully===================");
    }
    public void addToRAC(Passenger p,int racInfo,String allotedRAC){
        p.number=racInfo;
        p.alloted=allotedRAC;
        passenger.put(p.passengerId,p);
        racList.add(p.passengerId);
        availableRacTickets--;
        racPositions.remove(0);
        System.out.println("=====added to rac succesfully =====");
    }
    public void addToWaitingList(Passenger p,int waitingListInfo,String allotedWL){
        p.number=waitingListInfo;
        p.alloted=allotedWL;
        passenger.put(p.passengerId,p);
        waitingList.add(p.passengerId);
        availableWaitingList--;
        System.out.println("============added to waiting List succesfully ============");
    }
    //cancel ticket
    public void cancelTicket(int passengerId)
    {
        //remove the passenger from the map
        Passenger p = passenger.get(passengerId);
        passenger.remove(Integer.valueOf(passengerId));
        //remove the booked ticket from the list
        bookedTicketList.remove(Integer.valueOf(passengerId));

        //take the booked position which is now free
        int positionBooked = p.number;

        System.out.println("---------------cancelled Successfully");

        //add the free position to the correspoding type of list (either L,M,U)
        if(p.alloted.equals("L"))
        {
            availableLowerBerths++;
            lowerBerthsPositions.add(positionBooked);
        }
        else if(p.alloted.equals("M"))
        {
            availableMiddleBerths++;
            middleBerthPosition.add(positionBooked);
        }
        else if(p.alloted.equals("U"))
        {
            availableUpperBerths++;
            upperBerthPosition.add(positionBooked);
        }

        //check if any RAC is there
        if(racList.size() > 0)
        {
            //take passenger from RAC and increase the free space in RAC list and increase available RAC tickets
            Passenger passengerFromRAC = passenger.get(racList.poll());
            int positionRac = passengerFromRAC.number;
            racPositions.add(positionRac);
            racList.remove(Integer.valueOf(passengerFromRAC.passengerId));
            availableRacTickets++;

            //check if any WL is there
            if(waitingList.size()>0)
            {
                //take the passenger from WL and add them to RAC , increase the free space in waiting list and
                //increase available WL and decrease available RAC by 1
                Passenger passengerFromWaitingList = passenger.get(waitingList.poll());
                int positionWL = passengerFromWaitingList.number;
                waitingListPositions.add(positionWL);
                waitingList.remove(Integer.valueOf(passengerFromWaitingList.passengerId));

                passengerFromWaitingList.number = racPositions.get(0);
                passengerFromWaitingList.alloted = "RAC";
                racPositions.remove(0);
                racList.add(passengerFromWaitingList.passengerId);

                availableWaitingList++;
                availableRacTickets--;
            }
            // now we have a passenger from RAc to whom we can book a ticket,
            //so book the cancelled ticket to the RAC passenger
            Main.bookTicket(passengerFromRAC);
        }

    }

    //print all available seats
    public void printAvailable()
    {
        System.out.println("Available Lower Berths "  + availableLowerBerths);
        System.out.println("Available Middle Berths "  + availableMiddleBerths);
        System.out.println("Available Upper Berths "  + availableUpperBerths);
        System.out.println("Availabel RACs " + availableRacTickets);
        System.out.println("Available Waiting List " + availableWaitingList);
        System.out.println("--------------------------");
    }

    //print all occupied passengers from all types including WL
    public void printPassengers()
    {
        if(passenger.size() == 0)
        {
            System.out.println("No details of passengers");
            return;
        }
        for(Passenger p : passenger.values())
        {
            System.out.println("PASSENGER ID " + p.passengerId );
            System.out.println(" Name " + p.name );
            System.out.println(" Age " + p.age );
            System.out.println(" Status " + p.number + p.alloted);
            System.out.println("--------------------------");
        }
    }
}
