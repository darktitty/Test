package cn.test_05;

public class StringTest05 {
    public static void main(String[] args){
        String big = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        String small = "java";
        int count = getCount(big,small);
        System.out.println("出现了"+count+"次");
    }
    public static int getCount(String big, String small){
        int count = 0;
        int index = big.indexOf(small);             //查找第一次小串位置
        while(index !=-1){
            count++;
            big = big.substring(index + small.length());            //索引+小串长度算出截取字符串位置
            index = big.indexOf(small);
        }
        return count;
    }
}