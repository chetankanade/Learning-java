public class SubString {
    public static void main(String arg[]) {
        String sentence = "My name is Chetan";
        // String name = sentence.substring(8, sentence.length());
        String name = sentence.substring(3);// here java automatically takes length as a last index
        System.out.println(name);
    }
}
