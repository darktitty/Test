package cn.test_07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest04 {
    public static void main(String[] args){
        String s = "da jia ting wo shuo, jin tian yao xia yu, bu shang wan zi xi, gao xing bu?";
        String regex = "\\b\\w{3}\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

/*
        boolean a = m.find();                   //通过find方法查找有没有满足条件的子串
        String b = m.group();                   //取符合的子串
        System.out.println(b);
*/
        //循环改进
        while (m.find()){
            System.out.println(m.group());
        }
    }
}
