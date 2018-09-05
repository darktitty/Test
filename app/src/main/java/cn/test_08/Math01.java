package cn.test_08;

import java.util.Scanner;

public class Math01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始数:");
        int start = sc.nextInt();
        System.out.println("请输入结束数:");
        int end = sc.nextInt();

            int random = getRandom(start, end);
            System.out.println(random);
    }

    public static int getRandom(int start, int end){
        int random = (int)(Math.random()*(end-start+1))+start;
        return random;
    }
}
