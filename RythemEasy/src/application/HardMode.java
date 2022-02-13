package application;



import java.util.ResourceBundle;


import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.util.Duration;


public class HardMode implements Initializable {
	
	
	protected static final int UPDATE_RATE = 20;
	Music selection = new Music("selection1.mp3",false);
	private GraphicsContext backgd;
	private GraphicsContext ce;
	private GraphicsContext g2;
	private GraphicsContext g3;
	private GraphicsContext g4;
	private GraphicsContext g5;
	private GraphicsContext g6;
	private GraphicsContext g7;
	private GraphicsContext g8;
	private GraphicsContext g9;
	private GraphicsContext Hps;
	 int num = 1000;
	int starttime=0;
	
	public static int NOTE_SPEED = 15;
	public static int SLEEP_TIME = 10;
	Image image9 = new Image("노드.png");
	Image noteRouteSImage = new Image("Images/리듬게임 노드 터치(노랑).png");
	Image image5 = new Image("Images/리듬게임 노드 터치(분홍).png");
	Image image6 = new Image("Images/리듬게임 노드 터치(빨강).png");
	Image image7 = new Image("Images/리듬게임 노드 터치(주황).png");
	Image image8 = new Image("Images/리듬게임 노드 터치(초록).png");
	Image image10 = new Image("Images/리듬게임 노드 터치(파랑).png");
	Image image11 = new Image("Images/리듬게임 노드 터치(하늘).png");
	Image image12 = new Image("Images/리듬게임 노드 터치(노랑).png");
	Image bad = new Image("Images/히트 텍스트(BAD).png");
	Image good = new Image("Images/히트 텍스트(GOOD).png");
	Image perfect = new Image("Images/히트 텍스트(PERFECT).png");
	Image backs = new Image("Images/nodepan.png");
	Image Hp5 = new Image("Images/hp5.png");
	Image process = new Image("Images/진행바1.png");
	Image viewer = new Image("Images/viewer.png");
	Image easy = new Image("Images/easy.PNG");
	boolean game;
    @FXML
    private ImageView selectview;
    @FXML
    private Canvas cs;
    @FXML
    private Canvas background;
    @FXML
    private Canvas Hp;
    @FXML
    private Canvas canvas2;
    @FXML
    private Canvas canvas3;
    @FXML
    private Canvas canvas4;
    @FXML
    private Canvas canvas5;
    @FXML
    private Canvas canvas6;
    @FXML
    private Canvas canvas7;
    @FXML
    private Canvas canvas8;
    @FXML
    private Canvas canvas9;
    @FXML
    private ImageView textpoint;
    @FXML
    private Button WhiteBtn1;
    @FXML
    private Button BlackBtn1;
    @FXML
    private Button WhiteBtn2;
    @FXML
    private Button BlackBtn2;
    @FXML
    private Button WhiteBtn3;
    @FXML
    private Button BlackBtn3;
    @FXML
    private Canvas cd;
    boolean gameplay=true;
    
    
	@Override
	public void initialize(java.net.URL arg0, ResourceBundle arg1) {
		selectview.setImage(viewer);
		selection.start();		
		MusicStart();
		ce = cs.getGraphicsContext2D();
		backgd = background.getGraphicsContext2D();
		g2 = canvas2.getGraphicsContext2D();
		g3 = canvas3.getGraphicsContext2D();
		g4 = canvas4.getGraphicsContext2D();
		g5 = canvas5.getGraphicsContext2D();
		g6 = canvas6.getGraphicsContext2D();
		g7 = canvas7.getGraphicsContext2D();
		g8 = canvas8.getGraphicsContext2D();
		g9 = canvas8.getGraphicsContext2D();
		Hps = Hp.getGraphicsContext2D();
		draw();
		textpoint.setImage(bad);
		textpoint.setVisible(false);
	}
	 private void draw() {
		 	Hps.drawImage(Hp5, 0, 0,50,720);
		 	Hps.drawImage(process, 55, 0,50,720);
		    backgd.drawImage(easy, 0, 0,664,720);
			TranslateTransition tt = new TranslateTransition();
			g2.drawImage(image9, 326,0,112,80);
			g2.drawImage(image9, 0,100,112,80);
		 	g2.drawImage(image9, 82,200,112,80);
		   	g2.drawImage(image9, 164,300,112,80);
			g2.drawImage(image9, 244,400,112,80);
			g2.drawImage(image9, 326,500,112,80);
			g2.drawImage(image9, 388,600,112,80);
			g2.drawImage(image9, 470,650,112,80);
			g2.drawImage(image9, 552,700,112,80);
			g2.drawImage(image9, 0,1700,112,80);
			g2.drawImage(image9, 0,700,112,80);
			g2.drawImage(image9, 0,1000,112,80);
		 	g2.drawImage(image9, 82,900,112,80);
		 	g2.drawImage(image9, 164,1000,112,80);
			g2.drawImage(image9, 408,1100,112,80);
			g2.drawImage(image9, 326,1200,112,80);
			g2.drawImage(image9, 408,1300,112,80);
			g2.drawImage(image9, 326,1400,112,80);
			g2.drawImage(image9, 408,1500,112,80);
			g2.drawImage(image9, 0,1700,112,80);
			tt.setNode(canvas2);
			tt.setDuration(Duration.seconds(12));		
			tt.setToY(2100);
			tt.setCycleCount(1);
			tt.play();
			TranslateTransition t1 = new TranslateTransition();
			g3.drawImage(image9, 0,0,85,60);
			g3.drawImage(image9, 0,100,85,60);
		 	g3.drawImage(image9, 82,200,85,60);
		    g3.drawImage(image9, 164,300,85,60);
			g3.drawImage(image9, 244,400,85,60);
			g3.drawImage(image9, 326,500,85,60);
			g3.drawImage(image9, 388,600,85,60);
			g3.drawImage(image9, 470,650,85,60);
			g3.drawImage(image9, 0,700,85,60);
		 	g3.drawImage(image9, 82,850,85,60);
		    g3.drawImage(image9, 164,900,85,60);
			g3.drawImage(image9, 244,950,85,60);
			g3.drawImage(image9, 326,1000,85,60);
			g3.drawImage(image9, 388,1050,85,60);
			g3.drawImage(image9, 470,1100,85,60);
			g3.drawImage(image9, 552,1150,85,60);
			t1.setDelay(Duration.seconds(10));
			t1.setNode(canvas3);
			t1.setDuration(Duration.seconds(12));		
			t1.setToY(2100);
			t1.setCycleCount(1);
			t1.play();
			TranslateTransition t2 = new TranslateTransition();
			g4.drawImage(image9, 0,0,85,60);
			g4.drawImage(image9, 0,100,85,60);
			g4.drawImage(image9, 0,700,85,60);
		 	g4.drawImage(image9, 112,200,85,60);
		 	g4.drawImage(image9, 224,400,85,60);
		    g4.drawImage(image9, 336,300,85,60);
			
			g4.drawImage(image9, 326,500,85,60);
			g4.drawImage(image9, 388,600,85,60);
			g4.drawImage(image9, 470,650,85,60);
		 	g4.drawImage(image9, 82,850,85,60);
		    g4.drawImage(image9, 164,900,85,60);
			g4.drawImage(image9, 244,950,85,60);
			g4.drawImage(image9, 326,1000,85,60);
			g4.drawImage(image9, 388,1050,85,60);
			g4.drawImage(image9, 470,1100,85,60);
			g4.drawImage(image9, 552,1150,85,60);
			t2.setDelay(Duration.seconds(12));
			t2.setNode(canvas4);
			t2.setDuration(Duration.seconds(20));		
			t2.setToY(2100);
			t2.setCycleCount(1);
			t2.play();
			TranslateTransition t3 = new TranslateTransition();
			g5.drawImage(image9, 0,0,85,60);
			g5.drawImage(image9, 0,100,85,60);
		 	g5.drawImage(image9, 82,200,85,60);
		    g5.drawImage(image9, 164,300,85,60);
			g5.drawImage(image9, 244,400,85,60);
			g5.drawImage(image9, 326,500,85,60);
			g5.drawImage(image9, 388,600,85,60);
			g5.drawImage(image9, 470,650,85,60);
			g5.drawImage(image9, 0,700,85,60);
		 	g5.drawImage(image9, 82,850,85,60);
		    g5.drawImage(image9, 164,900,85,60);
			g5.drawImage(image9, 244,950,85,60);
			g5.drawImage(image9, 326,1000,85,60);
			g5.drawImage(image9, 388,1050,85,60);
			g5.drawImage(image9, 470,1100,85,60);
			g5.drawImage(image9, 552,1150,85,60);
			t3.setDelay(Duration.seconds(30));
			t3.setNode(canvas5);
			t3.setDuration(Duration.seconds(12));		
			t3.setToY(2100);
			t3.setCycleCount(1);
			t3.play();
			TranslateTransition t4 = new TranslateTransition();
			g6.drawImage(image9, 0,0,85,60);
			g6.drawImage(image9, 0,100,85,60);
		 	g6.drawImage(image9, 82,200,85,60);
		    g6.drawImage(image9, 164,300,85,60);
			g6.drawImage(image9, 244,400,85,60);
			g6.drawImage(image9, 326,500,85,60);
			g6.drawImage(image9, 388,600,85,60);
			g6.drawImage(image9, 470,650,85,60);
			g6.drawImage(image9, 0,700,85,60);
		 	g6.drawImage(image9, 82,850,85,60);
		    g6.drawImage(image9, 164,900,85,60);
			g6.drawImage(image9, 244,950,85,60);
			g6.drawImage(image9, 326,1000,85,60);
			g6.drawImage(image9, 388,1050,85,60);
			g6.drawImage(image9, 470,1100,85,60);
			g6.drawImage(image9, 552,1150,85,60);
			t4.setDelay(Duration.seconds(40));
			t4.setNode(canvas6);
			t4.setDuration(Duration.seconds(12));		
			t4.setToY(2100);
			t4.setCycleCount(1);
			t4.play();
			TranslateTransition t5 = new TranslateTransition();
			g7.drawImage(image9, 0,0,85,60);
			g7.drawImage(image9, 0,100,85,60);
		 	g7.drawImage(image9, 82,200,85,60);
		    g7.drawImage(image9, 164,300,85,60);
			g7.drawImage(image9, 244,400,85,60);
			g7.drawImage(image9, 326,500,85,60);
			g7.drawImage(image9, 388,600,85,60);
			g7.drawImage(image9, 470,650,85,60);
			g7.drawImage(image9, 0,700,85,60);
		 	g7.drawImage(image9, 82,850,85,60);
		    g7.drawImage(image9, 164,900,85,60);
			g7.drawImage(image9, 244,950,85,60);
			g7.drawImage(image9, 326,1000,85,60);
			g7.drawImage(image9, 388,1050,85,60);
			g7.drawImage(image9, 470,1100,85,60);
			g7.drawImage(image9, 552,1150,85,60);
			t5.setDelay(Duration.seconds(50));
			t5.setNode(canvas7);
			t5.setDuration(Duration.seconds(12));		
			t5.setToY(2100);
			t5.setCycleCount(1);
			t5.play();
			TranslateTransition t6 = new TranslateTransition();
			g8.drawImage(image9, 0,0,85,60);
			g8.drawImage(image9, 0,100,85,60);
		 	g8.drawImage(image9, 82,200,85,60);
		    g8.drawImage(image9, 164,300,85,60);
			g8.drawImage(image9, 244,400,85,60);
			g8.drawImage(image9, 326,500,85,60);
			g8.drawImage(image9, 388,600,85,60);
			g8.drawImage(image9, 470,650,85,60);
			g8.drawImage(image9, 0,700,85,60);
		 	g8.drawImage(image9, 82,850,85,60);
		    g8.drawImage(image9, 164,900,85,60);
			g8.drawImage(image9, 244,950,85,60);
			g8.drawImage(image9, 326,1000,85,60);
			g8.drawImage(image9, 388,1050,85,60);
			g8.drawImage(image9, 470,1100,85,60);
			g8.drawImage(image9, 552,1150,85,60);
			t6.setDelay(Duration.seconds(60));
			t6.setNode(canvas8);
			t6.setDuration(Duration.seconds(12));		
			t6.setToY(2100);
			t6.setCycleCount(1);
			t6.play();
			TranslateTransition t7 = new TranslateTransition();
			g9.drawImage(image9, 0,0,85,60);
			g9.drawImage(image9, 0,100,85,60);
		 	g9.drawImage(image9, 82,200,85,60);
		    g9.drawImage(image9, 164,300,85,60);
			g9.drawImage(image9, 244,400,85,60);
			g9.drawImage(image9, 326,500,85,60);
			g9.drawImage(image9, 388,600,85,60);
			g9.drawImage(image9, 470,650,85,60);
			g9.drawImage(image9, 0,700,85,60);
		 	g9.drawImage(image9, 82,850,85,60);
		    g9.drawImage(image9, 164,900,85,60);
			g9.drawImage(image9, 244,950,85,60);
			g9.drawImage(image9, 326,1000,85,60);
			g9.drawImage(image9, 388,1050,85,60);
			g9.drawImage(image9, 470,1100,85,60);
			g9.drawImage(image9, 552,1150,85,60);
			t7.setDelay(Duration.seconds(70));
			t7.setNode(canvas9);
			t7.setDuration(Duration.seconds(12));		
			t7.setToY(2100);
			t7.setCycleCount(1);
			t7.play();
			System.out.println(starttime);
		}

	@FXML
	    void StartBtn(KeyEvent event) {
	
	    }
	  @FXML//image9.getHeight().equals(WhiteBtn1.getLayoutY()
	    void WhitePlay(KeyEvent event) {
		  	if(event.getCode() == KeyCode.A) {
		  		WhiteBtn1.setOpacity(0);
		  		if(starttime>=30 && starttime <40) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=50 && starttime <60) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=60 && starttime <70) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=70 && starttime <80) {
		  			ce.drawImage(good, 0, 0);
		  			g2.clearRect(0,1000,85,60);
		  		}
		  		if(starttime>=80 && starttime <90) {
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=90 && starttime <100) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=100 && starttime <110) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=100 && starttime <110) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=110 && starttime <120) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  	}
		  	else if(event.getCode() == KeyCode.S) {		  		
		  		if(starttime>=20 && starttime <30) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=30 && starttime <40) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=40 && starttime <50) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=50 && starttime <60) {
		  			ce.drawImage(good, 0, 0);
		  			g2.clearRect(0,1000,85,60);
		  		}
		  		if(starttime>=60 && starttime <70) {
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=70 && starttime <80) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=80 && starttime <90) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=90 && starttime <100) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		BlackBtn1.setOpacity(0);
		  		if(starttime>2000) {
		  			g2.clearRect(0,1700,85,60);
		  		}
		  		BlackBtn1.setOpacity(0);
		  		BlackBtn1.setVisible(true);
		  	}
		  	else if(event.getCode() == KeyCode.D) {
		  		if(starttime>=20 && starttime <30) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=30 && starttime <40) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=40 && starttime <50) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=50 && starttime <60) {
		  			ce.drawImage(good, 0, 0);
		  			g2.clearRect(0,1000,85,60);
		  		}
		  		if(starttime>=60 && starttime <70) {
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=70 && starttime <80) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=80 && starttime <90) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=90 && starttime <100) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		WhiteBtn2.setOpacity(0);
		  		g2.clearRect(0, 700, 85, 60);
		  		g2.drawImage(bad, 250, 300,300,300);
		  		WhiteBtn2.setOpacity(0);
		  	}
			else if(event.getCode() == KeyCode.F) {
				BlackBtn2.setOpacity(0);
				g2.clearRect(0, 700, 85, 60);
				if(starttime>=20 && starttime <30) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=30 && starttime <40) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=40 && starttime <50) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=50 && starttime <60) {
		  			ce.drawImage(good, 0, 0);
		  			g2.clearRect(0,1000,85,60);
		  		}
		  		if(starttime>=60 && starttime <70) {
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=70 && starttime <80) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=80 && starttime <90) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=90 && starttime <100) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(g2.getTransform().equals(BlackBtn1)) {
		  			textpoint.setVisible(true);
		  		}
		  		g2.drawImage(good, 250, 300,300,300);
		  		BlackBtn2.setVisible(true);
		  	}
			else if(event.getCode() == KeyCode.Z) {
				WhiteBtn3.setOpacity(0);
				g2.clearRect(0, 700, 85, 60);
				if(starttime>=20 && starttime <30) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=30 && starttime <40) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=40 && starttime <50) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=50 && starttime <60) {
		  			ce.drawImage(good, 0, 0);
		  			g2.clearRect(0,1000,85,60);
		  		}
		  		if(starttime>=60 && starttime <70) {
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=70 && starttime <80) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=80 && starttime <90) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=90 && starttime <100) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(g2.getTransform().equals(BlackBtn1)) {
		  			textpoint.setVisible(true);
		  		}
	
		  		g2.drawImage(bad,300,300);
		  	}
			else if(event.getCode() == KeyCode.X) {
				BlackBtn3.setOpacity(0);
				g2.clearRect(0, 700, 85, 60);
				if(starttime>=20 && starttime <30) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=30 && starttime <40) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=40 && starttime <50) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=50 && starttime <60) {
		  			ce.drawImage(good, 0, 0);
		  			g2.clearRect(0,1000,85,60);
		  		}
		  		if(starttime>=60 && starttime <70) {
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=70 && starttime <80) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=80 && starttime <90) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=90 && starttime <100) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(g2.getTransform().equals(BlackBtn1)) {
		  			textpoint.setVisible(true);
		  		}
		  		g2.drawImage(good, 250, 300,300,300);
		  		BlackBtn3.setOpacity(0);
		  		BlackBtn3.setVisible(true);
		  	}

	    }
	    @FXML
	    void WhiteGather(KeyEvent event) {
	    	if(event.getCode() == KeyCode.A) {
	    		BlackBtn1.setOpacity(100);    		
	    		if(starttime>=20) {
		  			ce.clearRect(40, 0,200,200);
		  		}
		  		if(starttime>=30) {
		  			ce.clearRect(200, 200,200,200);
		  		}
		  		if(starttime>=40) {
		  			ce.clearRect(200, 200,200,200);
		  		}
		  		if(starttime>=50) {
		  			ce.clearRect(200, 200,200,200);
		  			
		  		}
		  		if(starttime>=60) {
		  			ce.clearRect(200, 200,200,200);
		  		}
		  		if(starttime>=70) {
		  			ce.clearRect(200, 200,200,200);
		  			
		  		}
	    		WhiteBtn1.setOpacity(100);
	    		g2.clearRect(250, 300, 300, 300);
		  		textpoint.setVisible(false);
		  	}
		  	else if(event.getCode() == KeyCode.S) {
		  		if(starttime>=20 && starttime <30) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=30 && starttime <40) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=40 && starttime <50) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=50 && starttime <60) {
		  			ce.drawImage(good, 0, 0);
		  			g2.clearRect(0,1000,85,60);
		  		}
		  		if(starttime>=60 && starttime <70) {
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=70 && starttime <80) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=80 && starttime <90) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=90 && starttime <100) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		BlackBtn1.setOpacity(100);
		  		BlackBtn1.setOpacity(100);
		 		g3.clearRect(250, 300, 300, 300);
		  	}
		  	else if(event.getCode() == KeyCode.D) {
		  		if(starttime>=20 && starttime <30) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=30 && starttime <40) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=40 && starttime <50) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=50 && starttime <60) {
		  			ce.drawImage(good, 0, 0);
		  			g2.clearRect(0,1000,85,60);
		  		}
		  		if(starttime>=60 && starttime <70) {
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=70 && starttime <80) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=80 && starttime <90) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=90 && starttime <100) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		g4.clearRect(68, 0, 30, 2100);
		  		WhiteBtn2.setOpacity(100);
		 		g4.clearRect(250, 300, 300, 300);
		  	}
			else if(event.getCode() == KeyCode.F) {
				if(starttime>=20 && starttime <30) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=30 && starttime <40) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=40 && starttime <50) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=50 && starttime <60) {
		  			ce.drawImage(good, 0, 0);
		  			g2.clearRect(0,1000,85,60);
		  		}
		  		if(starttime>=60 && starttime <70) {
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=70 && starttime <80) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=80 && starttime <90) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=90 && starttime <100) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
				WhiteBtn1.setOpacity(100);
				g5.clearRect(102, 0, 30, 2100);
				BlackBtn2.setOpacity(100);
		 		g5.clearRect(250, 300, 300, 300);
		  	}
			else if(event.getCode() == KeyCode.Z) {
				if(starttime>=20 && starttime <30) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=30 && starttime <40) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=40 && starttime <50) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=50 && starttime <60) {
		  			ce.drawImage(good, 0, 0);
		  			g2.clearRect(0,1000,85,60);
		  		}
		  		if(starttime>=60 && starttime <70) {
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=70 && starttime <80) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=80 && starttime <90) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=90 && starttime <100) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
				WhiteBtn3.setOpacity(100);
				g6.clearRect(136, 0, 30, 2100);
				WhiteBtn3.setOpacity(100);
		 		g6.clearRect(250, 300, 300, 300);
		  	}
			else if(event.getCode() == KeyCode.X) {
				if(starttime>=20 && starttime <30) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=30 && starttime <40) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=40 && starttime <50) {
		  			g2.clearRect(0,1700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=50 && starttime <60) {
		  			ce.drawImage(good, 0, 0);
		  			g2.clearRect(0,1000,85,60);
		  		}
		  		if(starttime>=60 && starttime <70) {
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=70 && starttime <80) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=80 && starttime <90) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=90 && starttime <100) {
		  			g2.clearRect(0,100,85,60);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
				BlackBtn3.setOpacity(100);
				g7.clearRect(170, 0, 30, 2100);
				BlackBtn3.setOpacity(100);
		 		g7.clearRect(250, 300, 300, 300);
		  	}

	    }

		   int sum=1000;
	   public void MusicStart() {
		   Thread Music = new  Thread() {
			   public void run() {
				   while(gameplay) {
					   if(true) {
						   starttime += sum/100; 
						   System.out.println(starttime);
						   try {
							   Thread.sleep(1000);
						   } catch (InterruptedException e) { }
					   }
				   }
			   }
		   };
		   Music.start();
	   }
}




