public class Q14 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; i == 0 && j < 7; j++) {
                System.out.print('*');
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 7; j > 2 * i && i != 0; j--) {
                System.out.print(" ");
            }
            if (i != 4) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
