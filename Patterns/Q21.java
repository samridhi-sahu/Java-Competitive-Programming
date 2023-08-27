public class Q21 {
    public static void main(String[] args) {
        int x = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 4)
                    System.out.print(x + " ");
                else
                    System.out.print(x + "  ");
                x++;
            }
            System.out.println();
        }
    }
}
