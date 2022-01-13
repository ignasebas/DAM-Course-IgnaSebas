package ClassesTutorial;
import java.util.HashMap; // import the HashMap class

public class MoreJavaUtil {

/* A HashMap however, store items in "key/value" pairs, and you can access them by an index 
of another type (e.g. a String).

One object is used as a key (index) to another object (value). It can store different types: 
String keys and Integer values, or the same type, like: String keys and String values: 
*/
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        System.out.println(capitalCities.get("England"));
        capitalCities.remove("England");
        System.out.println(capitalCities);
        System.out.println(capitalCities.size());
        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }
        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " - Value: " + capitalCities.get(i));
        }
        capitalCities.clear();
        System.out.println(capitalCities);
    }
}
