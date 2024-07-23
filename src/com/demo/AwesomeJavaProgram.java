package com.demo;

public class AwesomeJavaProgram {
    public static void main(String[] args) {
        Cat.dingDong();

        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Sandy";
        myCat.age = 6;
        Cat anotherCat = new Cat();
        anotherCat.meow();
        anotherCat.name="Stella";
        anotherCat.age = 5;
        System.out.println(myCat.age);
    }
}
