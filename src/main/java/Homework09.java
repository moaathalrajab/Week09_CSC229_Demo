/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class Homework09 {
    
    // Method to generate triangle numbers
    public static int generateTriangleNumber(int n) {
        return n * (n + 1) / 2;
    }
    
    // Method to count the number of divisors for a given number
    public static int countDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                if (number / i == i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int n = 1;
        int triangleNumber;
        int numDivisors;
        
        while (true) {
            triangleNumber = generateTriangleNumber(n);
            numDivisors = countDivisors(triangleNumber);
            
            if (numDivisors > 100) {
                System.out.println("The first triangle number with over one hundred divisors is: " + triangleNumber);
                break;
            }
            
            n++;
        }
    }
}
