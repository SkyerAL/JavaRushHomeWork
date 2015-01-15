package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

        Integer[] mas = new Integer[3];
        for (int i = 0; i < 3; i++)
        {
            mas[i] = Integer.parseInt(reader.readLine());
        }

//        сортировка
        boolean flag=true;
        while (flag){
            flag = false;
            int j = 0;

            for (int i = 1; i < mas.length; i++)
                if (mas[j] < mas[i])
                {
                    int per1 = mas[i];
                    mas[i] = mas[j];
                    mas[j] = per1;
                    j = i;
                    flag = true;
                }

        }


//        вывод
//        for (int i :mas)
//        {
//            System.out.println(i);
//        }

        System.out.print(mas[0]+" "+mas[1]+" "+mas[2]);

    }
}
