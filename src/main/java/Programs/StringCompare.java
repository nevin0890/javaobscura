package Programs;

public class StringCompare {
    public static void main(String[] args) {
        String s1="java";
        String s2="NEVIN";
        String s3="java";
        int x=1234;
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s2));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.endsWith("va"));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s2.startsWith("NE"));
        System.out.println(s2.endsWith("IN"));
        System.out.println(s2.charAt(4));
        System.out.println(String.valueOf(x));



    }
}
