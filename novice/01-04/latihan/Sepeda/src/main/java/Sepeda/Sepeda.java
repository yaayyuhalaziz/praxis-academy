package Sepeda;
class Bicycle {
    public int cadence;
    public int gear;
    public int speed;

    // Constructor
    public Bicycle(int startCadence, int startGear, int startSpeed) {
        cadence = startCadence;
        gear = startGear;
        speed = startSpeed;
    }

    public void setCadence(int newValue) {
        cadence = newValue;
    }
    public void setGear(int newValue) {
        gear = newValue;
    }
    public void applyBrake(int decrement) {
        speed -= decrement;
        System.out.println("applyBrake "+decrement+".\tSpeed now : "+speed);
    }
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("speedUp "+increment+".\tSpeed now : "+speed);
    }
}

class MountainBike extends Bicycle {
    public int seatHeight;

    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}

public class Sepeda {
    public static void main(String[] args) {
        MountainBike objSepedaGunung = new MountainBike(10, 8, 10, 5);
        objSepedaGunung.speedUp(6);
        objSepedaGunung.applyBrake(3);
        objSepedaGunung.applyBrake(1);
        objSepedaGunung.speedUp(3);
        objSepedaGunung.speedUp(2);
        objSepedaGunung.speedUp(5);
        objSepedaGunung.applyBrake(2);
    }
}