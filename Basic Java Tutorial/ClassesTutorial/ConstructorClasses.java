package ClassesTutorial;
/*A constructor in Java is a special method that is used to initialize objects. 
The constructor is called when an object of a class is created. It can be used
to set initial values for object attributes:
*/
public class ConstructorClasses {
    private int modelYear;
    private String modelName;  // Create a class attribute

/*Create a class constructor for the ConstructorClasses class 
Note that the constructor name must match the class name, and it cannot have a return type (like void).
Constructors can also take parameters, which is used to initialize attributes.
*/
    public ConstructorClasses(int year, String name) {
        modelYear = year;
        modelName = name;  // Set the initial value for the class attribute modelYear and modelName 
    }
  
    public static void main(String[] args) {
        ConstructorClasses myCar = new ConstructorClasses(1969, "Mustang"); // Create an object of class ConstructorClasses (This will call the constructor)
        System.out.println("My car is a "+ myCar.modelYear + " " + myCar.modelName); // Print the values of myCar

        EncapsulationDateJavaUtil myPerson = new EncapsulationDateJavaUtil();
        myPerson.setName("John"); // Set the value of the name variable to "John"
        System.out.println("Nombre es " + myPerson.getName());
    }
}

/*The public keyword is an access modifier, meaning that it is used to set the access level for classes,
attributes, methods and constructors.
We divide modifiers into two groups:

Access Modifiers - controls the access level
Non-Access Modifiers - do not control access level, but provides other functionality

Access Modifiers
For classes, you can use either public or default:
    Modifier	Description	
    public	    The class is accessible by any other class	
    default	    The class is only accessible by classes in the same package. 
                This is used when you don't specify a modifier. 

For attributes, methods and constructors, you can use the one of the following:
    Modifier	Description	
    public	    The code is accessible for all classes	
    private	    The code is only accessible within the declared class	
    default	    The code is only accessible in the same package. This is used when you don't specify a modifier. 
    protected	The code is accessible in the same package and subclasses.

Non-Access Modifiers
For classes, you can use either final or abstract:
    Modifier	Description
    final	    The class cannot be inherited by other classes (You will learn more about inheritance in 
                the Inheritance chapter)	
    abstract	The class cannot be used to create objects (To access an abstract class, it must be 
                inherited from another class. You will learn more about inheritance and abstraction 
                in the Inheritance and Abstraction chapters)	

For attributes and methods, you can use the one of the following:
    Modifier	    Description
    final	        Attributes and methods cannot be overridden/modified
    static	        Attributes and methods belongs to the class, rather than an object
    abstract	    Can only be used in an abstract class, and can only be used on methods. 
                    The method does not have a body, for example abstract void run();. 
                    The body is provided by the subclass (inherited from).
    transient	    Attributes and methods are skipped when serializing the object containing them
    synchronized	Methods can only be accessed by one thread at a time
    volatile	    The value of an attribute is not cached thread-locally, and is always read from 
                    the "main memory"
*/