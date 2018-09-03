package cn.test_05;

public class StringTest01 {
    public static void main(String[] args){
        String s = "Hello123Word";
        int big=0;
        int small=0;
        int number=0;
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
        System.out.println("big: "+big+" small: "+small+" number: "+number);
    }
}
