package cn.test_11;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList06 {
    public static void main (String[] args) {
        ArrayList array = new ArrayList();

        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("hello");
        array.add("world");
        array.add("java");

        ArrayList newArray = new ArrayList();
        Iterator it = array.iterator();
        while(it.hasNext()){
            String s = (String) it.next();
            if (!newArray.contains(s)){
                newArray.add(s);
                System.out.println(s);
            }
        }
        for (int x = 0; x<newArray.size(); x++) {
            String s = (String) newArray.get(x);
            System.out.println(s);
        }
    }
}
