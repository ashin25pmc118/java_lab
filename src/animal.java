
class Animals {
    String name;

    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived Class (Subclass / Child Class)
class Dog extends Animals {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class animal {
    public static void main(String[] args) {

        Dog myDog = new Dog();


        myDog.name = "Buddy";
        myDog.eat();


        myDog.bark();
    }
}
