//In Java, every application begins with a class name, and that class must match the filename.

public class Tutorial {
        public static void main(String[] args) {
                System.out.println("Hello World");

        /*Every line of code that runs in Java must be inside a class. In our example, we named the class Main. 
        A class should always start with an uppercase first letter. Note: Java is case-sensitive: "MyClass" and "myclass" has different meaning.

        The main() method is required and you will see it in every Java program and any code inside the main() method will be executed.
        We can use the println() method to print a line of text to the screen. 
        Note: The curly braces {} marks the beginning and the end of a block of code. Note: Each code statement must end with a semicolon.

        In Java, there are different types of variables, for example:   (type variable = value;)

        String - stores text, such as "Hello". String values are surrounded by double quotes
        int - stores integers (whole numbers), without decimals, such as 123 or -123
        float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
        boolean - stores values with two states: true or false

        */

                String name = "John";
                System.out.println(name);
        
        //You can also declare a variable without assigning the value, and assign the value later.
                int myNum;
                myNum = 15;
                System.out.println(myNum);

        //You can add the final keyword if you don't want others (or yourself) to overwrite existing values.
                final int myNum2 = 15;
                System.out.println(myNum2);

                String firstName = "John ";
                String lastName = "Doe";
                String fullName = firstName + lastName;
                System.out.println(fullName);

        /*For numeric values, the + character works as a mathematical operator. (int (integer) variables)

        The general rules for constructing names for variables (unique identifiers) are:

        Names can contain letters, digits, underscores, and dollar signs
        Names must begin with a letter
        Names should start with a lowercase letter and it cannot contain whitespace
        Names can also begin with $ and _ (but we will not use it in this tutorial)
        Names are case sensitive ("myVar" and "myvar" are different variables)
        Reserved words (like Java keywords, such as int or boolean) cannot be used as names


        Type casting is when you assign a value of one primitive data type to another type.
        */
                int myInt = 9;
                double myDouble = myInt; // Automatic casting: int to double

                System.out.println(myInt);      // Outputs 9
                System.out.println(myDouble);   // Outputs 9.0

        //Narrowing casting must be done manually by placing the type in parentheses in front of the value:
                int myInt2 = (int) myDouble; // Manual casting: double to int

                System.out.println(myDouble);   // Outputs 9.0
                System.out.println(myInt2);      // Outputs 9

        /*      
                Operator        Name	        Description	                        Example
                +	        Addition	Adds together two values	        x + y	
                -	        Subtraction	Subtracts one value from another	x - y	
                *	        Multiplication	Multiplies two values	                x * y	
                /	        Division	Divides one value by another	        x / y	
                %	        Modulus	        Returns the division remainder	        x % y	
                ++	        Increment	Increases the value of a variable by 1	++x	
                --	        Decrement	Decreases the value of a variable by 1	--x

                Operator	Example	        Same As
                =	        x = 5	        x = 5	
                +=	        x += 3	        x = x + 3	
                -=	        x -= 3	        x = x - 3	
                *=	        x *= 3	        x = x * 3	
                /=	        x /= 3	        x = x / 3	
                %=	        x %= 3	        x = x % 3	
                &=	        x &= 3	        x = x & 3	
                |=	        x |= 3	        x = x | 3	
                ^=	        x ^= 3	        x = x ^ 3	
                >>=	        x >>= 3	        x = x >> 3	
                <<=	        x <<= 3	        x = x << 3
                
        The length of a string can be found with the length() method*/
                String txt = "Hello World";
                System.out.println("The length of the txt string is: " + txt.length());
                System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
                System.out.println(txt.toLowerCase());   // Outputs "hello world"

        //The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
                String txt2 = "Please locate where 'locate' occurs!";
                System.out.println(txt2.indexOf("locate")); // Outputs 7
        
        //You can also use the concat() method to concatenate two strings
                System.out.println(firstName.concat(lastName));
                System.out.println(firstName + " " + lastName);

        /* Because strings must be written within quotes, Java will misunderstand this string, and generate an error:
                String txt = "We are the so-called "Vikings" from the north.";
        
        The solution to avoid this problem, is to use the backslash escape character.
        The backslash (\) escape character turns special characters into string characters:

                Escape character	Result	Description
                \'	                '       Single quote
                \"	                "	Double quote
                \\	                \	Backslash	
                \n	                New Line	
                \r	                Carriage Return	
                \t	                Tab	
                \b	                Backspace	
                \f	                Form Feed
        */
                String txt3 = "We are the so-called \"Vikings\" from the north.";
                System.out.println(txt3);
        
        /*The Java Math class has many methods that allows you to perform mathematical tasks on numbers.
        The Math.max(x,y) method can be used to find the highest value of x and y:
        */
                System.out.println(Math.max(5, 10));

        //The Math.min(x,y) method can be used to find the lowest value of x and y:
                System.out.println(Math.min(5, 10));

        //The Math.sqrt(x) method returns the square root of x:
                System.out.println(Math.sqrt(64));

        //The Math.abs(x) method returns the absolute (positive) value of x:
                System.out.println(Math.abs(-4.7));

        //Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
                System.out.println(Math.random());
        
        //To get more control over the random number, e.g. you only want a random number between 0 and 100, you can use the following formula:
                System.out.println(Math.random() * 101);

        /*
        Use     if          to specify a block of code to be executed, if a specified condition is true
        Use     else        to specify a block of code to be executed, if the same condition is false
        Use     else if     to specify a new condition to test, if the first condition is false
        Use     switch      to specify many alternative blocks of code to be executed
        */ 
                int time = 22;
                if (time < 10) {
                        System.out.println("Good morning.");
                } else if (time < 20) {
                        System.out.println("Good day.");
                } else {
                        System.out.println("Good evening.");
                }// Outputs "Good evening."

        //variable = (condition) ? expressionTrue :  expressionFalse;
                String result = (time < 18) ? "Good day." : "Good evening.";
                System.out.println(result);

        /*Use the switch statement to select one of many code blocks to be executed.
        This is how it works:
                The switch expression is evaluated once.
                The value of the expression is compared with the values of each case.
                If there is a match, the associated block of code is executed.
                The break and default keywords are optional, and will be described later in this chapter
        The default keyword specifies some code to run if there is no case match:
        The example below uses the weekday number to calculate the weekday name:
        */
                int day = 4;
                switch (day) {
                        case 6:
                                System.out.println("Today is Saturday");
                                break;
                        case 7:
                                System.out.println("Today is Sunday");
                                break;
                        default:
                                System.out.println("Looking forward to the Weekend");
                }// Outputs "Looking forward to the Weekend"

        //Loops can execute a block of code as long as a specified condition is reached
                int r = 0;
                while (r < 5) {
                        System.out.println(r);
                        r++;
                }
        
        /*The do/while loop is a variant of the while loop. This loop will execute the code block once, 
        before checking if the condition is true, then it will repeat the loop as long as the condition is true.*/
                int i = 0;
                do {
                        System.out.println(i);
                        i++;
                }
                while (i < 5);
        /*When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:
                Statement 1 is executed (one time) before the execution of the code block.
                Statement 2 defines the condition for executing the code block.
                Statement 3 is executed (every time) after the code block has been executed.
        */
                for (int i2 = 0; i2 < 5; i2++) {
                        System.out.println(i2);
                }
        //There is also a "for-each" loop, which is used exclusively to loop through elements in an array:
                String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
                for (String i3 : cars) {
                        System.out.println(i3);
                }
        /*You have already seen the break statement used in an earlier chapter of this tutorial. 
        It was used to "jump out" of a switch statement.
        The break statement can also be used to jump out of a loop.

        The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next 
        iteration in the loop.

        You can also use break and continue in while loops
        

        Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

        To declare an array, define the variable type with square brackets:
                String[] cars;

        We have now declared a variable that holds an array of strings. To insert values to it, we can use an array literal - place the values in a comma-separated list, inside curly braces:
                String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        To create an array of integers, you could write:
                int[] myNum = {10, 20, 30, 40};

        You access an array element by referring to the index number.
        */
                System.out.println(cars[0]);

        //To change the value of a specific element, refer to the index number:
                cars[0] = "Opel";
                System.out.println(cars[0]);// Now outputs Opel instead of Volvo

        //To find out how many elements an array has, use the length property:
                System.out.println(cars.length);
        
        //There is also a "for-each" loop, which is used exclusively to loop through elements in arrays:
                for (String i4 : cars) {
                        System.out.println(i4);
                }

        //A multidimensional array is an array of arrays.
                int[][] myMultidimensionalArrays = { {1, 2, 3, 4}, {5, 6, 7} };
                int myMultiArray = myMultidimensionalArrays[1][2];
                System.out.println(myMultiArray); // Outputs 7

        /*We can also use a for loop inside another for loop to get the elements of a two-dimensional 
        array (we still have to point to the two indexes):*/
                for (int s = 0; s < myMultidimensionalArrays.length; ++s) {
                        for(int j = 0; j < myMultidimensionalArrays[s].length; ++j) {
                                System.out.println(myMultidimensionalArrays[s][j]);
                                }
                        }
        }
}
