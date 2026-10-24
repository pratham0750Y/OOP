interface ParkingCharge {
    void calculatecharge();
    void displayDetails();
}

class Vehicle_parking implements ParkingCharge {
    String number, type; 
    int hours;
    double charge;

    Vehicle_parking(String number, String type, int hours) {
        this.number = number;
        this.type = type; 
        this.hours = hours;
    }
 
    public void calculatecharge() {}
   
    public void displayDetails() {
        System.out.println("number=" + number + "\nType=" + type + "\nhours=" + hours + "\ncharge=" + charge);
    }
}
   
class twowheeler extends Vehicle_parking {
    twowheeler(String number, int hours) {
        super(number, "two wheeler", hours);
    }
   
    @Override
    public void calculatecharge() {
        if (hours <= 2)
            charge = hours * 20;
        else
            charge = 40 + (hours - 2) * 10;
    } 
} 
   
class fourwheeler extends Vehicle_parking {
    fourwheeler(String number, int hours) {
        super(number, "four wheeler", hours);
    }
   
    @Override
    public void calculatecharge() {
        if (hours <= 2)
            charge = hours * 50;
        else
            charge = 100 + (hours - 2) * 30;
    } 
} 
   
public class parking {
    public static void main(String[] args) {
        twowheeler t = new twowheeler("KA123", 5);
        t.calculatecharge();
        t.displayDetails();
         
        System.out.println();    
         
        fourwheeler f = new fourwheeler("KA675", 3);
        f.calculatecharge(); 
        f.displayDetails();
    }
}
