package cn.test_02;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student() {
        super();
    }

    public Student(String name, int age) {
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

/*    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

//  格式: 对象名 instanceof 类名      判断该对象名是否是该类名一个对象
        if (!(obj instanceof Student)){
            return false;
        }

        Student s = (Student)obj;
        return this.name.equals(s.name) && this.age == s.age;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }
}

class Demo {
}

