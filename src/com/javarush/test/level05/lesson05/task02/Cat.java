package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat()
    {
    }

    public static void main(String[] args)
    {
        Cat vaska = new Cat();
        Cat murka = new Cat();

        vaska.strength=100;
        vaska.weight=100;
        vaska.age=100;

        murka.strength=10;
        murka.weight=10;
        murka.age=10;

        System.out.println(vaska.fight(murka));
        System.out.println(murka.fight(vaska));

    }

    public boolean fight (Cat anotherCat)
    {
        if(age>anotherCat.age && weight>anotherCat.weight && strength>anotherCat.strength)
            return true;
        else

            return false;

    }


}
