import java.util.*;

public class Array {
    public static void main(String arg[]) {
        // int marks[] = { 10, 20, 30 }; // we can declare array like this also
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int num[] = new int[size];

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println(num[i]);
        }
    }
}
