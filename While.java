import java.util.*;

public class While {
    public static void main(String[] arg) {
        try (Scanner sc = new Scanner(System.in)) {

            int i = 0;
            while (i <= 5) {
                System.out.println("Number is " +  i);
                i++;
            }
        }
    }
}
