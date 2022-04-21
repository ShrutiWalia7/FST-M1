package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String arg[]){
    HashMap<Integer, String> colors = new HashMap<Integer, String>();
        colors.put(1,"One");
        colors.put(2,"Two");
        colors.put(3,"Three");
        colors.put(4,"Four");

        System.out.println("The Original map: " + colors);
        // Remove one colour
        colors.remove(4);
        // Map after removing a colour
        System.out.println("After removing: " + colors);
        // Check if green exists
        if(colors.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        } else {
            System.out.println("Green does not exist in the Map");
        }
        // Print the size of the Map
        System.out.println("Number of pairs in the Map is: " + colors.size());
}
}
