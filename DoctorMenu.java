package finalAssignment_DesingPatterns2;

import java.util.Scanner;

public class DoctorMenu extends DoctorProxy implements Menu {

	@Override
    public void menu(Scanner sc) {
        int choice;
        do {
            System.out.println("Enter 1 to add a medicine");
            System.out.println("Enter 2 to add a treatment description");
            System.out.println("Enter 0 to exit");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
					try {
						System.out.println("Enter Patient national number:");
	                    addMedicineToPatient(sc.next());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.err.println(e.getMessage());;
					}
                    break;
                case 2:
					try {
						System.out.println("Enter Patient national number:");
	                    addTreatmentDescriptionToPatient(sc.next());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						System.err.println(e.getMessage());;
					}
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }
}