import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		boolean flag = false;
		boolean noflag = false;
		int count = 0;
		Address add [] = new Address[1000]; 
		while(run) {
			System.out.println(" [ �ּҷ� ] ");
			System.out.println("1. �� �ּ� ���");
			System.out.println("2. �ּҷ� ���");
			System.out.println("0. ����");
			System.out.print("��ȣ ���� : ");
			int menu = sc.nextInt();
			switch (menu) {
			case 0:
				run = false;
				sc.close();
				break;
			case 1:
//				private String name;
//				private String group;
//				private String phone;
//				private String addr;
//				private String email;
				sc.nextLine();
				System.out.print("�̸� : ");
				String name = sc.nextLine(); 
				System.out.print("�׷� :");
				String group = sc.nextLine();
				System.out.print("��ȭ��ȣ :");
				String phone = sc.nextLine();
 				System.out.print("�ּ� :");
 				String addr = sc.nextLine();
 				System.out.print("�̸��� :");
 				String email = sc.nextLine();
 				Address ad = new Address();
 				ad.setName(name);
 				ad.setGroup(group);
 				ad.setPhone(phone);
 				ad.setAddr(addr);
 				ad.setEmail(email);
 	 				for(int i=0;i<count;i++) {
 	 					if(add[i].getName().equals(ad.getName())) {
 	 						flag = true;
 	 						System.out.println(flag);
 	 					}
 	 				}
 				if(flag) {
 					System.out.println("[�˸�] �̹� ��ϵ� �̸� �Դϴ�.");
 				}else {
 					noflag = true;
 				}
 				if(noflag) {
 	 				add[count] = ad;
 					count++;
 					System.out.println("[�˸�] ��ϵǾ����ϴ�.");
 				}
 				if(count ==0) {
 	 				add[count] = ad;
 					count++;
 					System.out.println("[�˸�] ��ϵǾ����ϴ�.");
 				}
 				noflag =false;
 				System.out.println(noflag);
				break;
			case 2:
				for(int i=0;i<count;i++) {
					System.out.println("======================");
					System.out.println("�̸� : " + add[i].getName()); 
					System.out.println("�׷� : " + add[i].getGroup());
					System.out.println("��ȭ��ȣ : "+ add[i].getPhone());
	 				System.out.println("�ּ� : "+ add[i].getAddr());
	 				System.out.println("�̸��� : " + add[i].getEmail());
	 				System.out.println("======================");
				}
				
				break;

			default:
				System.out.println("��Ȯ�� ���ڸ� �Է����ּ���.");
				break;
			}
		}
	}

}
