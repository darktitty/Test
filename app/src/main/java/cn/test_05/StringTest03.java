package cn.test_05;

public class StringTest03 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String result = arrayToString(arr);
        System.out.println(result);
    }

    public static String arrayToString(int[] arr){
        String s = "";
        s += "[";
        for (int x=0; x<arr.length;x++){
            if (x == arr.length -1){
                s += arr[x];
                s += "]";
            }else{
                s += arr[x];
                s += ", ";
            }
        }
        return s;
    }
}