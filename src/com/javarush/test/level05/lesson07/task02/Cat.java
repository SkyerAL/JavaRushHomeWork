package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String name, color, adress;
    private int ves=10, age=10;

    public void initialize(String name){
        this.name = name;
    }

    public void initialize(String name, int ves, int age){
        this.name = name;
        this.ves = ves;
        this.age = age;
    }

    public void initialize(String name, int age){
        this.name = name;
        this.ves = 10;
        this.age = age;
    }

    public void initialize(int ves, String  color){
        this.ves = ves;
        this.color = color;

    }
    public void initialize(int ves, String  color, String adress){
        this.ves = ves;
        this.color = color;
        this.adress = adress;


    }


}
