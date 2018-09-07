package cn.test_11;

import java.util.ArrayList;
import java.util.Collection;

class ArrayList02 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("hello");
        c.add("world");
        c.add("java");

        Object[] objs = c.toArray();
        for (int x = 0; x<objs.length; x++) {
            System.out.println(objs[x]+"---"+((String) objs[x]).length());
        }
    }

}