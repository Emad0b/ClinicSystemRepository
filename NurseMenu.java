package finalAssignment_DesingPatterns2;

import java.util.ArrayList;
import java.util.Scanner;

public class NurseMenu extends Nurse implements Menu {

	@Override
	public void menu(Scanner sc) {
		// TODO Auto-generated method stub
		ArrayList<Patient>patient=Reciptionist.patientsList;

		generateReport(patient);

	}

}
