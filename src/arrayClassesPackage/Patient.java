package arrayClassesPackage;

import java.util.Scanner;

public class Patient {
	Scanner answer = new Scanner(System.in);
	private String breed;
	private String gender;
	private String age;
	private String symptoms;

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		System.out.println("What is the breed of your pet?");
		breed = answer.nextLine();
		this.breed = breed;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		System.out.println("What is the gender of your pet?");
		gender = answer.nextLine();
		this.gender = gender;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		System.out.println("What are the symptoms of your pet?");
		symptoms = answer.nextLine();
		this.symptoms = symptoms;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		System.out.println("How old is your pet?");
		age = answer.nextLine();
		this.age = age;
	}

}
