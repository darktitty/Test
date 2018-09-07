package cn.test_11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayList03 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("hello");
        c.add("world");
        c.add("java");

        Iterator it = c.iterator();
        while(it.hasNext()){
//            System.out.println(it.next());

            String s = (String) it.next();
            System.out.println(s);
        }
    }
}
