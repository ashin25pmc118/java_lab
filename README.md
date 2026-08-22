# PMC2522 Java Programming Laboratory

Comprehensive repository containing lab exercises, practical implementations, object-oriented design systems, and evaluation reports for **PMC2522 Java Programming Laboratory**.

---

## 📁 Repository Structure

```text
PMC2522-Java-Lab/
│
├── README.md                                  # Repository overview, table of contents & execution guide
│
├── CO1/                                       # Topic 1–4: Syntax, Data Types, Operators, Control Flow, Arrays
│   ├── StudentInformation.java
│   ├── SimpleInterest.java
│   ├── ErrorCorrection.java
│   ├── DataTypes.java
│   ├── SalaryCalculator.java
│   ├── MaxElementArray.java
│   ├── CountPositiveNegative.java
│   ├── ArithmeticOperations.java
│   ├── SwapTwoNumbers.java
│   ├── OperatorPrecedence.java
│   ├── CheckEvenOdd.java
│   ├── GradeCalculator.java
│   ├── LargestOfThree.java
│   ├── MultiplicationTable.java
│   ├── SumOfDigits.java
│   ├── PrimeNumberCheck.java
│   ├── MenuDrivenCalculator.java
│   ├── PatternPrinting.java
│   ├── ArraySorting.java
│   └── SearchArray.java
│
├── CO2/                                       # Abstract Classes, Interfaces & Multiple Inheritance
│   ├── StudentEvaluation.java                 # University Evaluation System (Abstract Base & Course Schemes)
│   ├── SmartDevice.java                       # Smart Device Control System (Interface-based Multiple Inheritance)
│   ├── RescueRobot.java                       # Emergency Rescue Robot Command Fleet (Polymorphism & Capabilities)
│   └── CO2_Report_and_Class_Diagrams.md       # Comprehensive OOP Evaluation Report & Mermaid Class Diagrams
│
└── Java_Lab_Exercises/                       # Core OOP Concepts & Micro-outcomes
    ├── StudentClass.java                      # Default constructor demonstration
    ├── Employee.java                          # Parameterized constructor demonstration
    ├── Rectangle.java                         # Constructor overloading
    ├── ThisKeyword.java                       # Using 'this' keyword to resolve variable shadowing
    ├── ThisConstructor.java                   # Constructor chaining via this()
    ├── GarbageCollection.java                 # System.gc() and finalize() on multiple objects
    ├── FinalizeMethod.java                    # finalize() method lifecycle demonstration
    ├── MethodOverloadDisplay.java             # Compile-time polymorphism (Method overloading)
    ├── MethodOverloadArea.java                # Overloading area() for Square and Rectangle
    ├── PassObject.java                        # Passing objects as arguments
    ├── BoxComparison.java                     # Object parameters and comparison
    ├── ReturnStudentObject.java               # Methods returning objects
    ├── ReturnCircleObject.java                # Returning computed object instances
    ├── FactorialRecursion.java                # Recursion: Factorial computation
    ├── SumNaturalNumbers.java                 # Recursion: Sum of first n natural numbers
    ├── FibonacciRecursion.java                # Recursion: nth Fibonacci number
    ├── AccessControl.java                     # Encapsulation with private members & getters/setters
    ├── StaticObjectCounter.java               # Static variables for object count tracking
    ├── StaticTemperatureConverter.java        # Static utility methods
    └── FinalKeyword.java                      # Final constants and immutable parameters
```

---

## 🛠️ Compilation & Execution Guide

### Prerequisites
- **JDK (Java Development Kit)**: Version 8 or higher (Tested on JDK 17, 21, 26).

### 1. Running CO1 Programs
Navigate to the root directory and run any CO1 program:
```bash
# Compile
javac CO1/StudentInformation.java

# Run
java -cp CO1 StudentInformation
```

### 2. Running CO2 Programs
Navigate to the root directory and run:
```bash
# University Evaluation System
javac CO2/StudentEvaluation.java
java -cp CO2 StudentEvaluation

# Smart Device Control System
javac CO2/SmartDevice.java
java -cp CO2 SmartDevice

# Emergency Rescue Robot
javac CO2/RescueRobot.java
java -cp CO2 RescueRobot
```

### 3. Running Java Lab Exercises
```bash
# Example: Constructor Chaining
javac Java_Lab_Exercises/ThisConstructor.java
java -cp Java_Lab_Exercises ThisConstructor

# Example: Factorial Recursion
javac Java_Lab_Exercises/FactorialRecursion.java
java -cp Java_Lab_Exercises FactorialRecursion
```

---

## 📋 Course Outcomes & Program Details

### 🔹 CO1: Fundamental Syntax, Operators, Control Statements & Arrays
| Program | Description | Key Concepts |
| :--- | :--- | :--- |
| **StudentInformation** | Student Information Display | Scanner, Formatted Output |
| **SimpleInterest** | Simple Interest & Total Amount | Arithmetic Expressions, Formulas |
| **ErrorCorrection** | Error Correction & Safety Checks | Syntax, Logical & Runtime Errors |
| **DataTypes** | Data Types & Memory Bounds | Primitive Types, Wrappers, Sizes |
| **SalaryCalculator** | Employee Salary Calculator | Percentage Math (DA 10%, HRA 15%) |
| **MaxElementArray** | Maximum Element in Array | Array Traversal, Min/Max Tracking |
| **CountPositiveNegative** | Count Positive, Negative & Zeros | Array Categorization, Conditionals |
| **ArithmeticOperations** | Basic Arithmetic Operations | Modulus, Division, Arithmetic |
| **SwapTwoNumbers** | Swap Two Numbers | Temporary vs Arithmetic Swapping |
| **OperatorPrecedence** | Operator Precedence Evaluation | Expression Parsing & Operator Order |
| **CheckEvenOdd** | Even or Odd Checker | Modulus Operator |
| **GradeCalculator** | Student Grade Calculator | `if-else if` Range Evaluations |
| **LargestOfThree** | Largest of Three Numbers | Compound Conditionals |
| **MultiplicationTable** | Multiplication Table | Loop Constructs (`for`) |
| **SumOfDigits** | Sum of Digits | `while` Loop, Modulo & Division |
| **PrimeNumberCheck** | Prime Number Checker | Square root prime test algorithm |
| **MenuDrivenCalculator** | Menu Driven Calculator | `switch` Statement |
| **PatternPrinting** | Pattern Printing | Nested Loops |
| **ArraySorting** | Array Sorting | Bubble Sort Algorithm |
| **SearchArray** | Search Element in Array | Linear Search (1-based position) |

---

### 🔹 CO2: Abstract Classes, Interfaces & Multiple Inheritance
- **University Evaluation System** (`StudentEvaluation.java`):
  - Base abstract class `StudentEvaluation` defining common properties and abstract hooks `calculateTotalMarks()` and `displayGrade()`.
  - Subclasses: `UGCourseEvaluation`, `PGCourseEvaluation`, `CertificateCourseEvaluation`, and `ExecutiveCourseEvaluation`.
  - Polymorphic iteration over an array of student objects.
- **Smart Device Control System** (`SmartDevice.java`):
  - Role-based interfaces: `WiFiEnabled`, `VoiceControlled`, `MusicPlayer`, `VideoStreaming`, and `TemperatureMonitor`.
  - Device implementations: `SmartPhone`, `SmartSpeaker`, `SmartThermostat`, `SmartTV`, and extensible `SmartCar`.
- **Emergency Rescue Robot** (`RescueRobot.java`):
  - Abstract base class `RescueRobot` with common state (`robotId`, `modelName`, `batteryPercentage`) and mission hook `performMission()`.
  - Capability interfaces: `Flyable`, `Swimmable`, `Climbable`.
  - Robots: `AerialDroneRobot`, `SubmarineRescueRobot`, `MountainRescueRobot`, and `AmphibiousRescueRobot`.
  - Demonstration with both abstract class and interface references.
- 📄 **Evaluation Report**: See [`CO2/CO2_Report_and_Class_Diagrams.md`](file:///d:/Java-Lab/CO2/CO2_Report_and_Class_Diagrams.md) for detailed architectural writeup and Mermaid UML diagrams.

---

### 🔹 Java Lab Exercises: Core OOP & Micro-Outcomes
- **Constructors & Keyword `this`**: `StudentClass.java` to `ThisConstructor.java` covering default constructors, parameterized constructors, constructor overloading, disambiguation using `this`, and constructor chaining using `this()`.
- **Garbage Collection & Lifecycle**: `GarbageCollection.java` and `FinalizeMethod.java` covering `System.gc()` and `finalize()`.
- **Polymorphism & Overloading**: `MethodOverloadDisplay.java` and `MethodOverloadArea.java` demonstrating compile-time method overloading for types and shapes.
- **Object References & Memory**: `PassObject.java` to `ReturnCircleObject.java` covering passing objects as arguments and methods returning newly instantiated objects.
- **Recursion**: `FactorialRecursion.java` to `FibonacciRecursion.java` demonstrating recursive algorithms (Factorial, Natural Sum, Fibonacci).
- **Access Control & Static/Final Keywords**: `AccessControl.java` to `FinalKeyword.java` covering private encapsulation, static instance counters, static utility methods, and final constants.
