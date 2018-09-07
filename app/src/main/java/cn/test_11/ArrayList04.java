package cn.test_11;

import java.util.ArrayList;
import java.util.List;

public class ArrayList04 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");

        for (int x = 0; x < list.size(); x++){
            String s = (String) list.get(x);
            System.out.println(s);
        }
    }
}
