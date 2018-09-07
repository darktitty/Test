package cn.test_10;

public class Student02 {
    private String name;
    private int age;

    public Student02() {
        super();
    }

    public Student02(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student02{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
