package arrayClassesPackage;

import javax.swing.JOptionPane;

public class Patient {
	//private String breed;
	//private String gender;
	//private int age;
	//private String symptoms;

	public String getBreed() {
		String breed = JOptionPane.showInputDialog("What is the breed of your pet?");
		return breed;
	}

	public String getGender() {
		String gender = JOptionPane.showInputDialog("What is the gender of your pet?");
		return gender;
	}
	
	
	public String getSymptoms() {
		String symptoms = JOptionPane.showInputDialog("What are your pet's symptoms today?");
		return symptoms;
	}

	// public void setSymptoms(String symptoms) {
	// this.symptoms = symptoms;
	// }
}
