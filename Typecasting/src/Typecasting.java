public class Typecasting {
    public static void main(String[] args) {
        //example of widening type casting
        /*
        in this typecasting is automatically done by java
        conversion:-smaller to larger data type
        */
        int i = 20;
        long l  = i;
        System.out.println(l);
        //example of explicit type casting
        /*
         user defined Typecasting
         conversion:-larger to smaller data type
         */
        long x = 100000000L;
        int y = (int)x;
        System.out.println(x);

    }
}
