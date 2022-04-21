package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] arg){
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("grapes");

        myList.add(3,"Kiwi");
        myList.add(3,"Lime");

        for (String fruit:myList) {
            System.out.println(fruit);
        }
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Apple is in list: " + myList.contains("Apple"));
        System.out.println("Size of ArrayList: " + myList.size());
        myList.remove("Kiwi");
        System.out.println("New Size of ArrayList: " + myList.size());
    }
    }
