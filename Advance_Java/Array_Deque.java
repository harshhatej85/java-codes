package Advance_Java;

import java.util.ArrayDeque;

public class Array_Deque {
    public static void main(String[] args) {

        ArrayDeque<Integer> l1 = new ArrayDeque<Integer>();
        ArrayDeque<Integer> l2 = new ArrayDeque<Integer>();

        l2.add(18);
        l2.add(23);
        l2.add(34);
        System.out.println(l2.getFirst());
        System.out.println(l2.getLast());
        l2.addFirst(5);
        l2.addLast(6);
        l2.removeFirst();
        l2.removeLast();

        l1.add(2);                      // Adds element from 0th index in Ascending order
        l1.add(6);
        l1.add(4);
        l1.add(2);
//        l1.add(1, 5);                      // Adds element to specified position
//        l1.remove(2);                      // Removes the element at given index
//        l1.set(2, 34);                     // Replaces the element at given index to updated element
//        l1.clear();                        // Empties/Clears the array
//        l1.addAll(l2);                     // Adds specified collection in the end
//        l1.addAll(0, l2);                  // Adds specified collection in the specified position
//        l1.removeAll(l2);                  // Removes given specified collection
//        l1.isEmpty();                      // Updates the Capacity of existing specified collection
        l1.addLast(634);                   // Adds element to the last of list
        l1.addFirst(122);                  // Adds element to the First of list
        System.out.println(l1.isEmpty());     // Returns true if the specified collection is empty , if not then returns false
        System.out.println(l1.contains(33));  // Returns true if the element is present in the array else returns false

    }
}
