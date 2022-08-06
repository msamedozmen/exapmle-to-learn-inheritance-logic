
public class Elderly extends Person {

	protected boolean isVaccinated;

	public boolean isVaccinated() {
		return isVaccinated;
	}

	public void setVaccinated(boolean isVaccinated) {
		this.isVaccinated = isVaccinated;
	}

	public Elderly(String name, String lastName, int age, String hESCode) {
		super(name, lastName, age, hESCode);

	}

	public Elderly() {
	}

}
