package arrayClassesPackage;

public class BeginHere {

	public static void main(String[] args) {
		
		
		// Learn how to use array of a class
		StudentArray myStudentArray = new StudentArray();
		myStudentArray.buildArray();
		myStudentArray.showArray();
		
		PatientArray myVetArray = new PatientArray();
		myVetArray.buildArray();
		
		/* Graded Assignment
		 * 
		 * 1. (learn arrays - for large data ALWAYS use a database, JDBC Java Data Base Connectivity to, for example MySQL)
		 * 2. You work in a vet's office, you want a check-in tag for the vet and, this is a procedure and billing record
		 * 3. Record:
		 * 01 - Breed (dog(ex: Boxer), cat, horse, parrot)
		 * 02 - Gender (m, f, unknown)
		 * 03 - Age
		 * 04 - symptoms  
		 *	for practice, let's set our array size = 10
		 *
		 *	-- Real time data entry
		 *	-- show all patients for that day
		 */

	}

}
