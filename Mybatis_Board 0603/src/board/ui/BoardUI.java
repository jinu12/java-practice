package board.ui;

import java.util.ArrayList;
import java.util.Scanner;

import board.mgr.BoardManager;
import board.vo.Board;

/**
 * 게시판 프로그램의 사용자 화면
 */
public class BoardUI {
	private BoardManager mgr = new BoardManager();
	private Scanner sc = new Scanner(System.in); 	//키보드로부터 입력받기 위한 클래스의 객체
	
	/**
	 * 생성자. 메뉴화면을 띄우고 사용자의 입력을 받는다.
	 * */
	public BoardUI() {
		boolean run = true;
		
		while(run) {
			//메인 메뉴 출력하는 메소드를 호출
			printMainMenu();
			int menu = 0;
			try {
				menu = sc.nextInt();
			}catch (Exception e) {
				System.out.println("메뉴는 정수로만 입력해 주세요");
				sc.nextLine();
				continue;
			}
			
			switch (menu) {
				case 1:
					//글쓰기 메소드 호출
					insert();
					break;
				case 2:
					//전체 글 목록 메소드 호출
					list();
					break;
				case 3:
					read();
					break;
				case 4:
					delete();
					break;
				case 5:
					search();
					break;
				case 0:
					run = false;
					sc.close();
					break;
			}
			
		}
		
	}
	

	
	/**
	 * 메인 메뉴를 출력한다.
	 * */
	public void printMainMenu(){
		System.out.println("===================");
		System.out.println("1. 글쓰기");
		System.out.println("2. 전체 글 목록");
		System.out.println("3. 글 1개 읽기");
		System.out.println("4. 글 1개 삭제");
		System.out.println("5. 검색");
		System.out.println("0. 종료");
		System.out.println("===================");
		System.out.print("메뉴 번호 : ");
	}
	
	/**
	 * 글쓰기
	 */
	void insert() {
		sc.nextLine();
		
		String name,title,content;
		System.out.println(" [ 글 쓰기 ] ");
		System.out.print("작성자 : ");
		name = sc.nextLine();
		System.out.print("글제목 : ");
		title = sc.nextLine();
		System.out.print("글내용 : ");
		content = sc.nextLine();
		
		Board board = new Board();
		board.setName(name);
		board.setTitle(title);
		board.setContent(content);
		
		boolean check = mgr.insertBoard(board);
		
		if(check) {
			System.out.println("글쓰기 성공");
		}else {
			System.out.println("글쓰기 실패");
		}
		
	}
	
	/**
	 * 전체 글 목록
	 */
	void list() {
		System.out.println(" [ 전체 글 목록 ] ");
		ArrayList<Board> list = mgr.listBoard();
		
		if(list.isEmpty()) {
			System.out.println("작성된 글이 없습니다.");
		}else {
			for(Board b : list) {
				System.out.println("글번호 : "+b.getBoardnum());
				System.out.println("작성자 : "+b.getName());
				System.out.println("글제목 : "+b.getTitle());
				System.out.println("조회수 : "+b.getHits());
				System.out.println("작성일 : "+b.getIndate());
				System.out.println();
			}
		}
		
	}
	
	void read() {
		sc.nextLine();
		System.out.println("[ 글 1개 입력 ]");
		System.out.print("글 번호 입력 : ");
		int num = sc.nextInt();
		Board board = mgr.readBoard(num);
		if(board == null) {
			System.out.println("해당 글은 없습니다.");
		}else {
			System.out.println("글 번호 : " + board.getBoardnum());
			System.out.println("작성자: " + board.getName());
			System.out.println("글 제목 : " + board.getTitle());
			System.out.println("글 내용 : " + board.getContent());
			System.out.println("조회수  : " + board.getHits());
			System.out.println("날짜  : " + board.getIndate());
			System.out.println();
		}
		
		
//		try {
//			Board board = mgr.readBoard(num);
//			System.out.println("글 번호 : " + board.getBoardnum());
//			System.out.println("작성자: " + board.getName());
//			System.out.println("글 제목 : " + board.getTitle());
//			System.out.println("글 내용 : " + board.getContent());
//			System.out.println("조회수  : " + board.getHits());
//			System.out.println("날짜  : " + board.getIndate());
//			System.out.println();
//		} catch (Exception e) {
//			System.out.println("글 번호에 맞는 내용이 없습니다.");
//			sc.nextLine();
//			
//		}
		
	}

	

	/**
	 * 글 1개 삭제
	 */
	void delete() {
		sc.nextLine();
		
		System.out.println("[ 글 쓰기 ] ");
		System.out.print("글 번호 입력 : ");
		int num = sc.nextInt();
		
		boolean check = mgr.deleteBoard(num);
		
		if(check) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
	}
	
	/**
	 * 검색
	 */
//	void search() {
//		sc.nextLine();
//		
//		System.out.println("[ 제목으로 검색 ]");
//		System.out.print("검색할 제목 : ");		
//		String word = sc.nextLine();
//		ArrayList<Board> boards = mgr.searchBoard(word);
//		
//		if(boards.isEmpty()) {
//			System.out.println("글 목록이 없습니다");
//		}else {
//			for( Board b: boards) {
//				System.out.println("글 번호 : " + b.getBoardnum());
//				System.out.println("작성자  : " + b.getName());
//				System.out.println("글 제목 : " + b.getTitle());
//				System.out.println("글 내용 : " + b.getContent());
//				System.out.println("조회수  : " + b.getHits());
//				System.out.println("날짜  : " + b.getIndate());
//				System.out.println();
//				
//			}
//			
//		}
//	}
	
	void search() {
		sc.nextLine();
		
		System.out.println("[ 검색 ]");
		System.out.print("검색할 종류(1:작성자 2.제목3.혼문) : ");	
		int type = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("검색할 내용 : ");
		String word = sc.nextLine();
		
		ArrayList<Board> list = mgr.searchBoard(word,type);
//		
		if(list.isEmpty()) {
			System.out.println("글 목록이 없습니다");
		}else {
			for( Board b: list) {
				System.out.println("글 번호 : " + b.getBoardnum());
				System.out.println("작성자  : " + b.getName());
				System.out.println("글 제목 : " + b.getTitle());
				System.out.println("글 내용 : " + b.getContent());
				System.out.println("조회수  : " + b.getHits());
				System.out.println("날짜  : " + b.getIndate());
				System.out.println();
			}
		}
	}
//	void search() {
//		sc.nextLine();
//		
//		System.out.println("[ 검색 ]");
//		System.out.print("검색할 종류(1:작성자 2.제목3.혼문) : ");	
//		int type = sc.nextInt();
//		
//		sc.nextLine();
//		
//		System.out.println("검색할 내용 : ");
//		String word = sc.nextLine();
//		
//		switch (type) {
//		case 1:
//			ArrayList<Board> list = mgr.searchBoard(word,type);
//			
//			if(list.isEmpty()) {
//				System.out.println("글 목록이 없습니다");
//			}else {
//				for( Board b: list) {
//					System.out.println("글 번호 : " + b.getBoardnum());
//					System.out.println("작성자  : " + b.getName());
//					System.out.println("글 제목 : " + b.getTitle());
//					System.out.println("글 내용 : " + b.getContent());
//					System.out.println("조회수  : " + b.getHits());
//					System.out.println("날짜  : " + b.getIndate());
//					System.out.println();
//				}
//			}
//		case 2:
//			ArrayList<Board> list2 = mgr.searchBoard2(word,type);
//			
//			if(list2.isEmpty()) {
//				System.out.println("글 목록이 없습니다");
//			}else {
//				for( Board b: list2) {
//					System.out.println("글 번호 : " + b.getBoardnum());
//					System.out.println("작성자  : " + b.getName());
//					System.out.println("글 제목 : " + b.getTitle());
//					System.out.println("글 내용 : " + b.getContent());
//					System.out.println("조회수  : " + b.getHits());
//					System.out.println("날짜  : " + b.getIndate());
//					System.out.println();
//				}
//			}
//			break;
//		case 3:
//			ArrayList<Board> list3 = mgr.searchBoard3(word,type);
//			
//			if(list3.isEmpty()) {
//				System.out.println("글 목록이 없습니다");
//			}else {
//				for( Board b: list3) {
//					System.out.println("글 번호 : " + b.getBoardnum());
//					System.out.println("작성자  : " + b.getName());
//					System.out.println("글 제목 : " + b.getTitle());
//					System.out.println("글 내용 : " + b.getContent());
//					System.out.println("조회수  : " + b.getHits());
//					System.out.println("날짜  : " + b.getIndate());
//					System.out.println();
//				}
//			}
//			break;
//
//		default:
//			break;
//		}
//		ArrayList<Board> list = mgr.searchBoard(word,type);
//		
//		if(list.isEmpty()) {
//			System.out.println("글 목록이 없습니다");
//		}else {
//			for( Board b: list) {
//				System.out.println("글 번호 : " + b.getBoardnum());
//				System.out.println("작성자  : " + b.getName());
//				System.out.println("글 제목 : " + b.getTitle());
//				System.out.println("글 내용 : " + b.getContent());
//				System.out.println("조회수  : " + b.getHits());
//				System.out.println("날짜  : " + b.getIndate());
//				System.out.println();
//				
//			}
//			
//		}
	

}
