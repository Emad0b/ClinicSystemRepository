package finalAssignment_DesingPatterns2;

import java.util.ArrayList;

public class MenuFactory {
	ArrayList<Patient>patientList;
	public Menu getMenu(String job) {
		if(job.equals("doctor")) {
			patientList=new ArrayList<>();
			return new DoctorMenu();
		}else if(job.equals("reciptionist")) {
			return new ReciptionistMenu();
		}else if(job.equals("nurse")) {
			return new NurseMenu();
		}

		return null;
}
}