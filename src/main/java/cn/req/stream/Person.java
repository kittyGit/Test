package cn.req.stream;

public class Person {

	public Person(final String firstName, final String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Person(final String firstName, final int ageValue) {
		this.firstName = firstName;
		age = ageValue;
	}

	public Person(final String firstName, final int ageValue,
			final String nationalityValue) {
		this.firstName = firstName;
		age = ageValue;
		nationality = nationalityValue;
	}

	private String firstName;

	public String getFirstName() {
		return firstName;
	}

	private String lastName;

	public String getLastName() {
		return lastName;
	}

	private int age;

	public int getAge() {
		return age;
	}

	private String nationality;

	public String getNationality() {
		return nationality;
	}

}