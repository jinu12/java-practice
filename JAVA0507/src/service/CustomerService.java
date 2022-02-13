package service;

import java.util.ArrayList;
import java.util.Scanner;

import vo.Customer;

// ȸ�� �������α׷��� ����� ����ϴ� Ŭ����
public class CustomerService {
	
	//�ʵ� (��� ȸ���� ������ ���� �� �� �ִ� ����Ʈ ��ü)
	private ArrayList<Customer> cList = new ArrayList<Customer>();
	
	
	//�Է��� �ޱ� ���� ����� ��ĳ�� ��ü
	private Scanner sc = new Scanner(System.in);
	
	public CustomerService() {
		boolean run = true;
		
		while(run) {
			//�޴��޴��� ���
			printMenu();
			//�޴���ȣ�� �Է�
			int menu = sc.nextInt();
			//�޴���ȣ�� ���� ����� ����
			switch (menu) {
			case 1:
				//������ ������ �Է¹��� ���
				Customer c = reservation();
				
				//�ߺ� ��ȭ��ȣ �˻� ( null or ������ �ְų� )
				Customer result = search(c.getPhone());
				
				if(result == null) {
					cList.add(c);
					System.out.println("���� �Ǿ����ϴ�.");
				} else {
					System.out.println("�̹� ����� ������ �ֽ��ϴ�.");
				}
				//������ ���ٰ��� ������ �˻��ϴ� ��� �߰�
				//���� �Ϸ�
				break;
			case 2:
				sc.nextLine();
				System.out.println("��ȸ ��ȣ �Է� : ");
				String searchPhone = sc.nextLine();
				Customer searchResult = search(searchPhone);
				if(searchResult == null) {
					System.out.println("����� ������ �����ϴ�.");
				} else {
					System.out.println(searchResult);
				}
				//��ȸ���
				break;
			case 3:
				for(int i=0;i<cList.size();i++) {
					
					System.out.println("======================");
					System.out.println(cList.get(i)); 
				}
				//��ü��±��
				break;
				
			case 4:
				sc.nextLine();
				System.out.println("���� ��ȣ �Է� : ");
				String Phone = sc.nextLine();
				Customer search = search(Phone);
				if(search == null) {
					System.out.println("������ ������ �����ϴ�.");
				} else {
					Customer deletephone = delete(Phone);
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				}
				//�������
				break;
			case 5:
				
				sc.nextLine();
				System.out.println("������ ��ȣ �Է� : ");
				String PhoneNumber = sc.nextLine();
				Customer searchnumber = search(PhoneNumber);
				if(searchnumber == null) {
					System.out.println("������ ������ �����ϴ�.");
				} else {
					Customer deletephone = delete(PhoneNumber);
					sc.nextLine();
					Customer update = update();
					cList.add(update);
//					Customer updeatephone = update2(PhoneNumber);
					System.out.println("�����Ǿ����ϴ�.");
				}
				//�������
				break;
					
			case 0:
				run = false;
				System.out.println("���α׷� ����");
				sc.close();
				//������
				break;

			default:
				break;
			}
		}
	}

	//ȭ�鿡 ���θ޴��� ����ϴ� ���
	private void printMenu() {

		System.out.println("===================");
		System.out.println("1.����");
		System.out.println("2.��ȸ");
		System.out.println("3.��ü���");
		System.out.println("4.����");		
		System.out.println("5.����");		
		System.out.println("0.����");
		System.out.println("===================");
		System.out.print("�޴� �Է�> ");
		
	}
	
	//������ �޼ҵ�
	private Customer reservation() {
		sc.nextLine();
		System.out.println(" [ ���� ] ");
		System.out.print("�̸�:");
		String name = sc.nextLine();
		System.out.println("��ȭ��ȣ :");
		String phone = sc.nextLine();
		System.out.println("����ȣ");
		String carNum = sc.nextLine();
		System.out.println("��ġ ");
		String place = sc.nextLine();
		
		Customer c = new Customer(name,phone,carNum,place);
		return c;
	}
	
	//��ȸ ���
	/*
	 * �̹� ����� ȸ������ ���� �߿��� ( cList )
	 * ���� �Էµ� ȸ���� ���� �� ( c )
	 * ���� ��ȭ��ȣ�� �ִٸ� ( equals )
	 * ����� ȸ���� ������ ��ȯ�ϰ�
	 * �׷��� �ʴٸ� null�� ��ȯ�Ѵ�. 
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
				//���� ��ȭ��ȣ�� �ִ�.
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
				//���� ��ȭ��ȣ�� �ִ�.
				result = cList.remove(i);
				break;
			}
			
		}
		return result;
	}
	
	private Customer update() {
		
		Customer result = null;
		
		sc.nextLine();
		System.out.println(" [ ���� ] ");
		System.out.print("�̸�:");
		String name = sc.nextLine();
		System.out.println("��ȭ��ȣ :");
		String phone = sc.nextLine();
		System.out.println("����ȣ");
		String carNum = sc.nextLine();
		System.out.println("��ġ ");
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
