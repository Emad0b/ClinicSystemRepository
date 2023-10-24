package finalAssignment_DesingPatterns2;

import java.time.LocalTime;
import java.util.HashMap;

public class Appointments {
	private Patient patient;
    private LocalTime time;
    static HashMap<Reciptionist,String> appointment= new HashMap<>();

    public Appointments(Patient patient, LocalTime appointmentTime) {
        this.patient = patient;
        this.time = appointmentTime;
    }

    public Patient getPatient() {
        return patient;
    }

    public LocalTime getTime() {
        return time;
    }

    
}


