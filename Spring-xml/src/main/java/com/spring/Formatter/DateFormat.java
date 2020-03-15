package com.spring.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public Date formatter(String data) throws ParseException {

        String[] data1 = data.split("\\|");
        String date = data1[0];
        String format = data1[1];

        SimpleDateFormat formatter = new SimpleDateFormat(format);
        Date dateobj = formatter.parse(date);
        return dateobj;

    }
}
