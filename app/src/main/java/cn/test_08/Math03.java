package cn.test_08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Math03 {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat date = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = date.format(d);
        System.out.println(s);

        String ss = "2018-09-13 12:18:26";
        SimpleDateFormat date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = date2.parse(ss);
        System.out.println(dd);
    }
}
