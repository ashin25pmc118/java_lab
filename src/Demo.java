class Base {
    private int i;

    public void seti(int a) {
        i = a;
        System.out.println("Value of i is set to " + i);
    }

    public int geti() {
        System.out.println(
                "The current value of i is " + i + " and it is returned"
        );
        return i;
    }

    public void finalize() {
        System.out.println("Garbage Collected");
    }
}

class Derived extends Base {
    private int j;

    public void setj(int a) {
        j = a;
        System.out.println("Value of j is set to " + j);
    }

    public int getj() {
        System.out.println(
                "The current value of j is " + j + " and it is returned"
        );
        return j;
    }
}

class Demo {
    public static void main(String args[]) {

        // Working with Base class object
        System.out.println("Working with Base class object");

        Base objB = new Base();
        objB.seti(10);

        System.out.println(
                "The current value of i is received in main as -> "
                        + objB.geti()
        );

        // objB = null; // Remove comment to see GC working

        System.gc();

        // Working with Derived class object using Base class methods
        System.out.println("\nWorking with Derived class object");

        Derived objD = new Derived();
        objD.seti(20);

        System.out.println(
                "The current value of i is received in main as -> "
                        + objD.geti()
        );

        // Working with Derived class methods
        objD.setj(30);

        int k = objD.getj();

        System.out.println(
                "The current value of j is received in main as -> "
                        + objD.getj() + k
        );
    }
}