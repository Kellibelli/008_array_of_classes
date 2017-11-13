package arrayClassesPackage;

public class StudentArray {

	public Student[] myStudents = new Student[3];
	

	public void buildArray() {
		
		myStudents[0] = new Student();
		myStudents[0].setFname("Tyler");
		myStudents[0].setLname("Smith");
		myStudents[0].setYearInSchool(11);
		
		
		
		myStudents[1] = new Student();
		myStudents[1].setFname("Sam");
		myStudents[1].setLname("Sinclair");
		myStudents[1].setYearInSchool(12);
		
		myStudents[2] = new Student();
		myStudents[2].setFname("Bobby");
		myStudents[2].setLname("Singer");
		myStudents[2].setYearInSchool(10);

	}


	public void showArray() {
		for (int s = 0; s < myStudents.length; s++) {
			System.out.println("First Name: " + myStudents[s].getFname());
			System.out.println("Last Name: " + myStudents[s].getLname());
			System.out.println("Yr in School: " + myStudents[s].getYearInSchool());
			System.out.println("");
		}
		
		
	}

	

}
