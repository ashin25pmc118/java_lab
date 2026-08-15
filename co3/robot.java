// Task 3: Rescue Robot System using Abstract Class and Interfaces

abstract class RescueRobot {
    String robotID;
    int battery;

    RescueRobot(String robotID, int battery) {
        this.robotID = robotID;
        this.battery = battery;
    }

    void start() {
        System.out.println(robotID + " Started. Battery: " + battery + "%");
    }

    void shutdown() {
        System.out.println(robotID + " Shutdown");
    }

    abstract void performMission();
}

// Interfaces defining specific capabilities
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

interface Climbable {
    void climb();
}

// Drone Robot can fly
class DroneRobot extends RescueRobot implements Flyable {
    DroneRobot(String robotID, int battery) {
        super(robotID, battery);
    }

    @Override
    void performMission() {
        System.out.println(robotID + " is searching from the sky.");
    }

    @Override
    public void fly() {
        System.out.println(robotID + " is flying over the target area.");
    }
}

// Ultimate Rescue Robot implements multiple interfaces
class UltimateRescueRobot extends RescueRobot implements Flyable, Swimmable, Climbable {
    UltimateRescueRobot(String robotID, int battery) {
        super(robotID, battery);
    }

    @Override
    void performMission() {
        System.out.println(robotID + " is performing a complete rescue operation.");
    }

    @Override
    public void fly() {
        System.out.println(robotID + " is flying.");
    }

    @Override
    public void swim() {
        System.out.println(robotID + " is swimming.");
    }

    @Override
    public void climb() {
        System.out.println(robotID + " is climbing obstacles.");
    }
}

public class robot {
    public static void main(String[] args) {
        System.out.println("--- Drone Robot Demo ---");
        DroneRobot drone = new DroneRobot("DR-01", 85);
        drone.start();
        drone.performMission();
        drone.fly();
        drone.shutdown();

        System.out.println("\n--- Ultimate Rescue Robot Demo ---");
        UltimateRescueRobot ultimateRobot = new UltimateRescueRobot("R-101", 95);
        ultimateRobot.start();
        ultimateRobot.performMission();

        // Using interface references
        Flyable flyer = ultimateRobot;
        flyer.fly();

        Swimmable swimmer = ultimateRobot;
        swimmer.swim();

        Climbable climber = ultimateRobot;
        climber.climb();

        ultimateRobot.shutdown();
    }
}
