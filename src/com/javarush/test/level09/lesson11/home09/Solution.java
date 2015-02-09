package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //Напишите тут ваш код
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("Vasiliy", new Cat("Vasiliy"));
        map.put("Vasiliy1", new Cat("Vasiliy1"));
        map.put("Vasiliy2", new Cat("Vasiliy2"));
        map.put("Vasiliy3", new Cat("Vasiliy3"));
        map.put("Vasiliy4", new Cat("Vasiliy4"));
        map.put("Vasiliy5", new Cat("Vasiliy5"));
        map.put("Vasiliy6", new Cat("Vasiliy6"));
        map.put("Vasiliy7", new Cat("Vasiliy7"));
        map.put("Vasiliy8", new Cat("Vasiliy8"));
        map.put("Vasiliy9", new Cat("Vasiliy9"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //Напишите тут ваш код
        Set<Cat> set = new HashSet<Cat>();

        set.addAll(map.values());

        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
