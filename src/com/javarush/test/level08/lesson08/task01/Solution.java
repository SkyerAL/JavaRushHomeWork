package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //Напишите тут ваш код
        Set<String> set = new HashSet<String>();

        set.add("любовь");
        set.add("лодка");
        set.add("лошадь");
        set.add("лось");
        set.add("лиса");
        set.add("люди");
        set.add("лихо");
        set.add("лама");
        set.add("лак");
        set.add("ладан");
        set.add("лавочка");
        set.add("леший");
        set.add("лучший");
        set.add("лекарство");
        set.add("литавры");
        set.add("лик");
        set.add("лыко");
        set.add("ложь");
        set.add("лесть");
        set.add("лымарь");

        return (HashSet)set;

    }
}
