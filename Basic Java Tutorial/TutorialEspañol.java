//En Java, cada aplicación comienza con un nombre de clase y esa clase debe coincidir con el nombre del archivo.

public class TutorialEspañol {
    public static void main(String[] args) {
            System.out.println("Hello World");

    /*Cada línea de código que se ejecuta en Java debe estar dentro de una clase. En nuestro ejemplo, llamamos a la clase Main. 
    Una clase siempre debe comenzar con una primera letra mayúscula. Nota: Java distingue entre mayúsculas y minúsculas: "MyClass" y "myclass" tienen un significado diferente.
    Se requiere el método main () y lo verá en todos los programas Java y se ejecutará cualquier código dentro del método main ().
    Podemos usar el método println () para imprimir una línea de texto en la pantalla.    
    Nota: Las llaves {} marcan el comienzo y el final de un bloque de código. Nota: Cada declaración de código debe terminar con un punto y coma.
    
    En Java, existen diferentes tipos de variables, por ejemplo: (tipo variable = valor;)

    String: almacena texto, como "Hola". Los valores de cadena están rodeados por comillas dobles
    int: almacena interger (números enteros), sin decimales, como 123 o -123
    float: almacena números de punto flotante, con decimales, como 19,99 o -19,99
    char: almacena caracteres individuales, como 'a' o 'B'. Los valores de caracteres están rodeados por comillas simples
    booleano: almacena valores con dos estados: verdadero o falso
    */

            String name = "John";
            System.out.println(name);
    
    //También puede declarar una variable sin asignar el valor y asignar el valor más tarde.
            int myNum;
            myNum = 15;
            System.out.println(myNum);

    //Puede agregar la palabra clave final si no desea que otros (o usted mismo) sobrescriban los valores existentes.
            final int myNum2 = 15;
            System.out.println(myNum2);

            String firstName = "John ";
            String lastName = "Doe";
            String fullName = firstName + lastName;
            System.out.println(fullName);

    /* Para valores numéricos, el carácter + funciona como operador matemático. (variables int (interger))

    Las reglas generales para construir nombres para variables (identificadores únicos) son:

    Los nombres pueden contener letras, dígitos, guiones bajos y signos de dólar
    Los nombres deben comenzar con una letra
    Los nombres deben comenzar con una letra minúscula y no pueden contener espacios en blanco
    Los nombres también pueden comenzar con $ y _ (pero no los usaremos en este tutorial)
    Los nombres distinguen entre mayúsculas y minúsculas ("myVar" y "myvar" son variables diferentes)
    Las palabras reservadas (como palabras clave de Java, como int o boolean) no se pueden utilizar como nombres


    La conversión de tipos es cuando asigna un valor de un tipo de datos primitivo a otro tipo.
    */
            int myInt = 9;
            double myDouble = myInt; // Conversion automática: int para double

            System.out.println(myInt);      // Outputs 9
            System.out.println(myDouble);   // Outputs 9.0

    //La reducción de la conversión se debe hacer manualmente colocando el tipo entre paréntesis delante del valor:
            int myInt2 = (int) myDouble; // Conversion manual: double a int

            System.out.println(myDouble);   // Outputs 9.0
            System.out.println(myInt2);      // Outputs 9

    /*      
            Operador    Nombre	        Descripcion	                            Ejemplo
            +           Suma            Suma dos valores                        x + y
            -           Resta           Resta un valor de otro                  x - y
            *           Multiplicación  Multiplica dos valores                  x * y
            /           División        Divide un valor por otro                x / y
            %           Módulo          Devuelve el resto de la división        x% y
            ++          Incremento      Aumenta el valor de una variable en 1   ++x
            -           Disminuir       Disminuye el valor de una variable en 1 --x

            Operador	Ejemplo	        Same As
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
            
    La longitud de una String se puede encontrar con el método length() */
            String txt = "Hello World";
            System.out.println("The length of the txt string is: " + txt.length());
            System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
            System.out.println(txt.toLowerCase());   // Outputs "hello world"

    //El método indexOf() devuelve el índice (la posición) de la primera aparición de un texto especificado en una String (incluidos los espacios en blanco):
            String txt2 = "Please locate where 'locate' occurs!";
            System.out.println(txt2.indexOf("locate")); // Outputs 7
    
    //También puede usar el método concat() para concatenar(unir, combinar) dos cadenas
            System.out.println(firstName.concat(lastName));
            System.out.println(firstName + " " + lastName);

    /* Debido a que las String deben escribirse entre comillas, Java malinterpretará esta cadena y generará un error:
        String txt = "Somos los llamados" vikingos "del norte.";
   
    La solución para evitar este problema es utilizar el "carácter de escape" de barra invertida.
    El carácter de escape de barra invertida (\) convierte los caracteres especiales en caracteres de cadena:

    "carácter de escape"    Resultado           Descripción
        \'	                '                   Una frase
        \"                  "                   Comillas dobles
        \\                  \                   Barra invertida
        \n                  Nueva línea
        \r                  Retorno de carro
        \t                  Tab
        \b                  Retroceso
        \f                  Form Feed
    */
            String txt3 = "We are the so-called \"Vikings\" from the north.";
            System.out.println(txt3);
    
    /*La clase Java Math tiene muchos métodos que permiten realizar tareas matemáticas con números.
    El método Math.max (x, y) se puede utilizar para encontrar el valor más alto de x e y:
    */
            System.out.println(Math.max(5, 10));

    //El método Math.min(x, y) se puede utilizar para encontrar el valor más bajo de xey:
            System.out.println(Math.min(5, 10));

    //El método Math.sqrt(x) devuelve la raíz cuadrada de x:
            System.out.println(Math.sqrt(64));

    //El método Math.abs(x) devuelve el valor absoluto (positivo) de x:
            System.out.println(Math.abs(-4.7));

    //Math.random() devuelve un número aleatorio entre 0.0 (inclusive) y 1.0 (exclusivo):
            System.out.println(Math.random());
    
    //Para tener más control sobre el número aleatorio, Ej. solo desea un número aleatorio entre 0 y 100, puede usar la siguiente fórmula:
            System.out.println(Math.random() * 101);

    /*
    Use     if          para especificar un bloque de código que se ejecutará, si una condición especificada es verdadera
    Use     else        para especificar un bloque de código que se ejecutará, si la misma condición es falsa
    Use     else if     para especificar una nueva condición para probar, si la primera condición es falsa
    Use     switch      para especificar muchos bloques de código alternativos que se ejecutarán
    */ 
            int time = 22;
            if (time < 10) {
                    System.out.println("Good morning.");
            } else if (time < 20) {
                    System.out.println("Good day.");
            } else {
                    System.out.println("Good evening.");
            }// Outputs "Good evening."

    //variable = (condición) ? expresionVerdadera :  expresionFalsa;
            String result = (time < 18) ? "Good day." : "Good evening.";
            System.out.println(result);

    /*Utilice la instrucción switch para seleccionar uno de los muchos bloques de código que se ejecutarán.
    Así es como funciona:
            La expresión de switch se evalúa una vez.
            El valor de la expresión se compara con los valores de cada caso.
            Si hay una coincidencia, se ejecuta el bloque de código asociado.
            Las palabras clave de break y default son opcionales y se describirán más adelante en este capítulo.
    La palabra clave default especifica algún código para ejecutar si no hay una coincidencia de mayúsculas y minúsculas:
    El ejemplo siguiente utiliza el número del día de la semana para calcular el nombre del día de la semana:
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

    //Los bucles pueden ejecutar un bloque de código siempre que se alcance una condición específica
            int r = 0;
            while (r < 5) {
                    System.out.println(r);
                    r++;
            }
    
    /*El bucle do/while es una variante del bucle while. Este bucle ejecutará el bloque de código una vez,
    antes de comprobar si la condición es verdadera, repetirá el bucle siempre que la condición sea verdadera.*/
            int i = 0;
            do {
                    System.out.println(i);
                    i++;
            }
            while (i < 5);
    /*Cuando sepa exactamente cuántas veces desea recorrer un bloque de código, use el bucle for en lugar del bucle while:
            La instrucción 1 se ejecuta (una vez) antes de la ejecución del bloque de código. (int i2 = 0)
            La declaración 2 define la condición para ejecutar el bloque de código. (i2 < 5)
            La instrucción 3 se ejecuta (cada vez) después de que se haya ejecutado el bloque de código. (i2++)
    */
            for (int i2 = 0; i2 < 5; i2++) {
                    System.out.println(i2);
            }
    //También hay un bucle "for-each", que se utiliza exclusivamente para recorrer los elementos de un array(matriz/lista):
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            for (String i3 : cars) {
                    System.out.println(i3);
            }
    /*Ya has visto la instrucción break utilizada en un capítulo anterior de este tutorial.
    Se utilizó para "saltar fuera" de una declaración switch.
    La sentencia break también se puede utilizar para saltar fuera de un bucle.

    La instrucción continue rompe una iteración (en el bucle), si ocurre una condición específica, y continúa con la siguiente
    iteración en el bucle.

    También puede usar break y continue en bucles while


    Las arrays(matrices) se utilizan para almacenar varios valores en una sola variable, en lugar de declarar variables independientes para cada valor.

    Para declarar una array(matriz), defina el tipo de variable entre corchetes:
            String[] cars;

    Ahora hemos declarado una variable que contiene una array de strings. Para insertar valores en él, podemos usar un literal de array: coloque los valores en una lista separada por comas, entre llaves:
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

    Para crear una array(matriz) de números enteros(int), puede escribir:
            int[] myNum = {10, 20, 30, 40};

    Puede acceder a un elemento de una array(matriz) consultando el número de índice.
    */
            System.out.println(cars[0]);

    //Para cambiar el valor de un elemento específico, consulte el número de índice:
            cars[0] = "Opel";
            System.out.println(cars[0]);// Ahora outputs Opel en vez de Volvo

    //Para saber cuántos elementos tiene un array, use la propiedad length:
            System.out.println(cars.length);
    
    //También hay un bucle "for-each", que se utiliza exclusivamente para recorrer elementos en arrays:
            for (String i4 : cars) {
                    System.out.println(i4);
            }

    //Una array(matriz) multidimensional es una array(matriz) de arrays(matrices).
            int[][] myMultidimensionalArrays = { {1, 2, 3, 4}, {5, 6, 7} };
            int myMultiArray = myMultidimensionalArrays[1][2];
            System.out.println(myMultiArray); // Outputs 7

    /*También podemos usar un bucle for dentro de otro bucle for para obtener los elementos de una array(matriz) bidimensional
    (todavía tenemos que apuntar a los dos índices):*/
            for (int s = 0; s < myMultidimensionalArrays.length; ++s) {
                    for(int j = 0; j < myMultidimensionalArrays[s].length; ++j) {
                            System.out.println(myMultidimensionalArrays[s][j]);
                            }
                    }
    }
}
