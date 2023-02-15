public class type_casting {
    public static void main(String[] args) {
        // Widening Type Casting
        System.out.println("Widening Type Casting -> done automatically by compiler");
        int i = 7;
        long l = i;
        float f = i;
        double d = i;
        System.out.println("Before type casting value in integer is : " + i);
        System.out.println("after type casting value in long is : " + l);
        System.out.println("after type casting value in float is : " + f);
        System.out.println("after type casting value in double is : " + d);

        // narrowing Type Casting
        System.out.println("narrowing Type Casting -> done manually by programmer");
        double d2 = 7.010101;
        int i2 = (int) d2;
        long l2 = (long) d2;
        float f2 = (float) d2;
        System.out.println("Before type casting value in double is : " + d2);
        System.out.println("after type casting value in int is : " + i2);
        System.out.println("after type casting value in long is : " + l2);
        System.out.println("after type casting value in float is : " + f2);

    }
}
