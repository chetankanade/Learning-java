import java.util.*;

public class factorial {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }

        System.out.println(factorial);
    }

}
