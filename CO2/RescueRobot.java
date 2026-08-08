public abstract class RescueRobot {
    protected String robotId;
    protected String modelName;
    protected int batteryPercentage;

    public RescueRobot(String robotId, String modelName, int batteryPercentage) {
        this.robotId = robotId;
        this.modelName = modelName;
        this.batteryPercentage = batteryPercentage;
    }

    public void displayStatus() {
        System.out.println("--------------------------------------------------");
        System.out.println("Robot ID    : " + robotId);
        System.out.println("Model       : " + modelName);
        System.out.println("Battery     : " + batteryPercentage + "%");
    }

    public void recharge() {
        this.batteryPercentage = 100;
        System.out.println("[" + modelName + "] Recharged fully to 100%.");
    }

    public abstract void performMission();

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("      EMERGENCY RESCUE ROBOT COMMAND FLEET        ");
        System.out.println("==================================================");

        RescueRobot[] fleet = new RescueRobot[] {
            new AerialDroneRobot("ROB-AIR-01", "SkyGuardian Drone", 95),
            new SubmarineRescueRobot("ROB-SEA-02", "AquaRescue Sub", 80),
            new MountainRescueRobot("ROB-MNT-03", "ApexClimber Quad", 90),
            new AmphibiousRescueRobot("ROB-HYB-04", "Hydra Amphibian", 88)
        };

        System.out.println("\n--- Deploying Fleet via Abstract Class References ---");
        for (RescueRobot robot : fleet) {
            robot.displayStatus();
            robot.performMission();
        }

        System.out.println("\n==================================================");
        System.out.println("--- Executing Specialized Capabilities via Interfaces ---");

        System.out.println("\n[Testing Flyable Capability Reference]:");
        Flyable flyer = (Flyable) fleet[0];
        flyer.takeOff();
        flyer.flyTo(12.9716, 77.5946);
        flyer.land();

        System.out.println("\n[Testing Swimmable Capability Reference]:");
        Swimmable swimmer = (Swimmable) fleet[1];
        swimmer.dive(75);
        swimmer.surface();

        System.out.println("\n[Testing Climbable Capability Reference]:");
        Climbable climber = (Climbable) fleet[2];
        climber.scaleVerticalSurface(150.0);
        climber.anchorCable();

        System.out.println("\n[Testing Multi-Interface Amphibious Hybrid]:");
        AmphibiousRescueRobot hybrid = (AmphibiousRescueRobot) fleet[3];
        Flyable hybridFlyer = hybrid;
        Swimmable hybridSwimmer = hybrid;

        hybridFlyer.takeOff();
        hybridFlyer.flyTo(13.0827, 80.2707);
        hybridFlyer.land();
        hybridSwimmer.dive(20);
        hybridSwimmer.surface();

        System.out.println("\n==================================================");
        System.out.println("       ALL RESCUE OPERATIONS COMPLETED            ");
        System.out.println("==================================================");
    }
}

interface Flyable {
    void takeOff();
    void flyTo(double latitude, double longitude);
    void land();
}

interface Swimmable {
    void dive(int depthMeters);
    void surface();
}

interface Climbable {
    void scaleVerticalSurface(double heightMeters);
    void anchorCable();
}

class AerialDroneRobot extends RescueRobot implements Flyable {
    public AerialDroneRobot(String robotId, String modelName, int batteryPercentage) {
        super(robotId, modelName, batteryPercentage);
    }

    @Override
    public void performMission() {
        System.out.println("[" + modelName + "] Conducting aerial thermal search for survivors.");
    }

    @Override
    public void takeOff() {
        System.out.println("[" + modelName + "] Vertical takeoff initiated with quad-rotors.");
    }

    @Override
    public void flyTo(double latitude, double longitude) {
        System.out.printf("[%s] Flying autonomously to GPS (%.4f, %.4f)\n", modelName, latitude, longitude);
    }

    @Override
    public void land() {
        System.out.println("[" + modelName + "] Soft landed safely on designated beacon.");
    }
}

class SubmarineRescueRobot extends RescueRobot implements Swimmable {
    public SubmarineRescueRobot(String robotId, String modelName, int batteryPercentage) {
        super(robotId, modelName, batteryPercentage);
    }

    @Override
    public void performMission() {
        System.out.println("[" + modelName + "] Conducting underwater hull search and life-pod recovery.");
    }

    @Override
    public void dive(int depthMeters) {
        System.out.println("[" + modelName + "] Diving to depth of " + depthMeters + " meters with sonar active.");
    }

    @Override
    public void surface() {
        System.out.println("[" + modelName + "] Surfaced and transmitting emergency telemetry.");
    }
}

class MountainRescueRobot extends RescueRobot implements Climbable {
    public MountainRescueRobot(String robotId, String modelName, int batteryPercentage) {
        super(robotId, modelName, batteryPercentage);
    }

    @Override
    public void performMission() {
        System.out.println("[" + modelName + "] Navigating rocky canyon to deliver medical supplies.");
    }

    @Override
    public void scaleVerticalSurface(double heightMeters) {
        System.out.println("[" + modelName + "] Scaling vertical cliff face of " + heightMeters + "m using magnetic micro-spines.");
    }

    @Override
    public void anchorCable() {
        System.out.println("[" + modelName + "] Secured titanium anchor cable for rescue team.");
    }
}

class AmphibiousRescueRobot extends RescueRobot implements Flyable, Swimmable {
    public AmphibiousRescueRobot(String robotId, String modelName, int batteryPercentage) {
        super(robotId, modelName, batteryPercentage);
    }

    @Override
    public void performMission() {
        System.out.println("[" + modelName + "] Deploying flood disaster aid across flooded islands.");
    }

    @Override
    public void takeOff() {
        System.out.println("[" + modelName + "] Taking off directly from water surface.");
    }

    @Override
    public void flyTo(double latitude, double longitude) {
        System.out.printf("[%s] Flying over flood zones to coordinates (%.4f, %.4f)\n", modelName, latitude, longitude);
    }

    @Override
    public void land() {
        System.out.println("[" + modelName + "] Water splashdown landing complete.");
    }

    @Override
    public void dive(int depthMeters) {
        System.out.println("[" + modelName + "] Retracting wings and submerging " + depthMeters + "m for submerged search.");
    }

    @Override
    public void surface() {
        System.out.println("[" + modelName + "] Surfacing and converting back to flight mode.");
    }
}
