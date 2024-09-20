package data_structure_quiz;

public class Contact {
	private final String name;
	private final String phoneNumber;

	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName(){
		return name;
	}

	@Override
	public String toString() {
		return "이름: " + name + ", 전화번호: " + phoneNumber;
	}
}
