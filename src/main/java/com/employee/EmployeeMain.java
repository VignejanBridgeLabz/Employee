package com.employee;

import java.util.Scanner;

/**
 * UC2 - Add Part time
 *
 * Requirements:
     *   - Employee & Wage
     *   - Assume Part time Hour is 8
 *
 * @author  VignejanBridgeLabz
 * @version 1.0
 */
public class EmployeeMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee");
        
        System.out.println("\n=== UC2: Add Part time ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Name : "); String firstName = scanner.nextLine();
        System.out.print("Enter Last Name  : "); String lastName  = scanner.nextLine();
        System.out.print("Enter Phone      : "); String phone     = scanner.nextLine();
        System.out.print("Enter Email      : "); String email     = scanner.nextLine();
        System.out.println("Created: " + firstName + " " + lastName);
        scanner.close();
    }
}
