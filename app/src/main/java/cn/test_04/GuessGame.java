package cn.test_04;

import java.util.Scanner;

public class GuessGame {
    private GuessGame(){}
    public static void start(){
        int n = (int)(Math.random()*100)+1;
        while(true){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要猜的数(1-100):");
        int guess = sc.nextInt();
        if(guess>n){
            System.out.println("猜的"+guess+"大了");
        }else if(guess<n){
            System.out.println("猜的"+guess+"小了");
        }else{
            System.out.println("恭喜你猜中了："+guess);
            break;
        }
        }
    }
}
