package cn.test_06;

import java.util.Scanner;

public class ArrayTest01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String s = sc.nextLine();
        char[] chs = s.toCharArray();                           //转换成字符数组

        System.out.println("冒泡排序后:");
        bubbleSort(chs);
        String result = String.valueOf(chs);                    //转换成字符串
        System.out.println(result);

        System.out.println("选择排序后:");
        selectSort(chs);
        String result2 = String.valueOf(chs);                    //转换成字符串
        System.out.println(result2);
    }

    public static void bubbleSort(char[] chs){                  //冒泡排序
        for(int x=0; x<chs.length-1; x++){
            for(int y=0; y<chs.length-1-x; y++){
                if(chs[y]>chs[y+1]){
                    char temp = chs[y];
                    chs[y] = chs[y+1];
                    chs[y+1] = temp;
                }
            }
        }
    }

    public static void selectSort(char[] chs){                  //选择排序
        for(int x=0; x<chs.length-1; x++){
            for(int y=x+1; y<chs.length; y++){
                if(chs[y]<chs[x]){
                    char temp = chs[x];
                    chs[x] = chs[y];
                    chs[y] = temp;
                }
            }
        }
    }
}