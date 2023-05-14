import java.util.*;

public class IsArrSorted {
    public static void main(String abc[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num[] = new int[size];

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] > num[i + 1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("Arr is sorted");
        } else {
            System.out.println("Arr is not Sorted");
        }

    }

}
