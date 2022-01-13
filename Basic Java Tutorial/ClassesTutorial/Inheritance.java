package ClassesTutorial;

/*
In Java, it is possible to inherit attributes and methods from one class to another. 
We group the "inheritance concept" into two categories:

    →subclass (child) - the class that inherits from another class
    →superclass (parent) - the class being inherited from
    →To inherit from a class, use the extends keyword.

In the example below, the Car class (subclass) inherits the attributes and 
methods from the Vehicle class (superclass)

It is useful for code reusability: 
reuse attributes and methods of an existing class when you create a new class.
*/

class Inheritance {
    protected String brand = "Ford";        // ConstructorClasses3 attribute

    public void honk() {                    // ConstructorClasses3 method
        System.out.println("Tuut, tuut!");
    }
}
  
class Car extends Inheritance {
    private String modelName = "Mustang";    // Car attribute
    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the ConstructorClasses3 class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the ConstructorClasses3 class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
