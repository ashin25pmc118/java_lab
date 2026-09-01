class Vehicle {
    protected String regNo;
    protected double dailyRate;
    Vehicle(String regNo, double dailyRate) {
        this.regNo = regNo;
        this.dailyRate = dailyRate;
    }
    double computeRent(int days) {
        return dailyRate * days;
    }
}
class Car extends Vehicle {
    private int numDoors;
    Car(String regNo, double dailyRate, int numDoors) {
        super(regNo, dailyRate); // Call parent constructor
        this.numDoors = numDoors;
    }
    @Override
    double computeRent(int days) {
        return super.computeRent(days) + 200; // Base rent + flat feehntbgrvfecdwxsz
    }
}
public class VehicleRental {
    public static void main(String[] args) {
        Car c = new Car("KL01AB1234", 1500, 4);
        System.out.println("Rent = " + c.computeRent(3));
    }
}