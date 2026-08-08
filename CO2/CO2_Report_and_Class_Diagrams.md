# CO2 Lab Report & OOP Architecture Design

**Topic**: Abstract Classes, Abstract Methods, Interfaces, and Multiple Inheritance in Java  
**Course**: PMC2522 Java Programming Laboratory  

---

## 1. Executive Summary & Core OOP Architectural Analysis

This laboratory exercise explores fundamental object-oriented design patterns by leveraging **Abstract Classes** and **Interfaces** to build extensible, maintainable, and type-safe software systems.

---

## 2. Theoretical Analysis & Design Decisions

### (1) Why Abstract Classes Were Used
- **Shared State and Code Reuse**: In **Task 1** (`StudentEvaluation`) and **Task 3** (`RescueRobot`), entities possess common attributes (e.g., `studentId`, `studentName`, `robotId`, `batteryPercentage`) and common behaviors (e.g., `displayDetails()`, `displayStatus()`, `recharge()`).
- **Enforcing Concrete Contracts**: An abstract class allows providing full concrete implementations of standard boilerplate methods while enforcing that domain-specific behaviors (e.g., `calculateTotalMarks()`, `displayGrade()`, `performMission()`) must be overridden by concrete derived classes.
- **Hierarchical "IS-A" Relationships**: A Postgraduate course *is a* Student Evaluation; a Mountain Robot *is a* Rescue Robot.

### (2) Why Interfaces Were Used
- **Capability Contracts ("CAN-DO" Relationship)**: In **Task 2** (`SmartDeviceControlSystem`) and **Task 3** (`EmergencyRescueRobot`), capabilities like Wi-Fi connectivity (`WiFiEnabled`), streaming (`VideoStreaming`), flying (`Flyable`), or swimming (`Swimmable`) cut across disparate object hierarchies.
- **Decoupling and Polymorphic References**: By programming to interfaces, a client can interact with an object through a specific role (e.g., controlling a device as a `MusicPlayer` or piloting a robot as a `Flyable`) regardless of its concrete underlying class.

### (3) Where Multiple Inheritance Was Required
- **Java's Single Inheritance Constraint**: In Java, a class cannot extend multiple classes (`class C extends A, B` is prohibited) to prevent the "Diamond Problem" (ambiguity in state and implementation inheritance).
- **Multiple Interface Inheritance**: 
  - In **Task 2**, a `SmartCar` must concurrently function as a `WiFiEnabled`, `VoiceControlled`, `MusicPlayer`, and `VideoStreaming` hub.
  - In **Task 3**, an `AmphibiousRescueRobot` must implement both `Flyable` and `Swimmable` while still being a `RescueRobot`.
  - Interfaces enable classes to implement multiple orthogonal capabilities safely without conflicting class state.

### (4) Feasibility of Implementing Using Only Classes
- **Limitations of a Class-Only Approach**:
  1. Without interfaces, multiple inheritance cannot be achieved in Java. If `Flyable` and `Swimmable` were classes, `AmphibiousRescueRobot` could only inherit from one of them, forcing code duplication or an awkward, brittle deeply-nested inheritance chain.
  2. Classes unrelated by inheritance (e.g., `SmartPhone` and `SmartTV`) could not share a unified `MusicPlayer` or `VideoStreaming` reference type.
  3. Design would violate the **Interface Segregation Principle (ISP)** and **Open/Closed Principle (OCP)**.

---

## 3. Class Diagrams

### Task 1: University Evaluation System
```mermaid
classDiagram
    class StudentEvaluation {
        <<Abstract>>
        #String studentId
        #String studentName
        #String courseType
        +StudentEvaluation(studentId, studentName, courseType)
        +displayDetails() void
        +calculateTotalMarks()* double
        +displayGrade()* void
    }

    class UGCourseEvaluation {
        -double theoryMarks
        -double practicalMarks
        +calculateTotalMarks() double
        +displayGrade() void
    }

    class PGCourseEvaluation {
        -double theoryMarks
        -double researchMarks
        +calculateTotalMarks() double
        +displayGrade() void
    }

    class CertificateCourseEvaluation {
        -double caMarks
        -double finalExamMarks
        +calculateTotalMarks() double
        +displayGrade() void
    }

    class ExecutiveCourseEvaluation {
        -double caseStudyMarks
        -double capstoneMarks
        -double vivaMarks
        +calculateTotalMarks() double
        +displayGrade() void
    }

    StudentEvaluation <|-- UGCourseEvaluation
    StudentEvaluation <|-- PGCourseEvaluation
    StudentEvaluation <|-- CertificateCourseEvaluation
    StudentEvaluation <|-- ExecutiveCourseEvaluation
```

---

### Task 2: Smart Device Control System
```mermaid
classDiagram
    class WiFiEnabled {
        <<Interface>>
        +connectWiFi(networkName) void
        +disconnectWiFi() void
    }
    class VoiceControlled {
        <<Interface>>
        +processVoiceCommand(command) void
    }
    class MusicPlayer {
        <<Interface>>
        +playAudio(trackTitle) void
        +stopAudio() void
    }
    class VideoStreaming {
        <<Interface>>
        +streamVideo(videoTitle, resolution) void
    }
    class TemperatureMonitor {
        <<Interface>>
        +readTemperature() double
        +setTargetTemperature(targetTemp) void
    }

    class SmartPhone {
        -String deviceName
    }
    class SmartSpeaker {
        -String deviceName
    }
    class SmartThermostat {
        -String deviceName
        -double currentTemp
    }
    class SmartTV {
        -String deviceName
    }
    class SmartCar {
        -String modelName
    }

    WiFiEnabled <|.. SmartPhone
    VoiceControlled <|.. SmartPhone
    MusicPlayer <|.. SmartPhone
    VideoStreaming <|.. SmartPhone

    WiFiEnabled <|.. SmartSpeaker
    VoiceControlled <|.. SmartSpeaker
    MusicPlayer <|.. SmartSpeaker

    WiFiEnabled <|.. SmartThermostat
    VoiceControlled <|.. SmartThermostat
    TemperatureMonitor <|.. SmartThermostat

    WiFiEnabled <|.. SmartTV
    MusicPlayer <|.. SmartTV
    VideoStreaming <|.. SmartTV

    WiFiEnabled <|.. SmartCar
    VoiceControlled <|.. SmartCar
    MusicPlayer <|.. SmartCar
    VideoStreaming <|.. SmartCar
```

---

### Task 3: Emergency Rescue Robot
```mermaid
classDiagram
    class RescueRobot {
        <<Abstract>>
        #String robotId
        #String modelName
        #int batteryPercentage
        +RescueRobot(robotId, modelName, batteryPercentage)
        +displayStatus() void
        +recharge() void
        +performMission()* void
    }

    class Flyable {
        <<Interface>>
        +takeOff() void
        +flyTo(lat, lon) void
        +land() void
    }

    class Swimmable {
        <<Interface>>
        +dive(depthMeters) void
        +surface() void
    }

    class Climbable {
        <<Interface>>
        +scaleVerticalSurface(heightMeters) void
        +anchorCable() void
    }

    class AerialDroneRobot {
        +performMission() void
    }
    class SubmarineRescueRobot {
        +performMission() void
    }
    class MountainRescueRobot {
        +performMission() void
    }
    class AmphibiousRescueRobot {
        +performMission() void
    }

    RescueRobot <|-- AerialDroneRobot
    Flyable <|.. AerialDroneRobot

    RescueRobot <|-- SubmarineRescueRobot
    Swimmable <|.. SubmarineRescueRobot

    RescueRobot <|-- MountainRescueRobot
    Climbable <|.. MountainRescueRobot

    RescueRobot <|-- AmphibiousRescueRobot
    Flyable <|.. AmphibiousRescueRobot
    Swimmable <|.. AmphibiousRescueRobot
```

---

## 4. Verification & Output Summary

All classes compiled cleanly with modern JDK 26, executing polymorphism across both abstract class reference arrays and specialized interface capability handlers.
