package finalAssignment_DesingPatterns2;

public class StudentPatientBehavior implements PatientBehavior {
    private final String type = "student";
	@Override
	public double calculateDiscount() {
		// TODO Auto-generated method stub
        return 0.5; // 50% discount for dentist students
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

}
