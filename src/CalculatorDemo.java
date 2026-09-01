class Calculator{
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c){

        return a + b +c;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(int a, double b) {
        return a + b;
    }
}


public class CalculatorDemo {
    public static void main(String [] agrs){
        Calculator calc = new Calculator();



        System.out.println("add(int,int)=" + calc.add(10,20));
        System.out.println("add(int,int,int)=" + calc.add(11,20,30));
        System.out.println("add(double,double)=" + calc.add(10.5,20.5));
        System.out.println("add(int,double)=" + calc.add(10,20.5));


    }
}
