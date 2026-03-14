package com.employee;

import java.util.Scanner;

/**
 * UC1 - Calculate Daily
 *
 * Requirements:
     *   - Employee Wage
     *   - Assume Wage per Hour is 20
     *   - Assume Full Day Hour is 8
 *
 * @author  VignejanBridgeLabz
 * @version 1.0
 */
public class EmployeeMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee");
        
        System.out.println("\n=== UC1: Calculate Daily ===");
        final int WAGE_PER_HOUR   = 20;
        final int FULL_DAY_HOURS  = 8;
        final int PART_TIME_HOURS = 4;
        final int WORKING_DAYS    = 20;
        final int MAX_HOURS       = 100;

        int totalWage = 0, totalHours = 0, day = 0;
        java.util.Random rand = new java.util.Random();

        while (totalHours < MAX_HOURS && day < WORKING_DAYS) {
            int attendance = rand.nextInt(3); // 0=absent,1=full,2=part
            int hoursWorked = (attendance == 1) ? FULL_DAY_HOURS
                            : (attendance == 2) ? PART_TIME_HOURS : 0;
            totalWage  += hoursWorked * WAGE_PER_HOUR;
            totalHours += hoursWorked;
            day++;
        }
        System.out.println("Total Wage: " + totalWage + " | Days: " + day + " | Hours: " + totalHours);
    }
}
