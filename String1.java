import java.util.*;

public class String1 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        // concatenation
        String fName = "Chetan";
        String lName = "Kanade";
        String FullName = fName + " " + lName;
        System.out.println(FullName);

        // length
        System.out.println(FullName.length());

        // charAt
        for (int i = 0; i < FullName.length(); i++) {
            System.out.println(FullName.charAt(i));
        }

        // compare string
        String name1 = "Chetan";
        String name2 = "Chetan";
        if (name1.compareTo(name2) == -1) {
            System.out.println("String are Equal");
        } else {
            System.out.println("String are not eq");
        }

        // use of == for comapring strings
        if (name1 == name2) {
            // System.out.println("Strings are Equals");
        } else {
            // System.out.println("Strings are Not eq");
        } // this == works but sometime it wont work

        // example
        if (new String("Chetan") == new String("Chetan")) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not eq");
        }

    }
}
