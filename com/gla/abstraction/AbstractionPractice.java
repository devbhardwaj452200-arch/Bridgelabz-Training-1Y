package com.gla.abstraction;
abstract class Fruit{
    abstract void test();
    public void colour(){
        System.out.println("Yellow");
    }
}
class Mango extends Fruit{

    @Override
    void test() {
        System.out.println("Sweet");
    }
}


class PineApple extends Fruit{

    @Override
    void test() {
        System.out.println("Sour-Sweet");
    }
}
public class AbstractionPractice {
    public static void main(String[] args){
Mango m1=new Mango();
m1.test();
m1.colour();

Fruit f1=new Mango();
f1.colour();
f1.test();

        PineApple p1=new PineApple();
        p1.test();
    }
}
