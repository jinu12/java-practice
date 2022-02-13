package application;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread{ //Thread 하나의 작은 프로그램, j-layer-library 가져오기
	private Player player; //받았던 사이트에 있던 라이브러리 중 하나
	private boolean isLoop; // 무한반복인지 아닌지
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public Music(String name, boolean isLoop) { //try catch 예외처리를 위해 사용되는 구문 try 구문 안에서 오루 발생시 catch문으로 이동
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
	public int getTime() { //현재 실행되고 있는 음악이 어떤 위치에서 실행되고 있는지 알려주는 함수 ex) 10초짜리음악을 듣고 있으면 10000이라는 값을 반환
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
		} //해당 스레드를 중지상테로 만드는 것
	}

	@Override
	public void run() {
		try {
			do {
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
				player.play();//isLoop가 true 값을 가지면 해당 값은 무한 재생
			} while(isLoop);
		}catch (Exception m) {
			System.out.println(m.getMessage());
				}
			}
		
}
