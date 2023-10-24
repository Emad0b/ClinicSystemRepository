package finalAssignment_DesingPatterns2;

import java.util.ArrayList;
import java.util.HashMap;

public class Patient {
	private String name;
	private String address;
	private String nationalNumber;
	private String contactNumber;
    private double fees;
    private PatientBehavior behavior;
	static HashMap<Patient,String>medicines= new HashMap<>();
    static HashMap<Patient,String> treatmentDescription = new HashMap<>();
    static ArrayList<Appointments> appointmentsList = new ArrayList<>();

    public Patient(String name, String address, String nationalNumber, String contactNumber, PatientBehavior behavior) {
        this.name = name;
        this.address = address;
        this.nationalNumber = nationalNumber;
        this.contactNumber = contactNumber;
        this.behavior = behavior;
        this.fees = 30.0; // Default fees
    }
    public PatientBehavior getPatientBehavior() {
        return behavior;
    }
    public ArrayList<Appointments> getAppointmentList() {
        return appointmentsList;
    }
    public double calculateTotalFees() {
        double discount = behavior.calculateDiscount();
        return fees - (fees * discount);
    }

    public String getType() {
        return behavior.getType();
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNationalNumber() {
		return nationalNumber;
	}
	public void setNationalNumber(String nationalNumber) {
		this.nationalNumber = nationalNumber;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
    public void addMedicine(Patient p,String medicine) {
        medicines.put(p,medicine);
    }    
	public String getMedicine(Patient p) {
		return medicines.get(p);
	}
	public  void setTreatmentDescription(Patient p,String description) {
		treatmentDescription.put(p, description);
	}

	public String getTreatmentDescription(Patient p) {
		return treatmentDescription.get(p);
	}


}
