package com.javarush.test.level08.lesson08.task05;

import com.javarush.test.level06.lesson08.task05.StringHelper;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //Напишите тут ваш код
//        HashMap<String, Integer> count = new HashMap<String, Integer>();

        Map<String,String> copy = new HashMap<String, String>(map);



        for (Map.Entry<String,String> pair :copy.entrySet())
        {
            if (Collections.frequency(map.values(), pair.getValue())>1)
                removeItemFromMapByValue(map, pair.getValue());

        }



//        for (Map.Entry<String,String> pair :map.entrySet())
//        {
//            System.out.println(pair.getKey()+" - "+pair.getValue());
//        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args)
    {
        HashMap<String,String> map = createMap();

        removeTheFirstNameDuplicates(map);
    }
}
