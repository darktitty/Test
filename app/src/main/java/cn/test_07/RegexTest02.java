package cn.test_07;

import java.util.Scanner;

public class RegexTest02 {
    public static void main(String[] args){
        String ages = "18-24";
        String regex = "-";
        String[] ageArray = ages.split(regex);
        int startAge = Integer.parseInt(ageArray[0]);
        int endAge = Integer.parseInt(ageArray[1]);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年龄:");
        int age = sc.nextInt();
        if(age>=startAge && age<=endAge){
            System.out.println("范围中");
        }else{
            System.out.println("超出范围");
        }
    }
}
