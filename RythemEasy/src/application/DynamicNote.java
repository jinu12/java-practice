package application;



import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class DynamicNote extends Thread {
	GraphicsContext gc;
	private Image noteBasicImage = new Image("³ëµå.png");
	private int x, y = 580 - 1000 / HardMode.SLEEP_TIME * HardMode.NOTE_SPEED;
	private String noteType;
	
	public DynamicNote(String noteType) {
		if(noteType.equals("A")) {
			x=40;
		}
		else if(noteType.equals("S")) {
			x=70;	
		}
		else if(noteType.equals("D")) {
			x=100;	
		}
		else if(noteType.equals("F")) {
			x=130;	
		}
		else if(noteType.equals("Z")) {
			x=160;	
		}
		else if(noteType.equals("X")) {
			x=190;	
		}
		else if(noteType.equals("C")) {
			x=230;	
		}

		this.noteType = noteType;
	}
	
	public void screenDraw(GraphicsContext gc) {
		if(noteType.equals("short"))
		{
			gc.drawImage(noteBasicImage, x, y);
		}
		else if(noteType.equals("long"))
		{
			gc.drawImage(noteBasicImage, x, y);
			gc.drawImage(noteBasicImage, x + 100, y);
		}
	}
	
	public void drop() {
		y += HardMode.NOTE_SPEED;
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				drop();
				Thread.sleep(HardMode.SLEEP_TIME);
			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
}

