import java.util.*;

public class FirstIfElse {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("given number is even");
        } else {
            System.out.println("Given number is not a number");
        }
    }
}
