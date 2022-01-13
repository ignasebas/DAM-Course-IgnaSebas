public class Methods {

    /*  myMethod()  is the name of the method
        static      means that the method belongs to the Main class and not an object of the Main class. 
        void        means that this method does not have a return value.
    */
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    /*Information can be passed to methods as parameter. Parameters act as variables inside the method.
    Parameters are specified after the method name, inside the parentheses. You can add as many parameters 
    as you want, just separate them with a comma. 
    */
    
    static void myMethod2(String fname, int age) {
        System.out.println(fname + " is " + age);
        //In this example "Juan" is an argument and fname a parameter.
    }

    /*If you want the method to return a value, you can use a primitive data type (such as int, char, etc.)
    instead of void, and use the return keyword inside the method:
    */

    static int mySumMethod(int x, int y) {
        return y + x;
    }
    
      // Create a checkAge() method with an integer variable called age
    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

        // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }

    //With method overloading, multiple methods can have the same name with different parameters:
    static int plusMethod(int x, int y) {
        return x + y;
    }
    
    static double plusMethod(double x, double y) {
        return x + y;
    }

    
    /*Recursion is the technique of making a function call itself. This technique provides a way to 
    break complicated problems down into simple problems which are easier to solve.*/
    static int sum(int k) {
        if (k > 0) {
          return k + sum(k - 1);
        } else {
          return 0;
        }
    }

    /*
    When the sum() function is called, it adds parameter k to the sum of all numbers smaller than k 
    and returns the result. When k becomes 0, the function just returns 0. When running, the program follows these steps:

    10 + sum(9)
    10 + ( 9 + sum(8) )
    10 + ( 9 + ( 8 + sum(7) ) )
    ...
    10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
    10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0

    Just as loops can run into the problem of infinite looping, recursive functions can run into the problem of infinite recursion. 
    Infinite recursion is when the function never stops calling itself. Every recursive function should have a halting condition, 
    which is the condition where the function stops calling itself. In the previous example, the halting condition is when the 
    parameter k becomes 0.
    */

    //To call a method in Java, write the method's name followed by two parentheses () and a semicolon;
    //A method can also be called multiple times:
    public static void main(String[] args) {
        myMethod();

        myMethod2("Juan", 14);

        int z = mySumMethod(5, 3);
        System.out.println(z);

        checkAge(17);

        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

        int result = sum(10);
        System.out.println(result);

        double x,y;
        x = 3.4;
        y = 3.0*x*x+2.0/x;
        System.out.println(y);

    }

    /*In Java, variables are only accessible inside the region they are created. This is called scope.
    A block of code refers to all of the code between curly braces {}. Variables declared inside blocks
    of code are only accessible by the code between the curly braces, which follows the line in which
    the variable was declared
    */
}
