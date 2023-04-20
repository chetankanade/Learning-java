import java.util.*;

public class DoWhile {
    public static void main(String[] arg) {
        int i = 0;
        int sum;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum = a + b;

        System.out.println("sum" + sum);
        do {
            System.out.println("i" + i);
            i++;
        } while (i < sum);
    }
}
