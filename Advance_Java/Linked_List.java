package Advance_Java;

import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l2.add(18);
        l2.add(23);
        l2.add(34);

        l1.add(2);                      // Adds element from 0th index in Ascending order
        l1.add(6);
        l1.add(4);
        l1.add(2);
//        l1.add(1, 5);      // Adds element to specified position
//        l1.remove(2);                   // Removes the element at given index
//        l1.set(2, 34);                     // Replaces the element at given index to updated element
//        l1.clear();                        // Empties/Clears the array
//        l1.addAll(l2);                     // Adds given Array list in the end
//        l1.addAll(0, l2);                  // Adds given Array list in the specified position
//        l1.removeAll(l2);                  // Removes given Array list
//        l1.isEmpty();   // Updates the Capacity of existing array
        l1.addLast(634);                   // Adds element to the last of list
        l1.addFirst(122);                  // Adds element to the First of list
        System.out.println(l1.isEmpty());     // Returns true if the ArrayList is empty , if not then returns false
        System.out.println(l1.contains(33));  // Returns true if the element is present in the array else returns false
        System.out.println(l1.indexOf(2));    // Returns the index of first occurrence of the element , if element not present then it returns false
        System.out.println(l1.lastIndexOf(2)); // Returns the index of last occurrence of the element , if element not present then it returns false

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
