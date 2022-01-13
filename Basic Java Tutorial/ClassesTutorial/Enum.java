package ClassesTutorial;

/*An enum is a special "class" that represents a group of constants (unchangeable variables, 
like final variables).

To create an enum, use the enum keyword (instead of class or interface), and separate the constants 
with a comma. Note that they should be in uppercase letters:
*/
public class Enum {

//You can also have an enum inside a class
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
      
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
    
//Enums are often used in switch statements to check for corresponding values
        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
/*The enum type has a values() method, which returns an array of all enum constants.
This method is useful when you want to loop through the constants of an enum
*/
        for (Level myVar2 : Level.values()) {
            System.out.println(myVar2);
        }
    }   
}
