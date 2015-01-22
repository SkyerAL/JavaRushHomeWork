package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        int[] mas;
        mas = new int[10];


        for (int i = 0; i < 10; i++)
        {
            mas[i] = Integer.parseInt(reader.readLine());

        }

        for (int i = 9; i >-1 ; i--)
        {
            System.out.println(mas[i]);
        }
//        sortBot(mas);
//
//        for (int i :mas)
//        {
//            System.out.println(i);
//        }


    }

//    public static void sortBot(int[] arg)
//    {
//        Boolean flag = true;
//
//        int maxind = arg.length, n;
//
//        while (flag||maxind==0)
//        {
//            flag=false;
//            for (int i = 1; i < maxind; i++)
//            {
//                if (arg[i-1]<arg[i])
//                {
//                    n = arg[i-1];
//                    arg[i-1]=arg[i];
//                    arg[i]=n;
//                    flag=true;
//                }
//            }
//            maxind--;
//
//        }
//    }
}
