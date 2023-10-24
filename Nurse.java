package finalAssignment_DesingPatterns2;

import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Nurse {

	public static void generateReport(ArrayList<Patient> patients) {
        try (FileWriter writer = new FileWriter("C:\\Users\\Emad\\Desktop\\HTU\\Advanced Programming\\Final Assingment\\patient_report.txt")) {
            for (Patient patient : patients) {
                    String report = "Name: " + patient.getName() + "\n";
                    report += "National Number: " + patient.getNationalNumber() + "\n";
                    report += "Medicine and Dosage: " + patient.getMedicine(patient) + "\n";
                    report += "Treatment Description: " + patient.getTreatmentDescription(patient) + "\n";
                    report += "Appointment Time: " + getAppointmentTime(patient) + "\n"; 
                    report+="======================================================================\n";
                    writer.write(report);
            }
            System.out.println("Patient report writtent succesfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
	public static String getAppointmentTime(Patient patient) {
	    ArrayList<Appointments> appointments = Patient.appointmentsList;
	    for (Appointments appointment : appointments) {
	        if (appointment.getPatient().equals(patient)) {
	            return appointment.getTime().format(DateTimeFormatter.ofPattern("hh:mm a"));
	        }
	    }
	    return "Not Scheduled"; // If the patient doesn't have an appointment
	}
}