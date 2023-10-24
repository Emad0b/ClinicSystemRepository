package finalAssignment_DesingPatterns2;

import java.util.ArrayList;
import java.util.Scanner;

public class RealDoctor implements Doctor {
    private ArrayList<Patient> patients;
    private Scanner sc;
    
	public RealDoctor() {
        this.patients = Reciptionist.patientsList;
        sc = new Scanner(System.in);
	}

	@Override
	public void addMedicineToPatient(String nationalNumber) {
		// TODO Auto-generated method stub
        Patient patient = findPatientByNationalNumber(nationalNumber);
        if (patient != null) {
            System.out.println("Enter Medicine Name and dosage:");
            String medicine = sc.nextLine();
            patient.addMedicine(patient, medicine);
        } else {
            System.out.println("Patient not found.");
        }
	}

	@Override
	public void addTreatmentDescriptionToPatient(String nationalNumber) {
		// TODO Auto-generated method stub
        Patient patient = findPatientByNationalNumber(nationalNumber);
        if (patient != null) {
            System.out.println("Enter Treatment Description:");
            String description = sc.nextLine();
            patient.setTreatmentDescription(patient, description);
        } else {
            System.out.println("Patient not found.");
        }
	}
    private Patient findPatientByNationalNumber(String nationalNumber) {
        for (Patient patient : patients) {
            if (patient.getNationalNumber().equalsIgnoreCase(nationalNumber)) {
                return patient;
            }
        }
        return null;
    }

}
