package ClassesTutorial;
/*Polymorphism means "many forms", and it occurs when we have many classes that are related 
to each other by inheritance.

Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods 
from another class. Polymorphism uses those methods to perform different tasks. This allows us to 
perform a single action in different ways.

For example, think of a superclass called Animal that has a method called animalSound(). 
Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation 
of an animal sound (the pig oinks, and the cat meows, etc.):
*/

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}
    
class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}
    
class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}
 
/*In Java, it is also possible to nest classes (a class within a class). The purpose of 
nested classes is to group classes that belong together, which makes your code more readable and maintainable.

To access the inner class, create an object of the outer class, and then create an object of 
the inner class:
*/
class OuterClass {
    int x = 10;
  
    class InnerClass {
        int y = 5;
    }
/*Unlike a "regular" class, an inner class can be private or protected. If you don't want outside 
objects to access the inner class, declare the class as private.

One advantage of inner classes, is that they can access attributes and methods of the outer class
*/
    class InnerClass2 {
        public int myInnerMethod() {
            return x;
        }
    }

}

class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();

        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);

        OuterClass.InnerClass2 myInner2 = myOuter.new InnerClass2();
        System.out.println(myInner2.myInnerMethod());
    }
}

