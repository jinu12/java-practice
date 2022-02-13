package service;

import java.util.ArrayList;
import java.util.Scanner;

import vo.Customer;

// 회원 예약프로그램의 기능을 담당하는 클래스
public class CustomerService {
	
	//필드 (모든 회원의 정보를 저장 할 수 있는 리스트 객체)
	private ArrayList<Customer> cList = new ArrayList<Customer>();
	
	
	//입력을 받기 위해 사용할 스캐너 객체
	private Scanner sc = new Scanner(System.in);
	
	public CustomerService() {
		boolean run = true;
		
		while(run) {
			//메뉴메뉴를 출력
			printMenu();
			//메뉴번호를 입력
			int menu = sc.nextInt();
			//메뉴번호에 따라서 기능을 실행
			switch (menu) {
			case 1:
				//예약할 정보를 입력받은 기능
				Customer c = reservation();
				
				//중복 전화번호 검사 ( null or 정보가 있거나 )
				Customer result = search(c.getPhone());
				
				if(result == null) {
					cList.add(c);
					System.out.println("예약 되었습니다.");
				} else {
					System.out.println("이미 예약된 정보가 있습니다.");
				}
				//예약을 해줄건지 말건지 검사하는 기능 추가
				//예약 완료
				break;
			case 2:
				sc.nextLine();
				System.out.println("조회 번호 입력 : ");
				String searchPhone = sc.nextLine();
				Customer searchResult = search(searchPhone);
				if(searchResult == null) {
					System.out.println("예약된 정보가 없습니다.");
				} else {
					System.out.println(searchResult);
				}
				//조회기능
				break;
			case 3:
				for(int i=0;i<cList.size();i++) {
					
					System.out.println("======================");
					System.out.println(cList.get(i)); 
				}
				//전체출력기능
				break;
				
			case 4:
				sc.nextLine();
				System.out.println("삭제 번호 입력 : ");
				String Phone = sc.nextLine();
				Customer search = search(Phone);
				if(search == null) {
					System.out.println("삭제할 정보가 없습니다.");
				} else {
					Customer deletephone = delete(Phone);
					System.out.println("삭제가 완료되었습니다.");
				}
				//삭제기능
				break;
			case 5:
				
				sc.nextLine();
				System.out.println("수정할 번호 입력 : ");
				String PhoneNumber = sc.nextLine();
				Customer searchnumber = search(PhoneNumber);
				if(searchnumber == null) {
					System.out.println("수정할 정보가 없습니다.");
				} else {
					Customer deletephone = delete(PhoneNumber);
					sc.nextLine();
					Customer update = update();
					cList.add(update);
//					Customer updeatephone = update2(PhoneNumber);
					System.out.println("수정되었습니다.");
				}
				//수정기능
				break;
					
			case 0:
				run = false;
				System.out.println("프로그램 종료");
				sc.close();
				//종료기능
				break;

			default:
				break;
			}
		}
	}

	//화면에 메인메뉴를 출력하는 기능
	private void printMenu() {

		System.out.println("===================");
		System.out.println("1.예약");
		System.out.println("2.조회");
		System.out.println("3.전체출력");
		System.out.println("4.삭제");		
		System.out.println("5.수정");		
		System.out.println("0.종료");
		System.out.println("===================");
		System.out.print("메뉴 입력> ");
		
	}
	
	//예약기능 메소드
	private Customer reservation() {
		sc.nextLine();
		System.out.println(" [ 예약 ] ");
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.println("전화번호 :");
		String phone = sc.nextLine();
		System.out.println("차번호");
		String carNum = sc.nextLine();
		System.out.println("위치 ");
		String place = sc.nextLine();
		
		Customer c = new Customer(name,phone,carNum,place);
		return c;
	}
	
	//조회 기능
	/*
	 * 이미 예약된 회원들의 정보 중에서 ( cList )
	 * 지금 입력된 회원의 정보 중 ( c )
	 * 같은 전화번호가 있다면 ( equals )
	 * 예약된 회원의 정보를 반환하고
	 * 그렇지 않다면 null을 반환한다. 
	 */
	private Customer search(String phone) {
		
		Customer result = null;
		
		for (int i = 0; i < cList.size(); i++) {
			
//			Customer temp = cList.get(i);
//			String tempPhone = temp.getPhone();
//			
//			if(tempPhone.equals(c.getPhone())) {
//				
//			}
			
			if(cList.get(i).getPhone().equals(phone)) {
				//같은 전화번호가 있다.
				result = cList.get(i);
				break;
			}
			
		}
		return result;
	}
	
	private Customer delete(String phone) {
		
		Customer result = null;
		
		for (int i = 0; i < cList.size(); i++) {
			
//			Customer temp = cList.get(i);
//			String tempPhone = temp.getPhone();
//			
//			if(tempPhone.equals(c.getPhone())) {
//				
//			}
			
			if(cList.get(i).getPhone().equals(phone)) {
				//같은 전화번호가 있다.
				result = cList.remove(i);
				break;
			}
			
		}
		return result;
	}
	
	private Customer update() {
		
		Customer result = null;
		
		sc.nextLine();
		System.out.println(" [ 수정 ] ");
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.println("전화번호 :");
		String phone = sc.nextLine();
		System.out.println("차번호");
		String carNum = sc.nextLine();
		System.out.println("위치 ");
		String place = sc.nextLine();
		
		Customer c = new Customer(name,phone,carNum,place);

		

		return c;
		
	}
	
	private Customer update2(String phone) {
		
		Customer result = null;
		
		
		
		
		for (int i = 0; i < cList.size(); i++) {
			

			
		}
		return result;
		
	}
	

}
