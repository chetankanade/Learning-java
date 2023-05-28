import java.util.*;

public class StringBuild {
    public static void main(String arg[]) {
        StringBuilder sb = new StringBuilder("Hello Chetan");

        //this will print 9th index char
        System.out.println(sb.charAt(9));
 
        //this will remove and add new char at given index
        sb.setCharAt(0,'p'); 
        System.out.println(sb);

        //this will add char at given index 
        sb.insert(2, 'l');
        System.out.println(" l inserted --> " + sb);

        //this will delete (from - to) index char 
        sb.delete(3, 4);
        System.out.println("delete from 3rd index to 4th index --> " + sb);

    }
}
