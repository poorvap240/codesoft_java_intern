import java.util.Scanner;

class task3{
    public static void main(String[] args) {
        int balance = 10000;
        int withdraw;
        int deposit;
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("...ATM...");
            System.out.println("Enter 1 if you want to withdraw money");
            System.out.println("Enter 2 if you want to deposit money");
            System.out.println("Enter 3 if you want to check your bank balance");
            System.out.println("Enter 4 if you want to exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1 : {
                    System.out.print("Enter the amount you want to withdraw: ");
                    withdraw = sc.nextInt();
                    
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println();
                }
                case 2 : {
                    System.out.print("Enter the amount you want to deposit: ");
                    deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Your money has been successfully deposited");
                    System.out.println();
                }
                case 3 : {
                    System.out.println("Total Balance = " + balance);
                    System.out.println();
                }
                case 4 : {
                    
                    sc.close(); 
                    System.exit(0);
                }
                default : {
                    System.out.println("Invalid choice. Please enter a valid option.");
                    System.out.println();
                }
            }
        }
    }
}
