package com.javarush.test.level09.lesson11.home05;

import com.javarush.test.level06.lesson08.task05.StringHelper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Написать тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String st = reader.readLine();

        st.trim();

        String smSt="", bigSt="";

        String pr = " ";

        for (int i = 0; i < st.length(); i++)
        {
            if (i==st.length()-1)
            {
                pr="";
            }
            char c = st.charAt(i);

            if (Character.isSpaceChar(c))
                continue;
            if (isVowel(c))
            {
                smSt += c + pr;
            }else{

            bigSt += c+pr;
            }

        }

        System.out.println(smSt);
        System.out.println(bigSt);


    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
