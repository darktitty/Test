package cn.test_11;

import java.util.Collection;
import java.util.Vector;

public class ArrayList01 {
    public static void main(String[] args) {
        Collection c = new Vector();
        c.add("hello");
        c.add("world");
        c.add("java");

        Object[] objs = c.toArray();
        for (int x = 0; x<objs.length; x++) {
            System.out.println(objs[x]+"---"+((String) objs[x]).length());
        }
    }
}
