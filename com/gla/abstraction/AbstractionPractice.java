package com.gla.abstraction;
abstract class Fruit{
    abstract void taste();
    public void colour(){
        System.out.println("Yellow");
    }
}
class Mango extends Fruit{

    @Override
    void taste() {
        System.out.println("Sweet");
    }
}


class PineApple extends Fruit{

    @Override
    void taste() {
        System.out.println("Sour-Sweet");
    }
}
public class AbstractionPractice {
    public static void main(String[] args){
Mango m1=new Mango();
m1.taste();
m1.colour();

Fruit f1=new Mango();
f1.colour();
f1.taste();

        PineApple p1=new PineApple();
        p1.taste();
    }
}
