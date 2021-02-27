public class Pro7 {
    public static void main(String args[]) {
        for (int i = 1; i <= 48; i++) {
            int counter = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) ++counter;
            }
            if (counter == 2) {
                System.out.println( i + " é primo");
            }
        }
    }
}
