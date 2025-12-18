import java.io.*;
import java.util.*;

public class MathMethods {
//TODO: Finish all the methods tests to make sure your code is working correctly.
    public static void main (String[] args) throws FileNotFoundException {
        // A file named "Numbers.txt" is provided to you. It contains a series of positive integers separated by spaces
        // TODO: Create a scanner to read the "Numbers.txt" file
        // TODO: Complete the code in each method below to compute the minimum, maximum, and mean.
        // TODO: Call each method once and print the values. Make sure that the correct values are output.
            // You can reference the Numbers.txt file in this folder

        // Make sure you have assertions enabled, otherwise this part will crash
        System.out.println("Expected: 1  Actual: " + minimum( /*finnish passing in scanner */));
        assert (minimum(/*finnish passing in scanner */) == 1);
        System.out.println("Expected: 67  Actual: " + maximum( /*finnish passing in scanner */)); // Should return 67
        assert (maximum(/*finnish passing in scanner */) == 67);
        System.out.println("Expected: 18.5  Actual: " + mean( /*finnish passing in scanner */)); // Should return 18.5
        assert (mean(/*finnish passing in scanner */) == 18.5);
    }

// HINT: You may want to use while loops for the following methods

    // Reads a set of integers from a file using Scanner and returns the minimum of the set
    // e.g. if Scanner is reading a text file that contains “1 2 7 5 2 9 10 2” it should return 1
    public static int minimum(Scanner scan) {
        // TODO: Write code to read all the numbers using the scanner and find the minimum of the set

        // TODO: Replace the 0 in the return statement with the minimum value from the text file
        return 0;
    }

    // Reads a set of integers from a file using Scanner and returns the maximum of the set
    // e.g. if Scanner is reading a text file that contains “1 2 7 5 2 9 10 2” it should return 10
    public static int maximum(Scanner scan) {
        // TODO: Write code to read all the numbers using the scanner and find the maximum of the set

        // TODO: Update the return statement to return the maximum integer instead of 0
        return 0;
    }

    // Reads a set of integers from a file using Scanner and returns the mean of the set
    // e.g. if Scanner is reading a text file that contains “1 2 7 5 2 9 10 2” it should return 4.75
    public static double mean(Scanner scan) {
        // TODO: Write code to read all the numbers using the scanner and find the mean of the set

        // TODO: Update the return statement to return the mean integer instead of 0
        return 0.0;
    }
}