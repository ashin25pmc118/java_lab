interface WiFiEnabled {
    void connectWiFi(String networkName);
    void disconnectWiFi();
}

interface VoiceControlled {
    void processVoiceCommand(String command);
}

interface MusicPlayer {
    void playAudio(String trackTitle);
    void stopAudio();
}

interface VideoStreaming {
    void streamVideo(String videoTitle, String resolution);
}

interface TemperatureMonitor {
    double readTemperature();
    void setTargetTemperature(double targetTemp);
}

class SmartPhone implements WiFiEnabled, VoiceControlled, MusicPlayer, VideoStreaming {
    private String deviceName;

    public SmartPhone(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void connectWiFi(String networkName) {
        System.out.println("[" + deviceName + "] Connected to Wi-Fi: " + networkName);
    }

    @Override
    public void disconnectWiFi() {
        System.out.println("[" + deviceName + "] Disconnected from Wi-Fi.");
    }

    @Override
    public void processVoiceCommand(String command) {
        System.out.println("[" + deviceName + "] Siri/Assistant processed voice command: \"" + command + "\"");
    }

    @Override
    public void playAudio(String trackTitle) {
        System.out.println("[" + deviceName + "] Playing music track: " + trackTitle);
    }

    @Override
    public void stopAudio() {
        System.out.println("[" + deviceName + "] Audio playback stopped.");
    }

    @Override
    public void streamVideo(String videoTitle, String resolution) {
        System.out.println("[" + deviceName + "] Streaming video '" + videoTitle + "' in " + resolution);
    }
}

class SmartSpeaker implements WiFiEnabled, VoiceControlled, MusicPlayer {
    private String deviceName;

    public SmartSpeaker(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void connectWiFi(String networkName) {
        System.out.println("[" + deviceName + "] Connected to Wi-Fi: " + networkName);
    }

    @Override
    public void disconnectWiFi() {
        System.out.println("[" + deviceName + "] Disconnected from Wi-Fi.");
    }

    @Override
    public void processVoiceCommand(String command) {
        System.out.println("[" + deviceName + "] Alexa voice command acknowledged: \"" + command + "\"");
    }

    @Override
    public void playAudio(String trackTitle) {
        System.out.println("[" + deviceName + "] High-fidelity sound playing: " + trackTitle);
    }

    @Override
    public void stopAudio() {
        System.out.println("[" + deviceName + "] Speaker audio paused.");
    }
}

class SmartThermostat implements WiFiEnabled, VoiceControlled, TemperatureMonitor {
    private String deviceName;
    private double currentTemp = 24.0;

    public SmartThermostat(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void connectWiFi(String networkName) {
        System.out.println("[" + deviceName + "] Connected to Home Wi-Fi: " + networkName);
    }

    @Override
    public void disconnectWiFi() {
        System.out.println("[" + deviceName + "] Disconnected from Home Wi-Fi.");
    }

    @Override
    public void processVoiceCommand(String command) {
        System.out.println("[" + deviceName + "] Climate voice command: \"" + command + "\"");
    }

    @Override
    public double readTemperature() {
        return currentTemp;
    }

    @Override
    public void setTargetTemperature(double targetTemp) {
        this.currentTemp = targetTemp;
        System.out.println("[" + deviceName + "] Thermostat updated target temperature to " + targetTemp + "°C");
    }
}

class SmartTV implements WiFiEnabled, MusicPlayer, VideoStreaming {
    private String deviceName;

    public SmartTV(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    public void connectWiFi(String networkName) {
        System.out.println("[" + deviceName + "] 4K Smart TV online via Wi-Fi: " + networkName);
    }

    @Override
    public void disconnectWiFi() {
        System.out.println("[" + deviceName + "] Smart TV Wi-Fi disconnected.");
    }

    @Override
    public void playAudio(String trackTitle) {
        System.out.println("[" + deviceName + "] Playing Spotify through Dolby Soundbar: " + trackTitle);
    }

    @Override
    public void stopAudio() {
        System.out.println("[" + deviceName + "] Audio playback stopped.");
    }

    @Override
    public void streamVideo(String videoTitle, String resolution) {
        System.out.println("[" + deviceName + "] Streaming Netflix 4K HDR: '" + videoTitle + "' at " + resolution);
    }
}

class SmartCar implements WiFiEnabled, VoiceControlled, MusicPlayer, VideoStreaming {
    private String modelName;

    public SmartCar(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void connectWiFi(String networkName) {
        System.out.println("[" + modelName + "] In-car 5G Wi-Fi hotspot active on: " + networkName);
    }

    @Override
    public void disconnectWiFi() {
        System.out.println("[" + modelName + "] In-car Wi-Fi hotspot deactivated.");
    }

    @Override
    public void processVoiceCommand(String command) {
        System.out.println("[" + modelName + "] AI Dashboard Voice Command: \"" + command + "\"");
    }

    @Override
    public void playAudio(String trackTitle) {
        System.out.println("[" + modelName + "] Premium surround audio playing: " + trackTitle);
    }

    @Override
    public void stopAudio() {
        System.out.println("[" + modelName + "] Car audio stopped.");
    }

    @Override
    public void streamVideo(String videoTitle, String resolution) {
        System.out.println("[" + modelName + "] Rear-seat infotainment streaming: '" + videoTitle + "' (" + resolution + ")");
    }
}

public class SmartDevice {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("      SMART DEVICE CONTROL SYSTEM DEMONSTRATION   ");
        System.out.println("==================================================");

        System.out.println("\n--- 1. Testing SmartPhone ---");
        SmartPhone phone = new SmartPhone("iPhone 15 Pro");
        phone.connectWiFi("Campus_5G");
        phone.processVoiceCommand("Set an alarm for 6 AM");
        phone.playAudio("Bohemian Rhapsody");
        phone.streamVideo("Nature Documentary", "1080p");
        phone.stopAudio();
        phone.disconnectWiFi();

        System.out.println("\n--- 2. Testing SmartSpeaker ---");
        SmartSpeaker echo = new SmartSpeaker("Amazon Echo Studio");
        echo.connectWiFi("Home_Network");
        echo.processVoiceCommand("Play jazz music");
        echo.playAudio("Take Five - Dave Brubeck");
        echo.stopAudio();

        System.out.println("\n--- 3. Testing SmartThermostat ---");
        SmartThermostat nest = new SmartThermostat("Nest Learning Thermostat");
        nest.connectWiFi("Home_IoT_Secure");
        System.out.println("Current Temperature: " + nest.readTemperature() + "°C");
        nest.processVoiceCommand("Decrease temperature by 2 degrees");
        nest.setTargetTemperature(22.0);

        System.out.println("\n--- 4. Testing SmartTV ---");
        SmartTV oledTv = new SmartTV("LG OLED G3");
        oledTv.connectWiFi("LivingRoom_5G");
        oledTv.streamVideo("Interstellar", "4K Ultra-HD");
        oledTv.playAudio("Hans Zimmer Soundtrack");

        System.out.println("\n--- 5. Testing SmartCar (Multiple Inheritance Extension) ---");
        SmartCar tesla = new SmartCar("Tesla Model S Plaid");
        tesla.connectWiFi("Tesla_Mobile_Network");
        tesla.processVoiceCommand("Navigate to university campus and turn on seat heaters");
        tesla.playAudio("Synthwave Drive Playlist");
        tesla.streamVideo("Live Traffic & Rear Camera Feed", "1080p");

        System.out.println("\n==================================================");
        System.out.println("     ALL SMART DEVICE FEATURES VERIFIED           ");
        System.out.println("==================================================");
    }
}
