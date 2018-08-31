package cn.test_02;

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Tim", 27);
        Student s2 = new Student("Tim", 27);
        Student s3 = new Student("Lee", 30);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        Demo d = new Demo();
        System.out.println(s1.equals(d));
    }
}