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
			System.out.println(" [ 주소록 ] ");
			System.out.println("1. 새 주소 등록");
			System.out.println("2. 주소록 출력");
			System.out.println("0. 종료");
			System.out.print("번호 선택 : ");
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
				System.out.print("이름 : ");
				String name = sc.nextLine(); 
				System.out.print("그룹 :");
				String group = sc.nextLine();
				System.out.print("전화번호 :");
				String phone = sc.nextLine();
 				System.out.print("주소 :");
 				String addr = sc.nextLine();
 				System.out.print("이메일 :");
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
 					System.out.println("[알림] 이미 등록된 이름 입니다.");
 				}else {
 					noflag = true;
 				}
 				if(noflag) {
 	 				add[count] = ad;
 					count++;
 					System.out.println("[알림] 등록되었습니다.");
 				}
 				if(count ==0) {
 	 				add[count] = ad;
 					count++;
 					System.out.println("[알림] 등록되었습니다.");
 				}
 				noflag =false;
 				System.out.println(noflag);
				break;
			case 2:
				for(int i=0;i<count;i++) {
					System.out.println("======================");
					System.out.println("이름 : " + add[i].getName()); 
					System.out.println("그룹 : " + add[i].getGroup());
					System.out.println("전화번호 : "+ add[i].getPhone());
	 				System.out.println("주소 : "+ add[i].getAddr());
	 				System.out.println("이메일 : " + add[i].getEmail());
	 				System.out.println("======================");
				}
				
				break;

			default:
				System.out.println("정확한 숫자를 입력해주세요.");
				break;
			}
		}
	}

}
