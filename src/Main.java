// Hello world program

// In Java everything is an object so even main has to be a class
// This means no more stray general utility functions in files like in C++
// Example: A function to get the distance between two vectors in a maths file
// calculateDistance( vector1, vector2); in maths.hpp
// In Java to do the same thing I'd probably need a public maths utility class with public static functions
// Example: Maths.calculateDistance( vector1, vector2);
public class Main {
    public static void main(String[] args) {
        System.out.print("Hello world!");
    }
}