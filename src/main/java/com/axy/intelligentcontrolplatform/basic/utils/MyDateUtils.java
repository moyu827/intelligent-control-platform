package com.axy.intelligentcontrolplatform.basic.utils;

import java.time.LocalDate;


/**
 * @auther yct
 * @data 2019/3/8 14:16
 */
public class MyDateUtils {
    public static String getDepositDocumentsDate(){
        LocalDate now = LocalDate.now();
        String year = changeTimeLength(now.getYear());
        String month = changeTimeLength(now.getMonthValue());
        String day = changeTimeLength(now.getDayOfMonth());
        return year+month+day;
    }

    private static String changeTimeLength(Integer time){
        if(time.toString().length()>1){
            return time.toString();
        }else{
            return "0"+time;
        }
    }

    public static void main(String[] args) {
        String depositDocumentsDate = getDepositDocumentsDate();
        System.out.println(depositDocumentsDate);
    }
}
