package cn.test_10;

public class StudentDemo {
    public static void main(String[] args){
        Student[] students = new Student[5];
        Student s1 = new Student("Tim", 33);
        Student s2 = new Student("Harry", 32);
        Student s3 = new Student("Sprite", 34);
        Student s4 = new Student("Jordan", 30);
        Student s5 = new Student("Jeffrey", 28);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        for (int x = 0; x<students.length; x++) {
            Student s = students[x];
            System.out.println(s.getName()+"---"+s.getAge());
        }
    }
}
