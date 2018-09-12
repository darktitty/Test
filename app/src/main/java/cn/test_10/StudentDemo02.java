package cn.test_10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StudentDemo02 {
    public static void main(String[] args){
        Collection c = new ArrayList();
        Student s1 = new Student("Tim", 33);
        Student s2 = new Student("Harry", 32);
        Student s3 = new Student("Sprite", 34);
        Student s4 = new Student("Jordan", 30);
        Student s5 = new Student("Jeffrey", 28);

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
            Student s = (Student) it.next();
            System.out.println(s.getName() + "---" + s.getAge());
        }

    }
}
