package finalAssignment_DesingPatterns2;

public class ConsultantPatientBehavior implements PatientBehavior {
    private final String type = "consultant";

	@Override
	public double calculateDiscount() {
		// TODO Auto-generated method stub
        return 0.2; // 20% discount for dental consultants
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

}
