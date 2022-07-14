package javaExamples;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        // Creating a new HashSet for iteration
        HashSet<Integer> set = new HashSet<>();
  
        // Add data to HashMap
        set.add(10);
        set.add(20);
  
        // Duplicates not allowed in HashMap, so avoid by
        // HashMap
        set.add(10);
        set.add(50);
  
        // Duplicates not allowed in HashMap, so avoid by
        // HashMap
        set.add(50);
  
        // Create a iterator of type integer to iterate
        // HashSet
        Iterator<Integer> it = set.iterator();
  
        System.out.println(
            "Iterate HashSet using iterator : ");
  
        // Iterate HashSet with the help of hasNext() and
        // next() method
        while (it.hasNext()) {
  
            // Print HashSet values
            System.out.print(it.next() + " ");
        }
    }

	}


