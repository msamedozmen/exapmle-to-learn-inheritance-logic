
public class Person {

	protected String name;
	protected String lastName;
	protected int age;
	protected String HESCode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHESCode() {
		return HESCode;
	}

	public void setHESCode(String hESCode) {
		HESCode = hESCode;
	}

	public Person(String name, String lastName, int age, String hESCode) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		HESCode = hESCode;
	}

	public Person() {
	}

}
