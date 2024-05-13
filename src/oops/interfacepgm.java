package oops;

interface Car {
    void acceleration();
    void engineSpeed();
}

interface CarWorkshop {
    void workshopDetails();
}

class Maruti implements Car, CarWorkshop {
    @Override
    public void acceleration() {
        System.out.println("Maruti Acceleration");
    }

    @Override
    public void engineSpeed() {
        System.out.println("Maruti Engine Speed");
    }

    @Override
    public void workshopDetails() {
        System.out.println("Maruti Service Center");
    }
}

public class interfacepgm {
    public static void main(String[] args) {
        Maruti marutiCar = new Maruti();
        marutiCar.acceleration();
        marutiCar.engineSpeed();
        marutiCar.workshopDetails();
    }
}
