package cn.test_07;

import java.util.Arrays;

public class RegexTest03 {
    public static void main(String[] args) {

        String s = "91 27 46 38 50";
        String[] numArray = s.split(" ");
        int[] arr = new int[numArray.length];
        for (int x = 0; x < arr.length; x++) {
            arr[x] = Integer.parseInt(numArray[x]);
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < arr.length; x++) {
            sb.append(arr[x]).append(" ");
        }
        String result = sb.toString().trim();
        System.out.println(result);
    }
}
