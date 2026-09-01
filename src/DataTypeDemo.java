public class DataTypeDemo {
    public static void main(String[] args) {

        byte b = 100;
        short s = 2000;
        int i = 100;
        long l = 100000L;
        float f = 25.5f;
        double d = 123.456;
        char ch = 'A';
        boolean flag = true;

        System.out.println("Byte value      : " + b);
        System.out.println("Short value     : " + s);
        System.out.println("Integer value   : " + i);
        System.out.println("Long value      : " + l);
        System.out.println("Float value     : " + f);
        System.out.println("Double value    : " + d);
        System.out.println("Character value : " + ch);
        System.out.println("Boolean value   : " + flag);

        System.out.println("\nMemory Range of Data Types");
        System.out.println("byte    : -128 to 127");
        System.out.println("short   : -32,768 to 32,767");
        System.out.println("int     : -2,147,483,648 to 2,147,483,647");
        System.out.println("long    : -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");
        System.out.println("float   : Approximately ±3.4E38");
        System.out.println("double  : Approximately ±1.7E308");
        System.out.println("char    : 0 to 65,535 (Unicode)");
        System.out.println("boolean : true or false");
    }
}