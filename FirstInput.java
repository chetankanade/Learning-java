import java.util.*;

public class FirstInput {
    public static void main(String[] arg) {
        try (// input
                Scanner sc = new Scanner(System.in)) {
            String name = sc.next();
            String fullName = sc.nextLine();
            System.out.println(name);
            System.out.println(fullName);
        }
    }
}
