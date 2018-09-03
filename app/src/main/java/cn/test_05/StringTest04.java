package cn.test_05;

import java.util.Scanner;

public class StringTest04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String line = sc.nextLine();
        String s = reverse(line);
        System.out.println(s);
    }
    public static String reverse(String s){
        String result = "";
        char[] a = s.toCharArray();

        for(int x = a.length-1; x>=0; x--){
            result += a[x];

        }
        return result;
    }
}
