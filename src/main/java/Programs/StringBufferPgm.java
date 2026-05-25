package Programs;

public class StringBufferPgm {
    public static void main(String[] args) {
        StringBuffer s =new StringBuffer("hello");
        s.reverse();
        System.out.println(s);
        StringBuffer s1 =new StringBuffer("hello");
        s1.append( " world");
        System.out.println(s1);
        StringBuffer s2 =new StringBuffer("hello");
        s2.insert(3,"world");
        System.out.println(s2);
        StringBuffer s3 =new StringBuffer("hello");
        s3.delete(1,4);
        System.out.println(s3);
        StringBuffer s4 =new StringBuffer("hello");
        s4.replace(1,4,"hai");
        System.out.println(s4);





    }
}
