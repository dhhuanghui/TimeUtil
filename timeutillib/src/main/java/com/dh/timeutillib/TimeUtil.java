package com.dh.timeutillib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
    public static Date formatTimeToDate(String time, String format) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        try {
            Date date = formatter.parse(time);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }
}
