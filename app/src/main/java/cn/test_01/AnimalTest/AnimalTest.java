package cn.test_01.AnimalTest;

import cn.test_01.Animal.Animal;
import cn.test_01.Animal.Cat;

public class AnimalTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Animal a = new Cat();
        a.eat();
        a.sleep();
        Cat b = (Cat) a;
        b.jump();

        new Cat().jump();
    }

}