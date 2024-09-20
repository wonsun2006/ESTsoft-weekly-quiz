package data_structure_quiz;

public class BusinessContact extends Contact{
	private final String company;

	public BusinessContact(String name, String phoneNumber, String company) {
		super(name, phoneNumber);
		this.company = company;
	}

	@Override
	public String toString() {
		return super.toString() + ", 회사: " + company;
	}
}
