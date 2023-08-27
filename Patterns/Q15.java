<<<<<<< HEAD
public class Q15 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            if (i < 5) {
                for (int j = 4; j > i; j--) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 1; j < 2 * i; j++) {
                    System.out.print(" ");
                }
                if (i != 0) {
                    System.out.print("*");
                }
            } else {
                for (int j = 4; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 5; j < 2 * i; j = j + 2) {
                    System.out.print(" ");
                }
                if (i != 8) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
=======
public class Q15 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            if (i < 5) {
                for (int j = 4; j > i; j--) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 1; j < 2 * i; j++) {
                    System.out.print(" ");
                }
                if (i != 0) {
                    System.out.print("*");
                }
            } else {
                for (int j = 4; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 5; j < 2 * i; j = j + 2) {
                    System.out.print(" ");
                }
                if (i != 8) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
>>>>>>> 7cb0564edb08a99206f9cedfc1d4d30f9eb86f28
