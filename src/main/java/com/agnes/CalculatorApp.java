package com.agnes;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            //i wish to display the menu for the operations so the users can know the different operations they can perform with the calculator.
            System.out.println(" 1. Addition");
            System.out.println(" 2. Subtraction");
            System.out.println(" 3. Multiplication");
            System.out.println(" 4. Division");
            System.out.println(" 5. Exit");
            System.out.println("Select an operation: ");

            int choice = scanner.nextInt();

            // i needed to validate the int choice because testing the calculator, i realised there was an inout issue and users might get wrong results.
            if (choice < 1 || choice > 5) {
                System.out.println("Invalid number. Please enter a number between 1 and 4");
                continue;
            }

            if (choice == 5) {
                System.out.println("Finished, Goodbye!");
                break;
            }

            System.out.println("How many numbers do you want to calculate?");
            int count = scanner.nextInt();

            double[] numbers = new double[count];

            System.out.println("Enter the numbers: ");
            for (int i = 0; i < count; i++) {
                numbers[i] = scanner.nextDouble();
            }
            double result = numbers[0];

            switch (choice) {
                case 1:
                    for (int i = 1; i < count; i++) {
                        result += numbers[i];
                    }
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    for (int i = 1; i < count; i++) {
                        result -= numbers[i];
                    }
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    for (int i = 1; i < count; i++) {
                        result *= numbers[i];
                    }
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    for (int i = 1; i < count; i++) {
                        if (numbers[i] == 0) {
                            System.out.println("Error! Division by zero.");
                            return;
                        }
                        result /= numbers[i];
                    }
                    System.out.println("Result: " + result);
                    break;

                default:
                    System.out.println("Wrong choice! Please try again.");
            }

            System.out.println("Do you wish to perform another calculation? (yes/no)");
            String anotherCalculation = scanner.next();
            if (anotherCalculation.equalsIgnoreCase("no")) {
                System.out.println("Finished, Goodbye!");
                break;
            }
        }
        scanner.close();
    }
}



