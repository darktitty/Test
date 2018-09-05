package cn.test_09;

import java.text.ParseException;
import java.util.Date;

public class DateUtilDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        String s = DateUtil.dataToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s);
        String ss = "2018-9-5 22:23:37";
        Date dd = DateUtil.stringToDate(ss, "yyyy-MM-dd HH:mm:ss");
        System.out.println(dd);
    }
}
