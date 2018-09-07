package cn.test_10;

public class StudentDemo01 {
    public static void main(String[] args){
        Student01[] students = new Student01[5];
        Student01 s1 = new Student01("Tim", 33);
        Student01 s2 = new Student01("Harry", 32);
        Student01 s3 = new Student01("Sprite", 34);
        Student01 s4 = new Student01("Jordan", 30);
        Student01 s5 = new Student01("Jeffrey", 28);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        for (int x = 0; x<students.length; x++) {
            Student01 s = students[x];
            System.out.println(s.getName()+"---"+s.getAge());
        }

        for (int x = 0; x<students.length; x++) {
            Student01 s = students[x];
            System.out.println(s.toString());
        }
    }
}
