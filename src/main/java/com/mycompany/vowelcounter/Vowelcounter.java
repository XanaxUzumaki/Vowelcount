/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowelcounter;

/**
 *
 * @author RC_Student_lab
 */
public class Vowelcounter {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    // Function to count the number of vowels in the given string
    public static int countVowels(String sentence) {
        // Convert the string to lowercase to handle case insensitivity
        sentence = sentence.toLowerCase();
        
        // Define a string containing all vowels
        String vowels = "aeiou";
        
        // Initialize a counter for vowels
        int vowelCount = 0;
        
        // Iterate through each character in the input string
        for (int i = 0; i < sentence.length(); i++) {
            // Get the current character
            char currentChar = sentence.charAt(i);
            
            // Check if the current character is a vowel
            if (vowels.indexOf(currentChar) != -1) {
                // If it's a vowel, increment the counter
                vowelCount++;
            }
        }
        
        // Return the total count of vowels
        return vowelCount;
    }

    {
        // Create a Scanner object for user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Call the countVowels function and display the result
        int numberOfVowels = countVowels(input);
        System.out.println("Number of vowels: " + numberOfVowels);
    }
}