import java.util.*;

public class Switch {
    public static void main(String[] arg) {

        try (Scanner sc = new Scanner(System.in)) {
            int day = sc.nextInt();

            switch (day) {
                case 1:
                    System.out.println("This is monday");
                    break;
                case 2:
                    System.out.println("This is tuesday");
                    break;

            }
        }

    }

}
