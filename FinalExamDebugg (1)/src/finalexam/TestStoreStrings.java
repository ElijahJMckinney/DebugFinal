// Corrected TestStoreStrings.java
package finalexam;

import java.util.ArrayList;
import stringCollections.StoreStrings;

public class TestStoreStrings {

    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<>(); // Corrected ArrayList declaration
        states.add("Virginia");
        states.add("New York"); // Added missing semicolon
        states.add("Michigan");
        states.add("Indiana");
        states.add("Missouri");
        states.add("Indiana");

        states.sort(null);

        for (String state : states) { // Fixed loop syntax
            System.out.println(state); // Added missing semicolon
        }

        if (StoreStrings.duplicateString(states)) {
            System.out.println("Error! Contains more than one entry of the same state in the list. Must have only one entry for the state in the list");
        } else {
            System.out.println(StoreStrings.count(states));
        }
    }
}