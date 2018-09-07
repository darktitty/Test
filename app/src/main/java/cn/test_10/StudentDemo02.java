package cn.test_10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StudentDemo02 {
    public static void main(String[] args){
        Collection c = new ArrayList();
        Student02 s1 = new Student02("Tim", 33);
        Student02 s2 = new Student02("Harry", 32);
        Student02 s3 = new Student02("Sprite", 34);
        Student02 s4 = new Student02("Jordan", 30);
        Student02 s5 = new Student02("Jeffrey", 28);

        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        c.add(s5);

/*        Object[] s = c.toArray();
        for (int x = 0; x<s.length; x++) {
            Student02 ss = (Student02) s[x];
            System.out.println(ss.getName()+"---"+ss.getAge());
        }
*/

/*
        Iterator it = c.iterator();
        while (it.hasNext()) {
//            System.out.println(it.next());
            Student02 s = (Student02) it.next();
            System.out.println(s.getName() + "---" + s.getAge());
        }
*/
        for (Iterator it = c.iterator(); it.hasNext();) {
            Student02 s = (Student02) it.next();
            System.out.println(s.getName() + "---" + s.getAge());
        }

    }
}
