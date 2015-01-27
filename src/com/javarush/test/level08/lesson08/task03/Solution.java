package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Иванов","Сергей");
        map.put("Сидоров","Алексей");
        map.put("Тимонин","Алексей");
        map.put("Петренко","Федор");
        map.put("Крехов","Андрей");
        map.put("Королько","Григорий");
        map.put("Роецки","Алексей");
        map.put("Удалов","Артем");
        map.put("Тихонов","Павел");
        map.put("Поджогсараев","Разносустоев");


        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //Напишите тут ваш код
        int i=0;
//        if (map.containsValue(name))
//        {
            for (Map.Entry<String,String> pair :map.entrySet())
            {
                if (name.equals(pair.getValue())) i++;

            }


//        }
        return i;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //Напишите тут ваш код
        int i=0;
//        if (map.containsKey(familiya))
//        {
            for (Map.Entry<String,String> pair :map.entrySet())
            {
                if (familiya.equals(pair.getKey())) i++;

            }


//        }
        return i;

    }

    public static void main(String[] args)
    {
         HashMap<String, String> map = createMap();

        System.out.println(getCountTheSameFirstName(map, "Алексей"));
        System.out.println(getCountTheSameLastName(map, "Иванов"));
    }
}
