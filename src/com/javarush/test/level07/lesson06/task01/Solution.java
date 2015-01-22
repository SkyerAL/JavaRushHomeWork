package com.javarush.test.level07.lesson06.task01;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        ArrayList<String> mas = new ArrayList<String>();

        mas.add("sdsd");
        mas.add("dd");
        mas.add("ff");
        mas.add("gg");
        mas.add("rfrrt");

        System.out.println(mas.size());

        for (String st :mas)
        {
            System.out.println(st);
        }


    }
}
