package oops.railway;

public class Passenger {
    static int id=1;
    int age;
    String name;
    String berthPreferance;
    int passengerId;//U or L or M//id of passenger created automatically
    String alloted;//alloted type (L,U,M,RAC,WL)
    int number;//seat number

    public Passenger(String name,int age,String berthPreferance){
        this.name=name;
        this.age=age;
        this.berthPreferance=berthPreferance;
        this.passengerId=id++;
        alloted="";
        number=-1;
    }

}
