package user.ui;

import java.util.ArrayList;
import java.util.Scanner;

import user.dao.UserDAO;
import user.vo.UserVO;

public class UserUi {

	private Scanner sc = new Scanner(System.in);
	private UserDAO dao = new UserDAO();

	public UserUi() {

		boolean run = true;

		while (run) {
			System.out.println("=====================");
			System.out.println("1. ȸ�� ����");
			System.out.println("2. ȸ�� ���");
			System.out.println("3. ȸ�� Ż��");
			System.out.println("4. �̸����� ȸ�� �˻�");
			System.out.println("0. ����");
			System.out.println("=====================");
			System.out.print("��ȣ �Է� >");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				sc.nextLine();

				System.out.println(" [ ȸ�� ���� ���� : ]");
				System.out.print("�̸�: ");
				String name = sc.nextLine();
				System.out.print("���� : ");
				int age = sc.nextInt();

				UserVO vo = new UserVO();
				vo.setName(name);
				vo.setAge(age);

				int cnt = dao.insertUser(vo);

				if (cnt > 0) {
					System.out.println("ȸ������ ����");
				} else {
					System.out.println("ȸ������ ����");
				}
				System.out.println("�Է� Ƚ�� : ");
				break;
			case 2:
				System.out.println(" [ ��ü ȸ�� ����  ]");
				ArrayList<UserVO> list = dao.selectUser();
				if (list.isEmpty()) {
					System.out.println("������ ȸ���� �����ϴ�.");
				} else {
					for (int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i));
					}
				}
				break;
			case 3:
				System.out.println(" [ Ż�� ȸ�� ����  ]");
				System.out.print("Ż�� ��ȣ: ");
				int deleteNum = sc.nextInt();

				int deletecnt = dao.deleteUser(deleteNum);
				
				  if(deletecnt > 0) { 
					  System.out.println("ȸ�� ���� ���� ����"); 
				  }else {
					  System.out.println("ȸ�� ���� ���� ����"); 
				  }
				 
				break;
			case 4:
				System.out.println(" [ ȸ�� ���� �˻�  ]");
				System.out.print("�˻��� �̸�: ");
				String names = sc.nextLine();

				ArrayList<UserVO> searchlist = dao.selectUserName(names);
				
				if (searchlist.isEmpty()) {
					System.out.println("������ ȸ���� �����ϴ�.");
				} else {
					// :�� �������� ������ -> �ݺ��� �� �ڷᱸ�� ��ü��
					// :�� �������� ���� -> ������ ��ü���� �ϳ��� �����͸� ���������� �ڷ����� ������
					for (UserVO user : searchlist) {
						System.out.println(user);
					}
				}
				 
				break;
			case 0:
				System.out.println("���α׷� ����");
				sc.close();
				run = false;
				break;

			default:
				break;
			}
		}
	}

}
