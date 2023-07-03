
package assignment;

import data.CompanyManagement;
import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        
        int choice = 0;
        CompanyManagement arr = new CompanyManagement();
        Scanner sc = new Scanner(System.in);
        do {
            printMenu();
            try {
                System.out.print("Your choice: ");
                choice = Integer.parseInt(sc.nextLine());
                
            } catch (Exception e) {
                System.out.println("Please input an integer");   
            }
            
            switch (choice) {
                case 1:
                    
                    break;
                case 2:
                    break;
                    
                case 3:
                    break;
                  
                case 4:
                    break;
                    
                 case 5:
                    break;
                    
                case 6:
                    break;
                    
                case 7:
                    break;
                    
                case 8:
                    System.out.println("See you later");
                    break;
                    
                default:
                    System.out.println("Input from 1 - 8");
            }
            
        } while(choice != 8);
    }
    
    public static void printMenu() {
        System.out.println("COMPANY MANAGEMENT");
        System.out.println("1. Read all Employees and print to screen");
        System.out.println("2. Show staff proficient in a Programming Language");
        System.out.println("3. Show Tester has a height salary");
        System.out.println("4. Show Employee’s higest salary");
        System.out.println("5. Show Leader of the Team has most Employees");
        System.out.println("6. Sort Employees as descending salary");
        System.out.println("7. Write file");
        System.out.println("8. Quit");
    }
    
    public static class NumberOutOfRangeException extends Exception {
        
        public NumberOutOfRangeException(String string) {
            super(string);
        }

    }
}
