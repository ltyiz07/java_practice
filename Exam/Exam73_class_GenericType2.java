package Exam;

import java.util.ArrayList;

class Fruit implements Eatable {
    public String toString() { return "Fruit"; }
}

class Apple extends Fruit { public String toString() { return "Apple"; }}
class Grape extends Fruit { public String toString() { return "Grape"; }}
class Toy { public String toString() { return "Toy"; }}

interface Eatable {}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item); }
    T get (int i) { return list.get(i); }
    int size() { return list.size(); }
    public String toString() { return list.toString(); }
}

public class Exam73_class_GenericType2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();


        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        fruitBox.add(new Grape());
        fruitBox.add(new Apple());

        System.out.println("fruitBox-" + fruitBox);
        System.out.println("fruitBox-" + appleBox);
        System.out.println("fruitBox-" + grapeBox);

    }
}