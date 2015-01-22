package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int[] mas;
        mas = new int[5];


        for (int i = 0; i < 5; i++)
        {
            mas[i] = Integer.parseInt(reader.readLine());

        }
        sort(mas);

        for (int i :mas)
        {
            System.out.println(i);
        }


    }

    public static void sort(int[] arg)
    {
        Boolean flag = true;

        int maxind = arg.length, n;

        while (flag||maxind==0)
        {
            flag=false;
            for (int i = 1; i < maxind; i++)
            {
                if (arg[i-1]>arg[i])
                {
                    n = arg[i-1];
                    arg[i-1]=arg[i];
                    arg[i]=n;
                    flag=true;
                }
            }
            maxind--;

        }
    }
}
