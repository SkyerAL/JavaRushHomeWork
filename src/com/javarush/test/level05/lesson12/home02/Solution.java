package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        // Создай по два объекта каждого класса тут
        Man man1 = new Man("Ivan", "Decabristov", 34);
        Man man2 = new Man("Petr", "Volhovka", 21);

        Woman woman1 = new Woman("Luda", "red place", 18);
        Woman woman2 = new Woman("Katya", "winter palace", 28);
        // Выведи их на экран тут

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    // Напиши тут свои классы
    public static class Man{
        private  String name, address;
        private int age;

        public Man(String name, String address, int age)
        {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        public String toString(){
            return name + " " + age + " " + address;
        }
    }

    public static class Woman{
        private  String name, address;
        private int age;

        public Woman(String name, String address, int age)
        {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        public String toString(){
            return name + " " + age + " " + address;
        }


    }
}
