package com.javarush.test.level05.lesson05.task04;

/* Создать три объекта типа Cat
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        Cat vaska = new Cat("vaska", 10, 23, 100);
        Cat petka = new Cat("petka", 11, 24, 101);
        Cat murka = new Cat("murka", 9, 15, 50);

        System.out.println("murka = " + murka);
        System.out.println("petka = " + petka);
        System.out.println("murka = " + murka);


    }

    public static class Cat {

        public static int count = 0;
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
