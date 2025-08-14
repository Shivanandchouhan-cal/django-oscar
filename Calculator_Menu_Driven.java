import java.util.Scanner;
 
public class Calculator_Menu_Driven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        double num1, num2, result;
 
        do {

            // Menu

            System.out.println("\n=== Calculator Menu ===");

            System.out.println("1. Addition");

            System.out.println("2. Subtraction");

            System.out.println("3. Multiplication");

            System.out.println("4. Division");

            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
 
            switch (choice) {

                case 1:

                    System.out.print("Enter first number: ");

                    num1 = sc.nextDouble();

                    System.out.print("Enter second number: ");

                    num2 = sc.nextDouble();

                    result = num1 + num2;

                    System.out.println("Result = " + result);

                    break;
 
                case 2:

                    
                    break;
 
                case 3:

                    

                    break;
 
                case 4:

                    

                    break;
 
                case 5:

                    System.out.println("Exiting Calculator. Goodbye!");

                    break;
 
                default:

                    System.out.println("Invalid choice! Please try again.");

            }

        } while (choice != 5);
 
        sc.close();

    }

}

 