package data_structure_quiz;

import java.util.List;
import java.util.Scanner;

public class ContactProgram {
	public static final String mainMenuText =
		"""
			1. 비즈니스 연락처 추가
			2. 개인 연락처 추가
			3. 연락처 출력
			4. 연락처 검색
			5. 종료
			메뉴를 선택해주세요:\s""";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AddressBook addressBook = new AddressBook();

		while(true){
			// 메뉴 선택
			System.out.print(mainMenuText);
			String menu = scanner.nextLine();
			switch(menu){
				case "1": {
					// 비즈니스 연락처 추가
					System.out.print("이름을 입력하세요: ");
					String name = scanner.nextLine();
					System.out.print("전화번호를 입력하세요: ");
					String phoneNumber = scanner.nextLine();
					System.out.print("회사명을 입력하세요: ");
					String company = scanner.nextLine();
					BusinessContact newBusinessContact = new BusinessContact(name,phoneNumber,company);
					addressBook.addContact(newBusinessContact);
					break;
				}
				case "2": {
					// 개인 연락처 추가
					System.out.print("이름을 입력하세요: ");
					String name = scanner.nextLine();
					System.out.print("전화번호를 입력하세요: ");
					String phoneNumber = scanner.nextLine();
					System.out.print("관계를 입력하세요: ");
					String relationship = scanner.nextLine();
					PersonalContact newPersonalContact = new PersonalContact(name,phoneNumber,relationship);
					addressBook.addContact(newPersonalContact);
					break;
				}

				case "3": {
					// 연락처 출력
					addressBook.displayContacts();
					break;
				}
				case "4": {
					// 연락처 검색
					System.out.print("검색할 이름을 입력하세요: ");
					String name = scanner.nextLine();
					List<Contact> result = addressBook.searchContact(name);
					if(result.isEmpty()) {
						System.out.println("연락처를 찾을 수 없습니다.");
					}else{
						for(Contact contact : result){
							System.out.println(contact);
						}
					}
					break;
				}
				case "5": {
					// 종료
					return;
				}
			}
		}
	}
}
