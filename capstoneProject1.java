import java.util.Scanner;
import java.text.SimpleDateFormat; 
import java.util.Date;


public class capstoneProject1 {

    public static void main(String[] args) {

        Project newProj = new Project("1", "test", "house", "1 boshof", "123", 10000, 0, "07/12/1995");
        People cont = new People("Contractor", "Joe Soap", "0820011010", "joe@soap.com", "34 clifford");
        int userInput = userChoice();

        while (userInput != 0) {
            if (userInput == 1) {
                // get inputs for adding new project
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the project due date (format: dd/mm/yyyy): ");
                String date = scanner.nextLine();
                System.out.println("Enter the project number: ");
                String num = scanner.nextLine();
                System.out.println("Enter the project name: ");
                String name = scanner.nextLine();
                System.out.println("Enter the project type(house, apartment, etc): ");
                String type = scanner.nextLine();
                System.out.println("Enter the project address: ");
                String address = scanner.nextLine();
                System.out.println("Enter the project ERF: ");
                String erf = scanner.nextLine();
                System.out.println("Enter the project fee: ");
                int fee = scanner.nextInt();
                System.out.println("Enter the amount paid to date: ");
                int paid = scanner.nextInt();
                
                System.out.println("\n");

                //create new project object
                Project newProj2 = new Project(num, name, type, address, erf, fee, paid, date);
                System.out.println(newProj2.toString());

                //print completion message
                System.out.println("\nYou entered a project successfully!\n");

                // call for the users input again
                userInput = userChoice();
            }
            // if user wants to update duedate of project
            if (userInput == 2) {

                // get inputs for updating duedate
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the updated due date, format, dd/mm/yyyy: ");
                String newDate = scanner.nextLine();
                newProj.changeDate(newDate);

                //print completion message and updated project info
                System.out.println("\nYou updated the project duedate successfully!\n");
                System.out.println(newProj.toString());

                // call for the users input again
                userInput = userChoice();
            }

            //if user wants to change the payed to date amount
            if (userInput == 3) {

                // get inputs for adding new project
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the amount payed: ");
                int amount = scanner.nextInt();
                
                // call function to chance paid to date
                newProj.changePay(amount);

                // print completion message
                System.out.println("\nYou updated amount payed up to date successfully!\n");
                System.out.println(newProj.toString());

                // call for the users input again
                userInput = userChoice();
            }

            // if user wants to update contractor info
            if (userInput == 4) {

                // get inputs for updating contact info
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the new phone number: ");
                String number = scanner.nextLine();
                System.out.println("Enter the new email: ");
                String email = scanner.nextLine();
                System.out.println("Enter the new address: ");
                String address = scanner.nextLine();
                
                // call method to update contact info
                cont.updateContacts(number, email, address);

                //print completion message
                System.out.println("\nYou updated the contractor details successfully!\n");
                System.out.println(cont.toString());

                // call for the users input again
                userInput = userChoice();
            }

            // method to finalise project
            if (userInput == 5) {

                // create invoce with finalise method
                String invoice = newProj.finalise();

                //print invoice
                System.out.println("\nYou successfully completed the project!\nHere is the invoice:\n");
                System.out.println(invoice);

                // call for the users input again
                userInput = userChoice();
            }
        }
    }

    public static int userChoice() {

        // print message to get user input for what they want to do
        System.out.println("\nWhat would you like to do?\n\nCreate new project\t-\t1");
        System.out.println("Update project duedate\t-\t2");
        System.out.println("Update fee paid to date\t-\t3");
        System.out.println("Update contractor info\t-\t4");
        System.out.println("Finialise project\t-\t5");
        System.out.println("exit\t\t\t-\t0");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        return userInput;
    }
}
