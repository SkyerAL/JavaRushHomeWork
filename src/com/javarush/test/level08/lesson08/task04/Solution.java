package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Иванов", new Date("JUNE 1 1980"));
        map.put("Петров", new Date("MAY 1 1980"));
        map.put("Сидоров", new Date("APRIL 1 1980"));
        map.put("Еременко", new Date("JUNE 1 1980"));
        map.put("Буглаев", new Date("JUNE 1 1980"));
        map.put("Петроков", new Date("JUNE 1 1980"));
        map.put("Вангуев", new Date("JUNE 1 1980"));
        map.put("Георгиев", new Date("JUNE 1 1980"));
        map.put("Дерюшин", new Date("JUNE 1 1980"));

        //Напишите тут ваш код
        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //Напишите тут ваш код

        HashMap<String, Date> mapCopy = new HashMap<String, Date>(map);
        for (Map.Entry<String,Date> pair :mapCopy.entrySet())
        {
            if (pair.getValue().getMonth()>4&&pair.getValue().getMonth()<8)
            {
                map.remove(pair.getKey());
            }
        }


        for (Map.Entry<String,Date> pair :map.entrySet())
        {

            System.out.println(pair.getKey()+" - "+ pair.getValue());
//            System.out.println(pair.getKey()+" - "+ pair.getValue()+" - " + pair.getValue().getMonth());
        }

    }

    public static void main(String[] args)
    {
        HashMap<String, Date> map = createMap();

        removeAllSummerPeople(map);

    }
}
