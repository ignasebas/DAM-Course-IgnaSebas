package ClassesTutorial;

/*OOP stands for Object-Oriented Programming.
Procedural programming is about writing procedures or methods that perform operations on the data, 
while object-oriented programming is about creating objects that contain both data and methods.

Object-oriented programming has several advantages over procedural programming:

→ OOP is faster and easier to execute
→ OOP provides a clear structure for the programs
→ OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, 
→ modify and debug
→ OOP makes it possible to create full reusable applications with less code and shorter development time

Tip: The "Don't Repeat Yourself" (DRY) principle is about reducing the repetition of code. 
You should extract out the codes that are common for the application, and place them at a single 
place and reuse them instead of repeating it.

Classes and objects are the two main aspects of object-oriented programming.
When the individual objects are created, they inherit all the variables and methods from the class.

A Class is like an object constructor, or a "blueprint" for creating objects.

Remember that... The dot (.) is used to access the object's attributes and methods.
*/
public class MainClasses {

    int x = 5, y;

//If you don't want the ability to override existing values, declare the attribute as final
    final int z = 4;
    
/*
In Java, an object is created from a class. We have already created the class named ClassesTutorial, 
so now we can use this to create objects.
To create an object of ClassesTutorial, specify the class name, followed by the object name, 
and use the keyword new:
*/
    static void myMethod() {
        System.out.println("Hello World!");
    }

/*
You will often see Java programs that have either static or public attributes and methods.

In the example above, we created a static method, which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects:
*/
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    
/*Access Methods With an Object → Create a Car object named myCar. Call the fullThrottle() and speed() 
on the myCar object, and run the program in SecondaryClasses.java   
*/
    //fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    //speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        myMethod();

        MainClasses myObj1 = new MainClasses();  // Object 1
        MainClasses myObj2 = new MainClasses();  // Object 2
        
//You can change the attribute values in one object, without affecting the attribute 
//values in the other:
        myObj1.x = 1212;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);

        myStaticMethod(); // Call the static method
        myObj1.myPublicMethod(); // Call the public method on the object

    }
}
