package application;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread{ //Thread �ϳ��� ���� ���α׷�, j-layer-library ��������
	private Player player; //�޾Ҵ� ����Ʈ�� �ִ� ���̺귯�� �� �ϳ�
	private boolean isLoop; // ���ѹݺ����� �ƴ���
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public Music(String name, boolean isLoop) { //try catch ����ó���� ���� ���Ǵ� ���� try ���� �ȿ��� ���� �߻��� catch������ �̵�
		try {
			this.isLoop = isLoop;
			file = new File(Main.class.getResource(""+name).toURI());
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
		} catch (Exception m) {
			System.out.println(m.getMessage());
		}
	}
	public int getTime() { //���� ����ǰ� �ִ� ������ � ��ġ���� ����ǰ� �ִ��� �˷��ִ� �Լ� ex) 10��¥�������� ��� ������ 10000�̶�� ���� ��ȯ
		if(player==null) 
			return 0;
		return player.getPosition();
		
	}
	public void close() {
		try {
		isLoop = false;
		player.close();
		this.interrupt(); }catch (Exception e) {
			e.printStackTrace();
		} //�ش� �����带 �������׷� ����� ��
	}

	@Override
	public void run() {
		try {
			do {
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
				player.play();//isLoop�� true ���� ������ �ش� ���� ���� ���
			} while(isLoop);
		}catch (Exception m) {
			System.out.println(m.getMessage());
				}
			}
		
}
