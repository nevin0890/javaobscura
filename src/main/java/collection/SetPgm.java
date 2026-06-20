package collection;

import java.util.HashSet;
import java.util.Set;

public class SetPgm {
    public static void main(String[] args) {
        Set<Integer> s=new HashSet<Integer>();
        Set<Integer> s1=new HashSet<Integer>();
        s.add(2);
        s.add(4);
        s.add(6);
        s1.add(8);
        s1.add(10);
        s1.add(12);
        System.out.println(s);
        System.out.println(s1);
        s.addAll(s1);
        System.out.println(s);
        System.out.println(s.size());
        System.out.println("empty ? "+s.isEmpty());
        System.out.println("Contains : "+s1.contains(8));
        System.out.println("Contains : "+s1.contains(56));
        System.out.println("Contains all : "+s.containsAll(s1));
        System.out.println("Contains all : "+s1.containsAll(s));
        s1.remove(12);
        System.out.println(s1);
        s.removeAll(s1);
        System.out.println("Remove all : "+s);
        s.clear();
        System.out.println("after clearing : "+s);







    }
}
