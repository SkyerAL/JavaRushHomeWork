package com.javarush.test.level09.lesson11.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Метод в try..catch
Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа) этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода
*/

public class Solution
{
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //add your code here
        Set<Integer> list = new HashSet<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        try
        {
            while (true)
            {
                list.add(Integer.parseInt(reader.readLine()));
            }
        }
        catch (NumberFormatException e)
        {
            for (int i :list)
            {
                System.out.println(i);
            }

        }
        catch (IOException e)
        {
            for (int i :list)
            {
                System.out.println(i);
            }

        }
    }
}
