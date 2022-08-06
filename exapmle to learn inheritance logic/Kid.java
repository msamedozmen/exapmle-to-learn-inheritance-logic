
public class Kid extends Person {

	protected String gender;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Kid(String name, String lastName, int age, String hESCode, String gender) {
		super(name, lastName, age, hESCode);
		this.gender = gender;
	}

	public Kid() {
		super();
	}

}
