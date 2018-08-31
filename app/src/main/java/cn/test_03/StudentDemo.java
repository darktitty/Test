package cn.test_03;

public class StudentDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s = new Student("Tim", 35);

        System.out.println(s.getName() + "---" + s.getAge());

        Object obj = s.clone();
        Student s2 = (Student) obj;
        System.out.println(s2.getName() + "---" + s2.getAge());

        System.out.println("--------------------------------");

        Student s3 = s;

        s3.setName("Lee");
        s3.setAge(28);
        System.out.println(s.getName() + "---" + s.getAge());
        System.out.println(s2.getName() + "---" + s2.getAge());
        System.out.println(s3.getName() + "---" + s3.getAge());
    }
}