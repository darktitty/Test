package cn.test_06;

public class ArrayTest02 {
    public static void main(String[] args){
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};

        int index = getIndex(arr, 88);
        System.out.println(index);
    }

    public static int getIndex(int[] arr, int value){
        int min = 0;
        int max = arr.length-1;
        int mid = (min+max)/2;

        while(arr[mid] != value){
            if(arr[mid]>value){
                max = mid-1;
            }else if(arr[mid]<value){
                min = mid+1;
            }
            if(min>max){                                 //判断数值不存在返回-1
                return -1;
            }
            mid = (min+max)/2;
        }
        return mid;
    }
}