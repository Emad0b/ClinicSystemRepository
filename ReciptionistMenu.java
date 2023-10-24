package finalAssignment_DesingPatterns2;

import java.util.Scanner;

public class ReciptionistMenu extends Reciptionist implements Menu {

	@Override
	public void menu(Scanner sc) {
		// TODO Auto-generated method stub
        int choice;
        do {
	    System.out.println("Enter 1 to add a patient");
	    System.out.println("Enter 2 to print a bill for a patient");
	    System.out.println("Enter 3 to print appointments");
	    System.out.println("Enter 0 to exit");
	    choice = sc.nextInt();
	    sc.nextLine(); // Consume newline character
	    switch (choice) {
	    case 1:
	    	addPatient(sc);
	    	break;
	    case 2:
	    	System.out.println("Enter Patient National Number:");
	    	printBill(sc.next());
	    	break;
	    case 3:
	    	printAppointments();
	    	break;
	    	case 0:
	    		break;
	    	default:
	    		System.out.println("Invalid choice. Please try again.");
	    		break;
	            }
        }while(choice!=0);
	}

}
