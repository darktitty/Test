package cn.test_01.Animal;

import cn.test_01.Jump.Jump;

/**
 * 这是具体的猫类
 *
 * @author Blacktitty
 * @version V1.0
 */
public class Cat extends Animal implements Jump {

    @Override
    public void jump() {
        // TODO Auto-generated method stub
        System.out.println("会跳高的猫");
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        // TODO Auto-generated method stub
        System.out.println("猫睡觉");
    }

}