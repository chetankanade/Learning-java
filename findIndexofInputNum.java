import java.util.*;

public class findIndexofInputNum {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {

            arr[i] = sc.nextInt();
        }

        int n = sc.nextInt();

        System.out.print(arr[n]);

    }
}
