package cn.test_11;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList08 {
    public static void main (String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();

        Student s1 = new Student("Tim", 33);
        Student s2 = new Student("Harry", 32);
        Student s3 = new Student("Sprite", 34);
        Student s4 = new Student("Jordan", 30);
        Student s5 = new Student("Jeffrey", 28);
        Student s6 = new Student("Sprite", 34);
        Student s7 = new Student("Jordan", 32);

        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        array.add(s5);
        array.add(s6);
        array.add(s7);

        ArrayList<Student> newArray = new ArrayList<Student>();
        Iterator<Student> it = array.iterator();
        while(it.hasNext()){
            Student s = it.next();
            if (!newArray.contains(s)){
                newArray.add(s);
                System.out.println(s);
            }
        }
//        for (int x = 0; x<newArray.size(); x++) {
//            Student s = (Student) newArray.get(x);
//            System.out.println(s);
//        }
    }
}
