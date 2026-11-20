/**
 *  Java program to create, read, update, and delete Stack collection.
 */

package com.collections;

import java.util.Stack;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Stack<Integer> myStack = new Stack<>();

        // Add.
        myStack.add(2);
        myStack.add(5);
        myStack.add(1);
        myStack.add(9);
        myStack.add(3);
        myStack.add(2);

        // Display.
        System.out.println(myStack); // Output: [2, 5, 1, 9, 3, 2]

        // Update.
        myStack.insertElementAt(4, 0);

        // Display.
        System.out.println(myStack); // Output: [4, 2, 5, 1, 9, 3, 2]

        // Clear.
        myStack.clear();

    }
}