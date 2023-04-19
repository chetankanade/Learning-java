import java.util.*;

public class FirstInput {
    public static void main(String[] arg) {
        try (// input
                Scanner sc = new Scanner(System.in)) {
            String name = sc.next();
            String fullName = sc.nextLine();
            System.out.println(name);
            System.out.println(fullName);

            // nextInt() is used to get input as a integer
            // nextfloat() is used to get input as a float(decimal)
        }
    }
}
