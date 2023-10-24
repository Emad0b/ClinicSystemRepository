package finalAssignment_DesingPatterns2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;



public class Reciptionist  {
    static ArrayList<Patient> patientsList;

	public Reciptionist() {
		patientsList = new ArrayList<>();

	} 

	public void  addPatient(Scanner scanner) {
        System.out.println("Enter patient's name:");
        String name = scanner.nextLine();

        System.out.println("Enter patient's address:");
        String address = scanner.nextLine();

        System.out.println("Enter patient's national number:");
        String nationalNumber = scanner.nextLine();

        System.out.println("Enter patient's contact number:");
        String contactNumber = scanner.nextLine();

        System.out.println("Select patient's type:");
        System.out.println("1.Ordinary");
        System.out.println("2.Student");
        System.out.println("3.Consultant");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        PatientBehavior behavior;

        switch (choice) {
            case 1:
                behavior = new OrdinaryPatientBehavior();
                break;
            case 2:
                behavior = new StudentPatientBehavior();
                break;
            case 3:
                behavior = new ConsultantPatientBehavior();
                break;
            default:
                System.out.println("Invalid choice. Setting patient type to ordinary.");
                behavior = new OrdinaryPatientBehavior();
                break;
        }

        Patient patient = new Patient(name, address, nationalNumber, contactNumber, behavior); 
        patientsList.add(patient);
        System.out.println("Patient registered successfully!");

        reserveAppointment(patient.getNationalNumber());
    }
	public void reserveAppointment(String nationalNumber) {
		Patient patient = findPatientByNationalNumber(nationalNumber);
        if (patient == null) {
            System.out.println("Patient not found. Cannot reserve appointment.");
            return;
        }

        LocalTime currentTime = LocalTime.now();
        LocalTime closingTime = LocalTime.of(23, 59);

        if (currentTime.isBefore(closingTime) || currentTime.isAfter(LocalTime.MIDNIGHT)) {
            LocalTime appointmentTime = currentTime.plusMinutes(30);
            if (appointmentTime.isBefore(closingTime) || appointmentTime.isAfter(LocalTime.MIDNIGHT)) {
                String appointmentSlot = getAppointmentSlot(appointmentTime);
                if (appointmentSlot != null) {
                    Appointments appointment = new Appointments(patient, appointmentTime);
                    Patient.appointmentsList.add(appointment);
                    System.out.println("Appointment reserved for " + patient.getName() + " at " + appointmentSlot + ".");
                } else {
                    System.out.println("All appointment slots for today are filled. Please try again tomorrow.");
                }
            } else {
                System.out.println("Appointment reservation is closed for today. Please come back tomorrow.");
            }
        } else {
            System.out.println("Appointment reservation is closed for today. Please come back tomorrow.");
        }
	}
	public static String getAppointmentSlot(LocalTime appointmentTime) {
		if (appointmentTime.isBefore(LocalTime.of(10, 30))) {
			return "10:00 AM - 10:30 AM";
		} else if (appointmentTime.isBefore(LocalTime.of(11, 0))) {
			return "10:30 AM - 11:00 AM";
		} else if (appointmentTime.isBefore(LocalTime.of(11, 30))) {
			return "11:00 AM - 11:30 AM";
		} else if (appointmentTime.isBefore(LocalTime.of(12, 0))) {
			return "11:30 AM - 12:00 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(12, 30))) {
			return "12:00 PM - 12:30 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(13, 0))) {
			return "12:30 PM - 1:00 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(13, 30))) {
			return "1:00 PM - 1:30 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(14, 0))) {
			return "1:30 PM - 2:00 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(14, 30))) {
			return "2:00 PM - 2:30 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(15, 0))) {
			return "2:30 PM - 3:00 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(15, 30))) {
			return "3:00 PM - 3:30 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(16, 0))) {
			return "3:30 PM - 4:00 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(16, 30))) {
			return "4:00 PM - 4:30 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(17, 0))) {
			return "4:30 PM - 5:00 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(17, 30))) {
			return "5:00 PM - 5:30 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(18, 0))) {
			return "5:30 PM - 6:00 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(18, 30))) {
			return "6:00 PM - 6:30 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(19, 0))) {
			return "6:30 PM - 7:00 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(19, 30))) {
			return "7:00 PM - 7:30 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(20, 0))) {
			return "7:30 PM - 8:00 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(20, 30))) {
			return "8:00 PM - 8:30 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(21, 0))) {
			return "8:30 PM - 9:00 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(21, 30))) {
			return "9:00 PM - 9:30 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(22, 0))) {
			return "9:30 PM - 10:00 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(22, 30))) {
			return "10:00 PM - 10:30 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(23, 0))) {
			return "10:30 PM - 11:00 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(23, 30))) {
			return "11:00 PM - 11:30 PM";
		} else if (appointmentTime.isBefore(LocalTime.of(0, 0))) {
			return "11:30 PM - 12:00 AM";
		} else if (appointmentTime.isBefore(LocalTime.of(0, 30))) {
			return "12:00 AM - 12:30 AM";
		}
		return null; 
	}


	
	public void printAppointments() {
		ArrayList<Appointments>appointmentList=Patient.appointmentsList;
		
		for (Appointments appointment : appointmentList) {
			System.out.println("Patient"+appointment.getPatient().getName() + "\t" + "Appointment:"+appointment.getTime().format(DateTimeFormatter.ofPattern("hh:mm a")));
		}
	}

	public double calculateBill(String nationalNumber) {
	    Patient patient = findPatientByNationalNumber(nationalNumber);
	    if (patient != null) {
	        double totalFees = 30.0;
	        double discount = patient.getPatientBehavior().calculateDiscount();

	        double discountAmount = totalFees * discount;
	        return totalFees - discountAmount;
	    }
	    return 0.0;
	}

	public void printBill(String nationalNumber) {
		Patient patient = findPatientByNationalNumber(nationalNumber);
		System.out.println("Dear " + patient.getName() + " your bill amount is:" + calculateBill(nationalNumber)+ " according to have treatment at DCC wish you healthfull");
	}

    public Patient findPatientByNationalNumber(String nationalNumber) {
        for (Patient patient : patientsList) {
            if (patient.getNationalNumber().equals(nationalNumber)) {
                return patient;
            }
        }
        return null;
     }



}
