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
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 목록");
			System.out.println("3. 회원 탈퇴");
			System.out.println("4. 이름으로 회원 검색");
			System.out.println("5. 회원 정보 업데이트");
			System.out.println("6. 회원 번호로  회원 조회");
			System.out.println("0. 종료");
			System.out.println("=====================");
			System.out.print("번호 입력 >");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				sc.nextLine();

				System.out.println(" [ 회원 가입 정보 : ]");
				System.out.print("이름: ");
				String name = sc.nextLine();
				System.out.print("나이 : ");
				int age = sc.nextInt();

				UserVO vo = new UserVO();
				vo.setName(name);
				vo.setAge(age);

				int cnt = dao.insertUser(vo);

				if (cnt > 0) {
					System.out.println("회원가입 성공");
				} else {
					System.out.println("회원가입 실퍄");
				}
				System.out.println("입력 횟수 : ");
				break;
			case 2:
				System.out.println(" [ 전체 회원 정보  ]");
				ArrayList<UserVO> list = dao.selectUser();
				if (list.isEmpty()) {
					System.out.println("가입한 회원이 없습니다.");
				} else {
					for (int i = 0; i < list.size(); i++) {
						System.out.println(list.get(i));
					}
				}
				break;
			case 3:
				System.out.println(" [ 탈퇴 회원 정보  ]");
				System.out.print("탈퇴 번호: ");
				int deleteNum = sc.nextInt();

				int deletecnt = dao.deleteUser(deleteNum);
				
				  if(deletecnt > 0) { 
					  System.out.println("회원 정보 삭제 성공"); 
				  }else {
					  System.out.println("회원 정보 삭제 실퍄"); 
				  }
				 
				break;
			case 4:
				sc.nextLine();
				System.out.println(" [ 회원 정보 검색  ]");
				System.out.print("검색할 이름: ");
				String names = sc.nextLine();

				ArrayList<UserVO> searchlist = dao.selectUserName(names);
				
				if (searchlist.isEmpty()) {
					System.out.println("가입한 회원이 없습니다.");
				} else {
					// :을 기준으로 오른쪽 -> 반복을 할 자료구조 객체명
					// :을 기준으로 왼쪽 -> 오른쪽 객체에서 하나씩 데이터를 꺼냈을대의 자료형과 변수명
					for (UserVO user : searchlist) {
						System.out.println(user);
					}
				}
				 
				break;
			case 5:
				sc.nextLine();

				System.out.println(" [ 회원 정보 수정: ]");
				System.out.print("수정할 이름: ");
				String updatename = sc.nextLine();
				System.out.print("수정할 나이 : ");
				int updateAge = sc.nextInt();
				System.out.println("수정할 회원 번호 : ");
				int updateNum = sc.nextInt();
				
				UserVO updateVO = new UserVO();
				updateVO.setNum(updateNum);
				updateVO.setName(updatename);
				updateVO.setAge(updateAge);
				
				int updateCnt = dao.updateUser(updateVO);
				
				if(updateCnt > 0) {
					System.out.println("회원 정보 수정 성공");
				}else {
					System.out.println("회원 정보 수정 실패");
				}
				break;
			case 6:
				System.out.println(" [ 회원 번호 검색  ]");
				System.out.print("검색할 번호: ");
				int findnum = sc.nextInt();

				UserVO findnums = dao.selectByNum(findnum);
				
				System.out.println(findnums);
				break;
			
			case 0:
				System.out.println("프로그램 종료");
				sc.close();
				run = false;
				break;

			default:
				break;
			}
		}
	}

}
