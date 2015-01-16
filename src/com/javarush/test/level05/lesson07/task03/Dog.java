package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{

    private String name, color;
    private int rost;

    public void init(String name){
        this.name = name;
    }

    public void init(String name, int rost){
        this.name = name;
        this.rost = rost;
    }

    public void init(String name, int rost, String color){
        this.name = name;
        this.rost = rost;
        this.color = color;
    }



}
