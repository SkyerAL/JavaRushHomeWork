package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
//        дети
        Human doch = new Human("Аня",true,2);
        Human doch1 = new Human("Катя",true,4);
        Human sun = new Human("Ваня",false,6);

//        родители
        ArrayList<Human> deti = new ArrayList<Human>();
        Collections.addAll(deti,doch,doch1,sun);

        Human otec = new Human("Владимир",false,34,deti);
        Human mat = new Human("Мария",true,30,deti);


//        дедушки бабушки
        ArrayList<Human> detiOtec = new ArrayList<Human>();
        Collections.addAll(detiOtec,otec);

        Human otecDed = new Human("otecDed",false,64,detiOtec);
        Human otecBabka = new Human("otecBabka",true,64,detiOtec);


        ArrayList<Human> detiMat = new ArrayList<Human>();
        Collections.addAll(detiMat,mat);

        Human matDed = new Human("matDed",false,74,detiMat);
        Human matBabka = new Human("matBabka",true,74,detiMat);


//        вывод
        System.out.println(doch);
        System.out.println(doch1);
        System.out.println(sun);

        System.out.println(otec);
        System.out.println(mat);

        System.out.println(otecDed);
        System.out.println(otecBabka);

        System.out.println(matDed);
        System.out.println(matBabka);

    }

    public static class Human
    {
        //Написать тут ваш код
        private String name;
        private Boolean sex;
        private int age;
        private ArrayList<Human> children;

        public Human(String name, Boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
        }

        public Human(String name, Boolean sex, int age, ArrayList<Human> deti)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = deti;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
