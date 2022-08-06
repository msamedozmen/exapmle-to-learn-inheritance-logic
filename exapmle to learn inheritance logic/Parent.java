
public class Parent extends Person {

	protected Kid[] kids = new Kid[10];
	protected int numberOfKids;

	public Kid[] getKids() {
		return kids;
	}

	public void setKids(Kid[] kids) {
		this.kids = kids;
	}

	public int getNumberOfKids() {
		return numberOfKids;
	}

	public void setNumberOfKids(int numberOfKids) {
		this.numberOfKids = numberOfKids;
	}

	public Parent(String name, String lastName, int age, String hESCode, Kid[] kids, int numberOfKids) {
		super(name, lastName, age, hESCode);
		this.kids = kids;
		this.numberOfKids = numberOfKids;
	}

	public Parent() {
		super();
	}

}
