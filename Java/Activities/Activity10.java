package activities;

import java.util.ArrayList;
import java.util.HashSet;

public class Activity10 {
    public static void main(String[] arg){
        HashSet<String> hs = new HashSet<String>();
        hs.add("Apple");
        hs.add("Banana");
        hs.add("grapes");
        hs.add("Kiwi");
        hs.add("Lime");
        hs.add("Papaya");

        System.out.println("Size of HashSet: " + hs.size());
        hs.remove("Kiwi");
        if(hs.remove("movie")) {
            System.out.println("Z removed from the Set");
        } else {
            System.out.println("Z is not present in the Set");
        }
        System.out.println("Is Apple is in list: " + hs.contains("Apple"));

        for (String fruit:hs) {
            System.out.println(fruit);
        }
    }
}

