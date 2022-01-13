package ClassesTutorial;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class
import java.util.LinkedList;
import java.time.*; // import the time package with all the classes
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class


/*The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. 
To achieve this, you must:

    →declare class variables/attributes as private
    →provide public get and set methods to access and update the value of a private variable

Why?
    →Better control of class attributes and methods
    →Class attributes can be made read-only (if you only use the get method), 
        or write-only (if you only use the set method)
    →Flexible: the programmer can change one part of the code without affecting other parts
    →Increased security of data

You learned from the previous chapter that private variables can only be accessed within the 
same class (an outside class has no access to it). However, it is possible to access them if 
we provide public get and set methods.
*/

public class EncapsulationDateJavaUtil {
    
    private String name; // private = restricted access
    
    // Getter
    public String getName() {
        return name;
    }
    
    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    
/*
To use the Scanner class, create an object of the class and use any of the available methods 
found in the Scanner class documentation. In our example, we will use the nextLine() method, 
which is used to read a complete line:

    Method	            Description
    nextBoolean()	    Reads a boolean value from the user
    nextByte()	        Reads a byte value from the user
    nextDouble()	    Reads a double value from the user
    nextFloat()	        Reads a float value from the user
    nextInt()	        Reads a int value from the user
    nextLine()	        Reads a String value from the user
    nextLong()	        Reads a long value from the user
    nextShort()	        Reads a short value from the user

    Class	            Description
    LocalDate	        Represents a date (year, month, day (yyyy-MM-dd))
    LocalTime	        Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
    LocalDateTime	    Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
    DateTimeFormatter   Formatter for displaying and parsing date-time objects

    Value	            Example
    yyyy-MM-dd	        "1988-09-29"	
    dd/MM/yyyy	        "29/09/1988"	
    dd-MMM-yyyy	        "29-Sep-1988"	
    E, MMM dd yyyy	    "Thu, Sep 29 1988"

The ArrayList class is a resizable array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, is that the size of an array 
cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). 
While elements can be added and removed from an ArrayList whenever you want. 
The syntax is also slightly different:

 */
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now(); // Create a date object
        System.out.println(myDate); // Display the current date

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);

        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateTime);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    
        String formattedDate = myDateTime.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        System.out.println(cars.get(0));
        cars.set(0, "Opel");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);
        cars.size();
        cars.clear();
        System.out.println(cars);
        
/*Elements in an ArrayList are actually objects. In the examples above, we created elements 
(objects) of type "String". Remember that a String in Java is an object (not a primitive type). 
To use other types, such as int, you must specify an equivalent wrapper class: Integer. For other 
primitive types, use: Boolean for boolean, Character for char, Double for double, etc:
*/

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(15);
        myNumbers.add(10);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
        System.out.println(i);
        }

/*Another useful class in the java.util package is the Collections class, which include the sort() method 
for sorting lists alphabetically or numerically:

The LinkedList class is almost identical to the ArrayList:
The LinkedList stores its items in "containers." The list has a link to the first container and each 
container has a link to the next container in the list. To add an element to the list, the element is 
placed into a new container and that container is linked to one of the other containers in the list.

Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.

    Method	        Description
    addFirst()	    Adds an item to the beginning of the list.	
    addLast()	    Add an item to the end of the list	
    removeFirst()	Remove an item from the beginning of the list.	
    removeLast()	Remove an item from the end of the list	
    getFirst()	    Get the item at the beginning of the list	
    getLast()	    Get the item at the end of the list

*/

        Collections.sort(myNumbers);  // Sort cars
        for (int i : myNumbers) {
        System.out.println(i);
        }

        LinkedList<String> cars2 = new LinkedList<String>();
        cars2.add("Volvo");
        cars2.add("BMW");
        cars2.add("Ford");
        cars2.add("Mazda");
        System.out.println(cars2);

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");
    
        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
        myObj.close();
    }

/*The get method returns the value of the variable name.
The set method takes a parameter (newName) and assigns it to the name variable. The this keyword 
is used to refer to the current object.
However, as the name variable is declared as private, we cannot access it from outside this class.
Instead, we use the getName() and setName() methods to access and update the variable


A package in Java is used to group related classes. Think of it as a folder in a file directory. We use 
packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into 
two categories:

    →Built-in Packages (packages from the Java API)
    →User-defined Packages (create your own packages)

The Java API is a library of prewritten classes, that are free to use, included in 
the Java Development Environment.

The library is divided into packages and classes. Meaning you can either import a single class 
(along with its methods and attributes), or a whole package that contain all the classes that 
belong to the specified package.

To use a class or a package from the library, you need to use the import keyword:
import package.name.Class;   // Import a single class
import package.name.*;   // Import the whole package

To create your own package, use the package keyword

*/
      
}
