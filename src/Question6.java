import java.util.Locale;

public class Question6 {
    public static void main(String[] args) {
        String str = "testStr";
        System.out.println(str.equals("testStr"));
        System.out.println(str.substring(0,2));
        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str.concat("concatStr"));
        System.out.println(str.startsWith("test"));
        System.out.println(str.charAt(2));
        System.out.println(str.codePointAt(2));
        System.out.println(str.codePointBefore(2));
        System.out.println(str.codePointCount(2,3));
        System.out.println(str.compareTo("testStr2"));
        System.out.println(str.compareToIgnoreCase("TESTSTR2"));

    }
}
