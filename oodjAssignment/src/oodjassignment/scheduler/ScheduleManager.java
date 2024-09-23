/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodjassignment.scheduler;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Acer
 */
public abstract class ScheduleManager implements ScheduleOperations {
    protected static final String DATE_FORMAT = "dd MMMM yyyy"; // 定义日期格式

    protected boolean isValidDate(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        sdf.setLenient(false);
        try {
            sdf.parse(dateStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    protected boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    // 可以在这里添加其他公共方法
}

