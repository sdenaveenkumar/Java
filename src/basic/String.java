package basic;

public class String {
    // write function here

    static void main() {

        java.lang.String str = "abcd";
        System.out.println(str.concat("e"));
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(3));
        System.out.println(str.length());
        System.out.println(str.indexOf('b'));
        System.out.println(str.toString());
        System.out.println(str.substring(2));
        System.out.println(str.substring(1,3));
        System.out.println(str.contains("a"));
        System.out.println(str.startsWith("b"));
        System.out.println(str.startsWith("a"));
        System.out.println(str.endsWith("d"));
        System.out.println(str.indexOf("z"));
        System.out.println(str.isEmpty());
        System.out.println(str.toCharArray());
        System.out.println("ab".toCharArray());



    }
}
