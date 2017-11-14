package arrayClassesPackage;

public class PatientArray {

	public Patient[] myPatients = new Patient[2];

	public void buildArray() {

		myPatients[0] = new Patient();
		myPatients[0].setBreed(null);
		myPatients[0].setGender(null);
		myPatients[0].setSymptoms(null);
		myPatients[0].setAge(null);
		System.out.println("");
		myPatients[1] = new Patient();
		myPatients[1].setBreed(null);
		myPatients[1].setGender(null);
		myPatients[1].setSymptoms(null);
		myPatients[1].setAge(null);
		System.out.println("");
		// myPatients[1] = new Patient();
		// myPatients[1].setBreed(null);
		// myPatients[1].setGender(null);
		// myPatients[1].setSymptoms(null);
		System.out.println("");
		// myPatients[2] = new Patient();
		// myPatients[2].setBreed(null);
		// myPatients[2].setGender(null);
		// myPatients[2].setSymptoms(null);
		System.out.println("");

	}

	public void showArray() {
		for (int s = 0; s < myPatients.length; s++) {
			System.out.println("Breed: " + myPatients[s].getBreed());
			System.out.println("Gender: " + myPatients[s].getGender());
			System.out.println("Symptoms: " + myPatients[s].getSymptoms());
			System.out.println("Age: " + myPatients[s].getAge());
			System.out.println("");
		}

	}

}
