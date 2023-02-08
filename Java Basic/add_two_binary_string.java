// A simple addition program between two binary strings
public class add_two_binary_string {
    public static void main(String[] args) {
        String str1 = "1011";
        String str2 = "0110";
        String sum;
        /*
         * we know that in binary number system
         * 1 + 0 = 1
         * 0 + 1 = 1
         * 0 + 0 = 0
         * 1 + 1 = 10
         */
        // converting string to decimal integer;
        int x = Integer.parseInt(str1, 2);
        int y = Integer.parseInt(str2, 2);
        int z = x + y;
        // converting integer to binary string
        sum = Integer.toBinaryString(z);

        System.out.println("Addition of two binary strings : " + sum);
    }
}