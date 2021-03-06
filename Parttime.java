import java.util.Date;

/* Name: Srinivasa Sai Sandeep Machiraju
   Date: Nov 5, 2016 
   Description:(This class is of abstract form)
   This class has details about full time waiter which extends the waiter class. 
   The full time will have all qualities/functionalities of waiter and has extended feature like hourlySalary
 */

public class Parttime extends Waiter{

	double hourlySalary;

	public Parttime(String sSN, String firstName, String lastName,
			String eStreet, String eCity, String eState, String eZip,
			Date startDate, int yearsOfExperience, String weekelySchedule,
			String tipTotal, double hourlySalary) {
		super(sSN, firstName, lastName, eStreet, eCity, eState, eZip,
				startDate, yearsOfExperience, weekelySchedule, tipTotal);
		this.hourlySalary = hourlySalary;
	}
	
	
	
}
