public class DataTypes {
    public static void main(String[] args) {
        byte byteVal = 10;
        short shortVal = 200;
        int intVal = 100;
        long longVal = 100000L;
        float floatVal = 25.5f;
        double doubleVal = 123.456;
        char charVal = 'A';
        boolean boolVal = true;

        System.out.println("Integer value : " + intVal);
        System.out.println("Long value    : " + longVal);
        System.out.println("Float value   : " + floatVal);
        System.out.println("Double value  : " + doubleVal);
        System.out.println("Character     : " + charVal);
        System.out.println("Boolean       : " + boolVal);

        System.out.println("\n--- Data Type Memory Sizes & Ranges ---");
        System.out.println("byte    : " + Byte.BYTES + " byte  [" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + "]");
        System.out.println("short   : " + Short.BYTES + " bytes [" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + "]");
        System.out.println("int     : " + Integer.BYTES + " bytes [" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + "]");
        System.out.println("long    : " + Long.BYTES + " bytes [" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + "]");
        System.out.println("float   : " + Float.BYTES + " bytes [" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + "]");
        System.out.println("double  : " + Double.BYTES + " bytes [" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + "]");
        System.out.println("char    : " + Character.BYTES + " bytes ['\\u0000' to '\\uffff']");
        System.out.println("boolean : 1 bit (true / false)");
    }
}
