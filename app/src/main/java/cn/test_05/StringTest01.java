package cn.test_05;

import java.util.Scanner;

public class StringTest01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.nextLine();

        int big=0;
        int small=0;
        int number=0;

/*      String s = "Hello123Word";

        for(int x=0;x<s.length();x++){
            char n = s.charAt(x);
            if(n>='A'&&n<='Z'){
                big++;
            }else if(n>='a'&&n<='z'){
                small++;
            }else if(n>='0'&&n<='9'){
                number++;
            }
        }
*/

        char[] chs = s.toCharArray();

        for(int x=0;x<s.length();x++){
            char n = chs[x];                            // char n = s.charAt(x);  此种方式可以不用转换数组即可实现
            if(Character.isUpperCase(n)){
                big++;
            }else if(Character.isLowerCase(n)){
                small++;
            }else if(Character.isDigit(n)){
                number++;
            }
        }

        System.out.println("big: "+big+" small: "+small+" number: "+number);
    }
}
