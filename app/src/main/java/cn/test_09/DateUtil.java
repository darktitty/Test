package cn.test_09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 文件描述：这是日期和字符串相互转换的工具
 * @author Created by Blacktitty on 2018/9/5
 */

public class DateUtil {
    private DateUtil(){ }
    public static String dataToString(Date d, String format){
        /**
         * 这个方法的作用就是把日期转成一个字符串
         * @param d               被转换的日期对象
         * @param format          传递过来的要被转换的格式
         * @return                格式化后的字符串
         */
        return new SimpleDateFormat(format).format(d);
    }

    public static Date stringToDate(String s, String format) throws ParseException {
        /**
         * 这个方法的作用就是把一个字符串解析成一个日期对象
         * @param s            被解析的字符串
         * @param format       传递过来的要被转换的格式
         * @return             解析后的日期对象
         */
        return new SimpleDateFormat(format).parse(s);
    }
}
