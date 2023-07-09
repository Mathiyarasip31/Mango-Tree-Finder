import java.util.Scanner;

public class MangoTreeFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int mango = sc.nextInt();
        if (mango >= 1 && mango <= rows) {
            System.out.print("true");
        } else if ((mango - 1) % rows == 0) {
            System.out.print("true");
        } else if (mango % rows == 0) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
