package collection;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorPgm {
    public static void main(String[] args) {
        List<Integer> i=new LinkedList<Integer>();
        i.add(12);
        i.add(13);
        System.out.println(i);
        Iterator<Integer> l=i.iterator();
        while (l.hasNext()){
            System.out.println(l.next());

        }
        l.remove();
        System.out.println(i);


    }
}
