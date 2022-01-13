package ClassesTutorial;

/*You can also create an object of a class and access it in another class. 
This is often used for better organization of classes (one class has all the attributes 
and methods, while the other class holds the main() method (code to be executed)).

Remember that the name of the java file should match the class name.
*/
public class SecondaryClasses {
    public static void main(String[] args) {
        MainClasses myObj = new MainClasses();
        System.out.println(myObj.y + " " + myObj.x + " " + myObj.z) ;
    //You can also modify attribute values or override existing values:
        myObj.y = 50;
        myObj.x = 34;
        System.out.println(myObj.y + " " + myObj.x + " " + myObj.z);
        
        MainClasses myCar = new MainClasses();   // Create a myCar object
        myCar.fullThrottle();      // Call the fullThrottle() method
        myCar.speed(200);          // Call the speed() method
    }
}
