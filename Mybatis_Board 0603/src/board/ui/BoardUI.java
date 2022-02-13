package board.ui;

import java.util.ArrayList;
import java.util.Scanner;

import board.mgr.BoardManager;
import board.vo.Board;

/**
 * �Խ��� ���α׷��� ����� ȭ��
 */
public class BoardUI {
	private BoardManager mgr = new BoardManager();
	private Scanner sc = new Scanner(System.in); 	//Ű����κ��� �Է¹ޱ� ���� Ŭ������ ��ü
	
	/**
	 * ������. �޴�ȭ���� ���� ������� �Է��� �޴´�.
	 * */
	public BoardUI() {
		boolean run = true;
		
		while(run) {
			//���� �޴� ����ϴ� �޼ҵ带 ȣ��
			printMainMenu();
			int menu = 0;
			try {
				menu = sc.nextInt();
			}catch (Exception e) {
				System.out.println("�޴��� �����θ� �Է��� �ּ���");
				sc.nextLine();
				continue;
			}
			
			switch (menu) {
				case 1:
					//�۾��� �޼ҵ� ȣ��
					insert();
					break;
				case 2:
					//��ü �� ��� �޼ҵ� ȣ��
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
	 * ���� �޴��� ����Ѵ�.
	 * */
	public void printMainMenu(){
		System.out.println("===================");
		System.out.println("1. �۾���");
		System.out.println("2. ��ü �� ���");
		System.out.println("3. �� 1�� �б�");
		System.out.println("4. �� 1�� ����");
		System.out.println("5. �˻�");
		System.out.println("0. ����");
		System.out.println("===================");
		System.out.print("�޴� ��ȣ : ");
	}
	
	/**
	 * �۾���
	 */
	void insert() {
		sc.nextLine();
		
		String name,title,content;
		System.out.println(" [ �� ���� ] ");
		System.out.print("�ۼ��� : ");
		name = sc.nextLine();
		System.out.print("������ : ");
		title = sc.nextLine();
		System.out.print("�۳��� : ");
		content = sc.nextLine();
		
		Board board = new Board();
		board.setName(name);
		board.setTitle(title);
		board.setContent(content);
		
		boolean check = mgr.insertBoard(board);
		
		if(check) {
			System.out.println("�۾��� ����");
		}else {
			System.out.println("�۾��� ����");
		}
		
	}
	
	/**
	 * ��ü �� ���
	 */
	void list() {
		System.out.println(" [ ��ü �� ��� ] ");
		ArrayList<Board> list = mgr.listBoard();
		
		if(list.isEmpty()) {
			System.out.println("�ۼ��� ���� �����ϴ�.");
		}else {
			for(Board b : list) {
				System.out.println("�۹�ȣ : "+b.getBoardnum());
				System.out.println("�ۼ��� : "+b.getName());
				System.out.println("������ : "+b.getTitle());
				System.out.println("��ȸ�� : "+b.getHits());
				System.out.println("�ۼ��� : "+b.getIndate());
				System.out.println();
			}
		}
		
	}
	
	void read() {
		sc.nextLine();
		System.out.println("[ �� 1�� �Է� ]");
		System.out.print("�� ��ȣ �Է� : ");
		int num = sc.nextInt();
		Board board = mgr.readBoard(num);
		if(board == null) {
			System.out.println("�ش� ���� �����ϴ�.");
		}else {
			System.out.println("�� ��ȣ : " + board.getBoardnum());
			System.out.println("�ۼ���: " + board.getName());
			System.out.println("�� ���� : " + board.getTitle());
			System.out.println("�� ���� : " + board.getContent());
			System.out.println("��ȸ��  : " + board.getHits());
			System.out.println("��¥  : " + board.getIndate());
			System.out.println();
		}
		
		
//		try {
//			Board board = mgr.readBoard(num);
//			System.out.println("�� ��ȣ : " + board.getBoardnum());
//			System.out.println("�ۼ���: " + board.getName());
//			System.out.println("�� ���� : " + board.getTitle());
//			System.out.println("�� ���� : " + board.getContent());
//			System.out.println("��ȸ��  : " + board.getHits());
//			System.out.println("��¥  : " + board.getIndate());
//			System.out.println();
//		} catch (Exception e) {
//			System.out.println("�� ��ȣ�� �´� ������ �����ϴ�.");
//			sc.nextLine();
//			
//		}
		
	}

	

	/**
	 * �� 1�� ����
	 */
	void delete() {
		sc.nextLine();
		
		System.out.println("[ �� ���� ] ");
		System.out.print("�� ��ȣ �Է� : ");
		int num = sc.nextInt();
		
		boolean check = mgr.deleteBoard(num);
		
		if(check) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ����");
		}
	}
	
	/**
	 * �˻�
	 */
//	void search() {
//		sc.nextLine();
//		
//		System.out.println("[ �������� �˻� ]");
//		System.out.print("�˻��� ���� : ");		
//		String word = sc.nextLine();
//		ArrayList<Board> boards = mgr.searchBoard(word);
//		
//		if(boards.isEmpty()) {
//			System.out.println("�� ����� �����ϴ�");
//		}else {
//			for( Board b: boards) {
//				System.out.println("�� ��ȣ : " + b.getBoardnum());
//				System.out.println("�ۼ���  : " + b.getName());
//				System.out.println("�� ���� : " + b.getTitle());
//				System.out.println("�� ���� : " + b.getContent());
//				System.out.println("��ȸ��  : " + b.getHits());
//				System.out.println("��¥  : " + b.getIndate());
//				System.out.println();
//				
//			}
//			
//		}
//	}
	
	void search() {
		sc.nextLine();
		
		System.out.println("[ �˻� ]");
		System.out.print("�˻��� ����(1:�ۼ��� 2.����3.ȥ��) : ");	
		int type = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("�˻��� ���� : ");
		String word = sc.nextLine();
		
		ArrayList<Board> list = mgr.searchBoard(word,type);
//		
		if(list.isEmpty()) {
			System.out.println("�� ����� �����ϴ�");
		}else {
			for( Board b: list) {
				System.out.println("�� ��ȣ : " + b.getBoardnum());
				System.out.println("�ۼ���  : " + b.getName());
				System.out.println("�� ���� : " + b.getTitle());
				System.out.println("�� ���� : " + b.getContent());
				System.out.println("��ȸ��  : " + b.getHits());
				System.out.println("��¥  : " + b.getIndate());
				System.out.println();
			}
		}
	}
//	void search() {
//		sc.nextLine();
//		
//		System.out.println("[ �˻� ]");
//		System.out.print("�˻��� ����(1:�ۼ��� 2.����3.ȥ��) : ");	
//		int type = sc.nextInt();
//		
//		sc.nextLine();
//		
//		System.out.println("�˻��� ���� : ");
//		String word = sc.nextLine();
//		
//		switch (type) {
//		case 1:
//			ArrayList<Board> list = mgr.searchBoard(word,type);
//			
//			if(list.isEmpty()) {
//				System.out.println("�� ����� �����ϴ�");
//			}else {
//				for( Board b: list) {
//					System.out.println("�� ��ȣ : " + b.getBoardnum());
//					System.out.println("�ۼ���  : " + b.getName());
//					System.out.println("�� ���� : " + b.getTitle());
//					System.out.println("�� ���� : " + b.getContent());
//					System.out.println("��ȸ��  : " + b.getHits());
//					System.out.println("��¥  : " + b.getIndate());
//					System.out.println();
//				}
//			}
//		case 2:
//			ArrayList<Board> list2 = mgr.searchBoard2(word,type);
//			
//			if(list2.isEmpty()) {
//				System.out.println("�� ����� �����ϴ�");
//			}else {
//				for( Board b: list2) {
//					System.out.println("�� ��ȣ : " + b.getBoardnum());
//					System.out.println("�ۼ���  : " + b.getName());
//					System.out.println("�� ���� : " + b.getTitle());
//					System.out.println("�� ���� : " + b.getContent());
//					System.out.println("��ȸ��  : " + b.getHits());
//					System.out.println("��¥  : " + b.getIndate());
//					System.out.println();
//				}
//			}
//			break;
//		case 3:
//			ArrayList<Board> list3 = mgr.searchBoard3(word,type);
//			
//			if(list3.isEmpty()) {
//				System.out.println("�� ����� �����ϴ�");
//			}else {
//				for( Board b: list3) {
//					System.out.println("�� ��ȣ : " + b.getBoardnum());
//					System.out.println("�ۼ���  : " + b.getName());
//					System.out.println("�� ���� : " + b.getTitle());
//					System.out.println("�� ���� : " + b.getContent());
//					System.out.println("��ȸ��  : " + b.getHits());
//					System.out.println("��¥  : " + b.getIndate());
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
//			System.out.println("�� ����� �����ϴ�");
//		}else {
//			for( Board b: list) {
//				System.out.println("�� ��ȣ : " + b.getBoardnum());
//				System.out.println("�ۼ���  : " + b.getName());
//				System.out.println("�� ���� : " + b.getTitle());
//				System.out.println("�� ���� : " + b.getContent());
//				System.out.println("��ȸ��  : " + b.getHits());
//				System.out.println("��¥  : " + b.getIndate());
//				System.out.println();
//				
//			}
//			
//		}
	

}
