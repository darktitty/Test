package cn;

import java.util.Calendar;

/**
 * 文件描述：
 * @author Created by Blacktitty on 2018/9/5
 */
public class Test02 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR)+" "+(c.get(Calendar.MONTH)+1)+" "+c.get(Calendar.DATE));

        c.add(Calendar.YEAR, -3);
        c.add(Calendar.DATE, -5 );
        System.out.println(c.get(Calendar.YEAR)+" "+(c.get(Calendar.MONTH)+1)+" "+c.get(Calendar.DATE));
        c.set(2019, 11, 28);
        System.out.println(c.get(Calendar.YEAR)+" "+(c.get(Calendar.MONTH)+1)+" "+c.get(Calendar.DATE));
    }
}
