package finalAssignment_DesingPatterns2;

public class OrdinaryPatientBehavior implements PatientBehavior {
    private final String type = "ordinary";

	@Override
	public double calculateDiscount() {
		// TODO Auto-generated method stub
        return 0; // No discount for ordinary patients
     }

	@Override
	public String getType() {
		// TODO Auto-generated method stub
        return type;
	}


}
