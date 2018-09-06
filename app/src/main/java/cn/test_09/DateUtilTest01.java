package cn.test_09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateUtilTest01 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println(System.currentTimeMillis());
        System.out.println("请输入你的出生年月日(yyyy-MM-dd):");
        String myday = sc.nextLine();

        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        Date d = date.parse(myday);

        long myTime = d.getTime();
        long nowTime = System.currentTimeMillis();
        long time = nowTime - myTime;
        long day = time / 1000 / 60 / 60 / 24;

        System.out.println("你来到这个世界" + day + "天了.");
    }
}
