package practice;

//Parent Class
class Animal {
 void eat() {
     System.out.println("Animal is eating");
 }
}

//Child Class 1
class Dog extends Animal {
 void bark() {
     System.out.println("Dog is barking");
 }
}

//Child Class 2
class Cat extends Animal {
 void meow() {
     System.out.println("Cat is meowing");
 }
}

//Main Class
public class HierarchicalInheritanceExample {
 public static void main(String[] args) {
     
     Dog d = new Dog();
     d.eat();   // from Animal
     d.bark();  // own method

     Cat c = new Cat();
     c.eat();   // from Animal
     c.meow();  // own method
 }
}