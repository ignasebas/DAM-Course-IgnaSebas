package ClassesTutorial;

/*
Another way to achieve abstraction in Java, is with interfaces.
An interface is a completely "abstract class" that is used to group related methods with empty bodies:

interface Animal {
    public void animalSound(); ← interface method (does not have a body)
    public void run(); ← interface method (does not have a body)
}

To access the interface methods, the interface must be "implemented" (kinda like inherited) by another 
class with the implements keyword (instead of extends). The body of the interface method is provided 
by the "implement" class

Why?
    1) To achieve security - hide certain details and only show the important details of an object (interface).

    2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, 
        it can be achieved with interfaces, because the class can implement multiple interfaces. 
        Note: To implement multiple interfaces, separate them with a comma (see example below).
*/

interface FirstInterface {
    public void myMethod(); // interface method
}
  
interface SecondInterface {
    public void myOtherMethod(); // interface method
}
  
class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text..");
    }
    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}
  
class Interface {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}

