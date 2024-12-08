/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author alecn
 */
import java.util.Scanner;

public class ArrayTasks {

    public static void main(String[] args) {
        // Sum and Average of an Array
        try (Scanner scanner = new Scanner(System.in)) {
            // Sum and Average of an Array
            int[] intArray = new int[10];
            System.out.println("Enter 10 integers for the array:");
            int sum = 0;
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = scanner.nextInt();
                sum += intArray[i];
            }
            double average = (double) sum / intArray.length;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            
            // Maximum and Minimum Element Finder
            System.out.println("Enter 15 integers for the array:");
            int[] intArray15 = new int[15];
            for (int i = 0; i < intArray15.length; i++) {
                intArray15[i] = scanner.nextInt();
            }
            int max = intArray15[0];
            int min = intArray15[0];
            for (int num : intArray15) {
                if (num > max) max = num;
                if (num < min) min = num;
            }
            System.out.println("Maximum element: " + max);
            System.out.println("Minimum element: " + min);
            
            // Reverse an Array
            float[] floatArray = new float[5];
            System.out.println("Enter 5 floating-point numbers for the array:");
            for (int i = 0; i < floatArray.length; i++) {
                floatArray[i] = scanner.nextFloat();
            }
            System.out.println("Array in reverse order:");
            for (int i = floatArray.length - 1; i >= 0; i--) {
                System.out.print(floatArray[i] + " ");
            }
            System.out.println();
            
            // Frequency Counter
            int[] freqArray = new int[10];
            System.out.println("Enter 10 integers between 1 and 100 for the array:");
            for (int i = 0; i < freqArray.length; i++) {
                freqArray[i] = scanner.nextInt();
            }
            System.out.print("Enter a number to check its frequency: ");
            int checkNumber = scanner.nextInt();
            int frequency = 0;
            for (int num : freqArray) {
                if (num == checkNumber) frequency++;
            }
            System.out.println("The number " + checkNumber + " appears " + frequency + " times.");
        }
    }
}
