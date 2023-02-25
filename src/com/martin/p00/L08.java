package com.martin.p00;

// 继承
// 1. 继承的特性
// 第一，子类拥有父类非private的属性和功能
// 第二，子类具有自己的属性和功能，即子类可以扩展父类没有的属性和功能
// 第三，子类还可以以自己的方式实现父类的功能（方法重写）。

// 父类
class Animal {

    // 该属性只可以被子类继承并使用
    protected String name;

    public Animal() {
        this.name = "无名";
    }

    public Animal(String name) {
        this.name = name;
    }

    protected void shoutNum(int num) {
        System.out.println(this.name + "叫了");
    }
}

// 子类: Cat
class Cat extends Animal {

    public Cat() {
        super();
    }

    public Cat(String name) {
        super();
    }
}

// 子类: Dog
class Dog extends Animal {
    public Dog() {
        super();
    }

    public Dog(String name) {
        super();
    }
}

public class L08 {
    public static void main(String[] args) {
        Cat cat = new Cat("小白");
        cat.shoutNum(3);

        Dog dog = new Dog("小黑");
        dog.shoutNum(4);
    }
}
