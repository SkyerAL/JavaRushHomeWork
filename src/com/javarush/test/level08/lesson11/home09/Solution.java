package com.javarush.test.level08.lesson11.home09;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println("JANUARY 1 2000 = " + isDateOdd("JANUARY 1 2000"));
        System.out.println("JANUARY 2 2000 = " + isDateOdd("JANUARY 2 2000"));
    }

    public static boolean isDateOdd(String date)
    {

        Calendar c=new GregorianCalendar();
        c.setTime(new Date(date));

//        System.out.println(c.get(Calendar.DAY_OF_YEAR));

        return !(c.get(Calendar.DAY_OF_YEAR)%2==0);
    }
}
