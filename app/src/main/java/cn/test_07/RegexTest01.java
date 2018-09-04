package cn.test_07;

import java.util.Scanner;

public class RegexTest01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入QQ号:");
        String qq = sc.nextLine();
        System.out.println(check(qq));
    }

    public static boolean check(String qq){
/*
        boolean flag = true;
        if(qq.length()>=5 && qq.length()<=15){
            if(!qq.startsWith("0")){
                for(int x=0; x<qq.length(); x++){
                    char n = qq.charAt(x);
                    if(!Character.isDigit(n)){
                        flag = false;
                        break;
                    }
                }
            }else{
                flag = false;
            }
        }else{
            flag = false;
        }
        return flag;
*/


        return qq.matches("[1-9][0-9]{4,14}");
    }
}
