package cn.test_11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayList05 {
    public static void main(String[] args) {
        List c = new ArrayList();
        c.add("hello");
        c.add("world");
        c.add("java");

        ListIterator l = c.listIterator();

        while(l.hasNext()){
            String s = (String) l.next();
            if ("world".equals(s)){
                l.add("Android");
            }
        }
        System.out.println(c);

        for (int x = 0; x < c.size(); x++) {
            String s = (String) c.get(x);
            if ("world".equals(s)) {
                c.add("Android");
            }
        }
        System.out.println(c);
    }
}
