package finalAssignment_DesingPatterns2;


public class DoctorProxy implements Doctor {
    private Doctor realDoctor;

    public DoctorProxy() {
        this.realDoctor = new RealDoctor();
    }

    public void addMedicineToPatient(String nationalNumber) {
        realDoctor.addMedicineToPatient(nationalNumber);
    }

    public void addTreatmentDescriptionToPatient(String nationalNumber) {
        realDoctor.addTreatmentDescriptionToPatient(nationalNumber);
    }



}