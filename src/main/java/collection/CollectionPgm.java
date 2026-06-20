package collection;

import java.util.LinkedList;
import java.util.List;

public class CollectionPgm {
    public static void main(String[] args) {
        List<Integer> l=new LinkedList<Integer>();
        l.add(12);
        l.add(8);
        l.add(10);
        l.add(20);
        l.add(20);
        System.out.println("l = "+l);
        System.out.println(l.get(0));
        System.out.println(l.get(1));
        System.out.println(l.get(2));
        l.set(2,45);
        System.out.println("l = "+l);
        System.out.println("size = "+l.size());
        System.out.println("is empty ? "+l.isEmpty());
        System.out.println("Contains : "+l.contains(20));
        l.remove(1);
        System.out.println("After remove = "+l);
        System.out.println("Index = "+l.indexOf(20));
        System.out.println("last index = "+l.lastIndexOf(20));




    }
}
