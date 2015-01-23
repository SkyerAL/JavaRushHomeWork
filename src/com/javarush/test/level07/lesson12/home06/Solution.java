package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        Human dedMam = new Human("DedMam", true, 66);
        Human babkaMam = new Human("BabkaMam", false, 56);

        Human dedPap = new Human("DedPap", true, 66);
        Human babkaPap = new Human("BabkaPap", false, 56);

        Human pap = new Human("Pap", true, 33, dedPap, babkaPap);
        Human mam = new Human("mam", false, 22, dedMam, babkaMam);

        Human san = new Human("San", true, 13, pap, mam);
        Human doch1 = new Human("Doch1", false, 7, pap, mam);
        Human doch2 = new Human("Doch2", false, 5, pap, mam);

//вывод на экран
        System.out.println(dedMam);
        System.out.println(babkaMam);
        System.out.println(dedPap);
        System.out.println(babkaPap);
        System.out.println(mam);
        System.out.println(pap);
        System.out.println(san);
        System.out.println(doch1);
        System.out.println(doch2);

    }

    public static class Human
    {
        //Написать тут ваш код
        String name;
        Boolean sex;
        int age;
        Human father, mother;

        public Human(String name, Boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, Boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
