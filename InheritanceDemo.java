// Single Level Inheritance
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Multilevel Inheritance
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

class SportsCar extends Car {
    void accelerate() {
        System.out.println("SportsCar is accelerating");
    }
}

// Hierarchical Inheritance
class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing circle");
    }
}

class Square extends Shape {
    void drawSquare() {
        System.out.println("Drawing square");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Single Level Inheritance
        System.out.println("Single Level Inheritance:");
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        // Multilevel Inheritance
        System.out.println("\nMultilevel Inheritance:");
        SportsCar sportsCar = new SportsCar();
        sportsCar.start();
        sportsCar.drive();
        sportsCar.accelerate();

        // Hierarchical Inheritance
        System.out.println("\nHierarchical Inheritance:");
        Circle circle = new Circle();
        circle.draw();
        circle.drawCircle();

        Square square = new Square();
        square.draw();
        square.drawSquare();
    }
}
