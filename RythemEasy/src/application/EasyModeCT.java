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

public class EasyModeCT implements Initializable{
	protected static final int UPDATE_RATE = 20;
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
	Music fale = new Music("missionfale.mp3",false);
	Music selection = new Music("Bluming.mp3",false);
	Image green = new Image("Images/리듬게임 노드 터치(초록).png");
	Image blue = new Image("Images/리듬게임 노드 터치(파랑).png");
	Image sky = new Image("Images/리듬게임 노드 터치(하늘).png");
	Image yellow = new Image("Images/리듬게임 노드 터치(노랑).png");
	Image bad = new Image("Images/히트 텍스트(BAD).png");
	Image good = new Image("Images/히트 텍스트(GOOD).png");
	Image perfect = new Image("Images/히트 텍스트(PERFECT).png");
	Image backs = new Image("Images/nodepan.png");
	Image Hp5 = new Image("Images/hp5.png");
	Image Hp4 = new Image("Images/hp4.png");
	Image Hp3 = new Image("Images/hp3.png");
	Image Hp2 = new Image("Images/hp2.png");
	Image Hp1 = new Image("Images/hp1.png");
	Image process = new Image("Images/진행바1.png");
	Image process2 = new Image("Images/진행바2.png");
	Image process3 = new Image("Images/진행바3.png");
	Image process4 = new Image("Images/진행바4.png");
	Image process5 = new Image("Images/진행바5.png");
	Image process6 = new Image("Images/진행바6.png");
	Image process7 = new Image("Images/진행바7.png");
	Image process8 = new Image("Images/진행바8.png");
	Image process9 = new Image("Images/진행바9.png");
	Image process10 = new Image("Images/진행바10.png");
	Image viewer = new Image("Images/viewer.png");
	Image easy = new Image("Images/easycontrol.PNG");
	Image effect1 = new Image("Images/이펙트(1).PNG");
	
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
    private Canvas cd;

    @FXML
    private Button home;

    @FXML
    private Button Reset;
    private int hp =5;
    boolean gameplay=true;
    int sum=1000;
    
    int btn_1 = 0;
    int btn_2 = 165;
    int btn_3 = 330;
    int btn_4 = 496;
    
    int width = 160;
    int height = 80;
    
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
    
    @FXML
    void StartBtn(KeyEvent event) {

    }
    
	  @FXML//image9.getHeight().equals(WhiteBtn1.getLayoutY()
	    void WhitePlay(KeyEvent event) {	  
		  	if(event.getCode() == KeyCode.A) {
		  		if(starttime>=70 && starttime <80) {
		  			Hps.clearRect(55, 0, 50, 720);
		    		Hps.drawImage(process2, 55, 0,50,720);
		  		}
		  		else if(starttime>=140 && starttime <150) {
		  			Hps.clearRect(55, 0, 50, 720);
		    		Hps.drawImage(process3, 55, 0,50,720);
		  		}
		  		else if(starttime>=210 && starttime <220) {
		  			Hps.clearRect(55, 0, 50, 720);
		    		Hps.drawImage(process4, 55, 0,50,720);
		  		}
		  		else if(starttime>=290 && starttime <300) {
		  			Hps.clearRect(55, 0, 50, 720);
		    		Hps.drawImage(process5, 55, 0,50,720);
		  		}
		  		else if(starttime>=350 && starttime <360) {
		  			Hps.clearRect(55, 0, 50, 720);
		    		Hps.drawImage(process6, 55, 0,50,720);
		  		}
		  		if(hp == 4) {
		    		Hps.clearRect(0, 0, 50, 720);
		    		Hps.drawImage(Hp4, 0, 0,50,720);
		    	}
		    	if(hp <= 3) {
		    		Hps.clearRect(0, 0, 50, 720);
		    		Hps.drawImage(Hp3, 0, 0,50,720);
		    	}
		    	if(hp <= 2) {
		    		Hps.clearRect(0, 0, 50, 720);
		    		Hps.drawImage(Hp2, 0, 0,50,720);
		    	}
		    	if(hp <= 1) {
		    		Hps.clearRect(0, 0, 50, 720);
		    		Hps.drawImage(Hp1, 0, 0,50,720);
		    	}
		    	if(hp <= 0) {
		    		Hps.clearRect(0, 0, 50, 720);
		    		selection.close();
		    		fale.start();
		    		TranslateTransition aa = new TranslateTransition();
		    		aa.setNode(Reset);
		    		aa.setDuration(Duration.seconds(2));		
		    		aa.setToY(400);
		    		aa.setCycleCount(1);
		    		aa.play();
		    		TranslateTransition a1 = new TranslateTransition();
		    		a1.setNode(home);
		    		a1.setDuration(Duration.seconds(2));		
		    		a1.setToY(400);
		    		a1.setCycleCount(1);
		    		a1.play();
		    	}
		  		WhiteBtn1.setOpacity(0);
		  		if(starttime>=30 && starttime <40) {
		  			ce.drawImage(good, 0, 0);
		  			System.out.println(hp);
		  			for (int i = 0; i < nodeX1.length; i++) {
		  				g2.clearRect(nodeX1[11],nodeY1[11],width,height);
		  			}
		  			ce.drawImage(effect1, 0, 0,60,60);
		  			ce.drawImage(yellow,0, 0,180,180);
		  		}
		  		
		  		if(starttime>=40 && starttime <50) {
		  			ce.drawImage(perfect, 0, 0);
		  			System.out.println(hp);
		  			for (int i = 0; i < nodeX1.length; i++) {
		  				g2.clearRect(nodeX1[11],nodeY1[11],width,height);
		  			}
		  			ce.drawImage(effect1, 50, 50,60,60);
		  			ce.drawImage(yellow,0, 0,180,180);
		  		}
		  		if(starttime>=50 && starttime <60) {
		  			for (int i = 0; i < nodeX1.length; i++) {
		  				g2.clearRect(nodeX1[8],nodeY1[8],width,height);
		  			}
		  			ce.drawImage(yellow,0, 0,180,180);
		  			ce.drawImage(perfect, 0, 0);
		  		}
		  		if(starttime>=60 && starttime <70) {
		  				hp--;
			  			ce.drawImage(bad, 0, 0);
			  		}
		  		if(starttime>=70 && starttime <80) {
		  			for (int i = 0; i < nodeX1.length; i++) {
		  				g2.clearRect(nodeX1[5],nodeY1[5],width,height);
		  			}
		  			ce.drawImage(perfect, 0, 0);
		  		}
		  		if(starttime>=80 && starttime <90) {
		  			for (int i = 0; i < nodeX1.length; i++) {
		  				g2.clearRect(nodeX1[2],nodeY1[2],width,height);
		  			}
		  			ce.drawImage(perfect, 0, 0);
		  		}
		  		if(starttime>=90 && starttime <100) {
		  			hp--;
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=100 && starttime <110) {
		  			hp--;
		  			for (int i = 0; i < nodeX1.length; i++) {
		  				g2.clearRect(nodeX1[2],nodeY1[2],width,height);
		  			}
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=110 && starttime <120) {
		  			hp--;
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=110 && starttime <120) {
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=120 && starttime <130) {
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=130 && starttime <140) {
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=140 && starttime <150) {
		  			for (int i = 0; i < nodeX1.length; i++) {
		  				g3.clearRect(nodeX2[6],nodeY2[6],width,height);
		  			}
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=150 && starttime <160) {
		  			g2.clearRect(0,1200,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=160 && starttime <170) {
		  			g2.clearRect(0,1200,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=170 && starttime <180) {
		  			g2.clearRect(0,1200,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=180 && starttime <190) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=190 && starttime <200) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=200 && starttime <210) {
		  			g2.clearRect(165,1000,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=210 && starttime <220) {
		  			g2.clearRect(165,1000,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=220 && starttime <230) {
		  			g2.clearRect(165,1000,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=230 && starttime <240) {
		  			g2.clearRect(165,1000,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=240 && starttime <250) {
		  			g2.clearRect(165,1000,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=250 && starttime <260) {
		  			g2.clearRect(165,1000,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=260 && starttime <270) {
		  			g2.clearRect(165,0,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}if(starttime>=270 && starttime <270) {
		  			g2.clearRect(165,0,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=280 && starttime <290) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=290 && starttime <300) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=300 && starttime <310) {
		  			g3.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=310 && starttime <320) {
		  			g3.clearRect(0,1200,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=320 && starttime <330) {
		  			g3.clearRect(0,1200,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=330 && starttime <340) { //두번째 첫번째 노드
		  			g3.clearRect(0,1200,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=340 && starttime <350) {
		  			g3.clearRect(0,1200,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=350 && starttime <360) {
		  			g3.clearRect(0,250,160,80);
		  		}
		  		if(starttime>=360 && starttime <370) {
		  			g3.clearRect(0,250,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=370 && starttime <380) {
		  			g3.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=380 && starttime <390) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=390 && starttime <400) {
		  			g2.clearRect(165,1000,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=400 && starttime <410) {
		  			g2.clearRect(165,1000,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=410 && starttime <420) {
		  			g2.clearRect(165,1000,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=420 && starttime <430) {
		  			g2.clearRect(165,1000,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=430 && starttime <440) {
		  			g2.clearRect(165,1000,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=440 && starttime <430) {
		  			g2.clearRect(165,1000,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=430 && starttime <440) {
		  			g2.clearRect(165,0,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}if(starttime>=440 && starttime <450) {
		  			g2.clearRect(165,0,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=450 && starttime <460) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=460 && starttime <470) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=470 && starttime <480) {
		  			g3.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=490 && starttime <500) {
		  			g3.clearRect(0,1200,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=500 && starttime <510) {
		  			g3.clearRect(0,1200,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=510 && starttime <520) { 
		  			g3.clearRect(0,1200,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=530 && starttime <540) {
		  			g3.clearRect(0,1200,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=540 && starttime <550) {
		  			g3.clearRect(0,250,160,80);
		  		}
		  		if(starttime>=550 && starttime <560) {
		  			g3.clearRect(0,250,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=560 && starttime <570) {
		  			g3.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=570 && starttime <580) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=580 && starttime <590) {
		  			g2.clearRect(165,1000,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=590 && starttime <600) {
		  			for (int i = 0; i < nodeX1.length; i++) {
		  				g2.clearRect(nodeX1[0],nodeY1[0],width,height);
		  			}
		  			ce.drawImage(bad, 0, 0);					//A끝
		  		}                                               //A끝
		  	}													//A끝
		  	else if(event.getCode() == KeyCode.S) {				//S시작
		  		if(starttime<=100 && starttime <200) {
		  			Hps.clearRect(55, 0, 50, 720);
		    		Hps.drawImage(process2, 55, 0,50,720);
		  		}
		  		else if(starttime<=200 && starttime <300) {
		  			Hps.clearRect(55, 0, 50, 720);
		    		Hps.drawImage(process3, 55, 0,50,720);
		  		}
		  		else if(starttime<=300 && starttime <400) {
		  			Hps.clearRect(55, 0, 50, 720);
		    		Hps.drawImage(process4, 55, 0,50,720);
		  		}
		  		else if(starttime<=400 && starttime <500) {
		  			Hps.clearRect(55, 0, 50, 720);
		    		Hps.drawImage(process5, 55, 0,50,720);
		  		}
		  		else if(starttime<=500 && starttime <600) {
		  			Hps.clearRect(55, 0, 50, 720);
		    		Hps.drawImage(process6, 55, 0,50,720);
		  		}
		  		if(hp == 4) {
		    		Hps.clearRect(0, 0, 50, 720);
		    		Hps.drawImage(Hp4, 0, 0,50,720);
		    	}
		    	if(hp <= 3) {
		    		Hps.clearRect(0, 0, 50, 720);
		    		Hps.drawImage(Hp3, 0, 0,50,720);
		    	}
		    	if(hp <= 2) {
		    		Hps.clearRect(0, 0, 50, 720);
		    		Hps.drawImage(Hp2, 0, 0,50,720);
		    	}
		    	if(hp <= 1) {
		    		Hps.clearRect(0, 0, 50, 720);
		    		Hps.drawImage(Hp1, 0, 0,50,720);
		    	}
		    	if(hp <= 0) {
		    		Hps.clearRect(0, 0, 50, 720);
		    		selection.close();
		    		fale.start();
		    		TranslateTransition aa = new TranslateTransition();
		    		aa.setNode(Reset);
		    		aa.setDuration(Duration.seconds(2));		
		    		aa.setToY(400);
		    		aa.setCycleCount(1);
		    		aa.play();
		    		TranslateTransition a1 = new TranslateTransition();
		    		a1.setNode(home);
		    		a1.setDuration(Duration.seconds(2));		
		    		a1.setToY(400);
		    		a1.setCycleCount(1);
		    		a1.play();
		    	}
		  		if(starttime>=20 && starttime <30) {
		  			ce.drawImage(bad, 0, 0);
		  			hp--;
		  		}
		  		if(starttime>=30 && starttime <40) {
		  			for (int i = 0; i < nodeX1.length; i++) {
		  				g2.clearRect(nodeX1[10],nodeY1[10],width,height);
		  			}
		  		}
		  		if(starttime>=40 && starttime <50) {
		  			for (int i = 0; i < nodeX1.length; i++) {
		  				g2.clearRect(nodeX1[10],nodeY1[10],width,height);
		  			}
		  			ce.drawImage(good, 0, 0);
		  			ce.drawImage(yellow, 180, 180);
		  		}
		  		if(starttime>=50 && starttime <60) {
		  			for (int i = 0; i < nodeX1.length; i++) {
		  				g2.clearRect(nodeX1[10],nodeY1[10],width,height);
		  			}
		  			g2.clearRect(165,1000,160,80);
		  			ce.drawImage(good, 0, 0);
		  			ce.drawImage(yellow, 180, 180);
		  		}
		  		if(starttime>=60 && starttime <70) {
		  			for (int i = 0; i < nodeX1.length; i++) {
		  				g2.clearRect(nodeX1[7],nodeY1[7],width,height);
		  			}
		  			ce.drawImage(good, 0, 0);
		  			ce.drawImage(yellow, 180, 180);
		  		}
		  		if(starttime>=70 && starttime <80) {
		  			g2.clearRect(165,1000,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=80 && starttime <90) {
		  			for (int i = 0; i < nodeX1.length; i++) {
		  				g2.clearRect(nodeX1[4],nodeY1[4],width,height);
		  			}
		  			ce.drawImage(good, 0, 0);
		  		}if(starttime>=90 && starttime <100) {
		  			for (int i = 0; i < nodeX1.length; i++) {
		  				g2.clearRect(nodeX1[4],nodeY1[4],width,height);
		  			}
		  			g2.clearRect(165,0,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=100 && starttime <110) {
		  			for (int i = 0; i < nodeX1.length; i++) {
		  				g2.clearRect(nodeX1[1],nodeY1[1],width,height);
		  			}
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=110 && starttime <120) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=110 && starttime <120) {
		  			g3.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=120 && starttime <130) {
		  			g3.clearRect(0,1200,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=130 && starttime <140) {
		  			g3.clearRect(0,1200,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=140 && starttime <150) { //두번째 첫번째 노드
		  			g3.clearRect(0,1200,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=150 && starttime <160) {
		  			g3.clearRect(0,1200,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=160 && starttime <170) {
		  			g3.clearRect(0,250,160,80);
		  		}
		  		if(starttime>=170 && starttime <180) {
		  			g3.clearRect(0,250,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=180 && starttime <190) {
		  			g3.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=190 && starttime <200) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}if(starttime>=210 && starttime <220) {
		  			g2.clearRect(165,1000,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=220 && starttime <230) {
		  			g2.clearRect(165,1000,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=230 && starttime <240) {
		  			g2.clearRect(165,1000,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=240 && starttime <250) {
		  			g2.clearRect(165,1000,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=250 && starttime <260) {
		  			g2.clearRect(165,1000,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=260 && starttime <270) {
		  			g2.clearRect(165,0,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}if(starttime>=270 && starttime <270) {
		  			g2.clearRect(165,0,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=280 && starttime <290) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=290 && starttime <300) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=300 && starttime <310) {
		  			g3.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=310 && starttime <320) {
		  			g3.clearRect(0,1200,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=320 && starttime <330) {
		  			g3.clearRect(0,1200,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=330 && starttime <340) { //두번째 첫번째 노드
		  			g3.clearRect(0,1200,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=340 && starttime <350) {
		  			g3.clearRect(0,1200,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=350 && starttime <360) {
		  			g3.clearRect(0,250,160,80);
		  		}
		  		if(starttime>=360 && starttime <370) {
		  			g3.clearRect(0,250,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=370 && starttime <380) {
		  			g3.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=380 && starttime <390) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=390 && starttime <400) {
		  			g2.clearRect(165,1000,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=400 && starttime <410) {
		  			g2.clearRect(165,1000,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=410 && starttime <420) {
		  			g2.clearRect(165,1000,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=420 && starttime <430) {
		  			g2.clearRect(165,1000,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=430 && starttime <440) {
		  			g2.clearRect(165,1000,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=440 && starttime <430) {
		  			g2.clearRect(165,1000,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=430 && starttime <440) {
		  			g2.clearRect(165,0,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}if(starttime>=440 && starttime <450) {
		  			g2.clearRect(165,0,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=450 && starttime <460) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=460 && starttime <470) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=470 && starttime <480) {
		  			g3.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=490 && starttime <500) {
		  			g3.clearRect(0,1200,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=500 && starttime <510) {
		  			g3.clearRect(0,1200,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=510 && starttime <520) { //두번째 첫번째 노드
		  			g3.clearRect(0,1200,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=530 && starttime <540) {
		  			g3.clearRect(0,1200,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=540 && starttime <550) {
		  			g3.clearRect(0,250,160,80);
		  		}
		  		if(starttime>=550 && starttime <560) {
		  			g3.clearRect(0,250,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=560 && starttime <570) {
		  			g3.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=570 && starttime <580) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=580 && starttime <590) {
		  			g2.clearRect(165,1000,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=590 && starttime <600) {
		  			for (int i = 0; i < nodeX1.length; i++) {
		  				g2.clearRect(nodeX1[0],nodeY1[0],width,height);
		  			}
		  		//	g2.clearRect(165,1000,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		
		  		BlackBtn1.setOpacity(0);
		  		BlackBtn1.setVisible(true);
		  	}
		  	else if(event.getCode() == KeyCode.NUMPAD4) {
		  		if(starttime<=100 && starttime <200) {
		  			Hps.clearRect(55, 0, 50, 720);
		    		Hps.drawImage(process2, 55, 0,50,720);
		  		}
		  		else if(starttime<=200 && starttime <300) {
		  			Hps.clearRect(55, 0, 50, 720);
		    		Hps.drawImage(process3, 55, 0,50,720);
		  		}
		  		else if(starttime<=300 && starttime <400) {
		  			Hps.clearRect(55, 0, 50, 720);
		    		Hps.drawImage(process4, 55, 0,50,720);
		  		}
		  		else if(starttime<=400 && starttime <500) {
		  			Hps.clearRect(55, 0, 50, 720);
		    		Hps.drawImage(process5, 55, 0,50,720);
		  		}
		  		else if(starttime<=500 && starttime <600) {
		  			Hps.clearRect(55, 0, 50, 720);
		    		Hps.drawImage(process6, 55, 0,50,720);
		  		}
		  		if(hp == 4) {
		    		Hps.clearRect(0, 0, 50, 720);
		    		Hps.drawImage(Hp4, 0, 0,50,720);
		    	}
		    	if(hp <= 3) {
		    		Hps.clearRect(0, 0, 50, 720);
		    		Hps.drawImage(Hp3, 0, 0,50,720);
		    	}
		    	if(hp <= 2) {
		    		Hps.clearRect(0, 0, 50, 720);
		    		Hps.drawImage(Hp2, 0, 0,50,720);
		    	}
		    	if(hp <= 1) {
		    		Hps.clearRect(0, 0, 50, 720);
		    		Hps.drawImage(Hp1, 0, 0,50,720);
		    	}
		    	if(hp <= 0) {
		    		Hps.clearRect(0, 0, 50, 720);
		    		selection.close();
		    		fale.start();
		    		TranslateTransition aa = new TranslateTransition();
		    		aa.setNode(Reset);
		    		aa.setDuration(Duration.seconds(2));		
		    		aa.setToY(400);
		    		aa.setCycleCount(1);
		    		aa.play();
		    		TranslateTransition a1 = new TranslateTransition();
		    		a1.setNode(home);
		    		a1.setDuration(Duration.seconds(2));		
		    		a1.setToY(400);
		    		a1.setCycleCount(1);
		    		a1.play();
		    	}
		  		if(starttime>=20 && starttime <30) {
		  			g2.clearRect(330,850,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=30 && starttime <40) {
		  			g2.clearRect(330,850,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=40 && starttime <50) {
		  			g2.clearRect(330,850,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=50 && starttime <60) {
		  			g2.clearRect(330,850,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=60 && starttime <70) {
		  			g2.clearRect(330,850,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=70 && starttime <80) {
		  			g2.clearRect(330,850,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=80 && starttime <90) {
		  			g2.clearRect(330,850,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=90 && starttime <100) {
		  			g2.clearRect(330,850,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=100 && starttime <110) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=110 && starttime <120) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=110 && starttime <120) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=120 && starttime <130) {
		  			g2.clearRect(0,1200,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=130 && starttime <140) {
		  			g2.clearRect(0,1200,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=140 && starttime <150) {
		  			g2.clearRect(0,1200,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=150 && starttime <160) {
		  			g2.clearRect(0,1200,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=160 && starttime <170) {
		  			g2.clearRect(0,250,160,80);
		  		}
		  		if(starttime>=170 && starttime <180) {
		  			g2.clearRect(0,250,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=180 && starttime <190) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=190 && starttime <200) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		WhiteBtn2.setOpacity(0);
		  	}
			else if(event.getCode() == KeyCode.NUMPAD5) {
				BlackBtn2.setOpacity(0);
				if(starttime<=100 && starttime <200) {
		  			Hps.clearRect(55, 0, 50, 720);
		    		Hps.drawImage(process2, 55, 0,50,720);
		  		}
		  		else if(starttime<=200 && starttime <300) {
		  			Hps.clearRect(55, 0, 50, 720);
		    		Hps.drawImage(process3, 55, 0,50,720);
		  		}
		  		else if(starttime<=300 && starttime <400) {
		  			Hps.clearRect(55, 0, 50, 720);
		    		Hps.drawImage(process4, 55, 0,50,720);
		  		}
		  		else if(starttime<=400 && starttime <500) {
		  			Hps.clearRect(55, 0, 50, 720);
		    		Hps.drawImage(process5, 55, 0,50,720);
		  		}
		  		else if(starttime<=500 && starttime <600) {
		  			Hps.clearRect(55, 0, 50, 720);
		    		Hps.drawImage(process6, 55, 0,50,720);
		  		}
		  		if(hp == 4) {
		    		Hps.clearRect(0, 0, 50, 720);
		    		Hps.drawImage(Hp4, 0, 0,50,720);
		    	}
		    	if(hp <= 3) {
		    		Hps.clearRect(0, 0, 50, 720);
		    		Hps.drawImage(Hp3, 0, 0,50,720);
		    	}
		    	if(hp <= 2) {
		    		Hps.clearRect(0, 0, 50, 720);
		    		Hps.drawImage(Hp2, 0, 0,50,720);
		    	}
		    	if(hp <= 1) {
		    		Hps.clearRect(0, 0, 50, 720);
		    		Hps.drawImage(Hp1, 0, 0,50,720);
		    	}
		    	if(hp <= 0) {
		    		Hps.clearRect(0, 0, 50, 720);
		    		selection.close();
		    		fale.start();
		    		TranslateTransition aa = new TranslateTransition();
		    		aa.setNode(Reset);
		    		aa.setDuration(Duration.seconds(2));		
		    		aa.setToY(400);
		    		aa.setCycleCount(1);
		    		aa.play();
		    		TranslateTransition a1 = new TranslateTransition();
		    		a1.setNode(home);
		    		a1.setDuration(Duration.seconds(2));		
		    		a1.setToY(400);
		    		a1.setCycleCount(1);
		    		a1.play();
		    	}
				if(starttime>=20 && starttime <30) {
		  			g2.clearRect(495,600,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=30 && starttime <40) {
		  			g2.clearRect(495,600,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=40 && starttime <50) {
		  			g2.clearRect(495,600,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=50 && starttime <60) {
		  			g2.clearRect(495,600,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=60 && starttime <70) {
		  			g2.clearRect(495,600,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=70 && starttime <80) {
		  			g2.clearRect(495,600,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=80 && starttime <90) {
		  			g2.clearRect(495,600,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=90 && starttime <100) {
		  			g2.clearRect(495,600,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=100 && starttime <110) {
		  			g2.clearRect(495,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=110 && starttime <120) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=110 && starttime <120) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=120 && starttime <130) {
		  			g2.clearRect(0,1200,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=130 && starttime <140) {
		  			g2.clearRect(0,1200,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=140 && starttime <150) {
		  			g2.clearRect(0,1200,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=150 && starttime <160) {
		  			g2.clearRect(0,1200,160,80);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=160 && starttime <170) {
		  			g2.clearRect(0,250,160,80);
		  		}
		  		if(starttime>=170 && starttime <180) {
		  			g2.clearRect(0,250,160,80);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		if(starttime>=180 && starttime <190) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(bad, 0, 0);
		  		}
		  		if(starttime>=190 && starttime <200) {
		  			g2.clearRect(0,250,160,80);
		  			g2.clearRect(0,700,85,60);
		  			ce.drawImage(good, 0, 0);
		  		}
		  		BlackBtn2.setVisible(true);
		  	}

	    }
	  @FXML
	    void WhiteGather(KeyEvent event) {
	    	if(event.getCode() == KeyCode.A) {

	    		BlackBtn1.setOpacity(100);    		
	    		if(starttime<=600) {
		  			ce.clearRect(0, 0,300,250);
		  		}
	    		WhiteBtn1.setOpacity(100);
		  	}
		  	else if(event.getCode() == KeyCode.S) {
		  		if(starttime<=600) {
		  			ce.clearRect(0, 0,300,250);
		  		}
		  		BlackBtn1.setOpacity(100);
		  	}
		  	else if(event.getCode() == KeyCode.NUMPAD4) {
		  		if(starttime<=600) {
		  			ce.clearRect(0, 0,300,250);
		  		}
		  		WhiteBtn2.setOpacity(100);
		  	}
			else if(event.getCode() == KeyCode.NUMPAD5) {
				if(starttime<=600) {
		  			ce.clearRect(0, 0,300,250);
		  		}
				WhiteBtn1.setOpacity(100);
				BlackBtn2.setOpacity(100);
		  	}
	    	
			

	    }
    
	  int[] nodeX1 = {330,165,0,330,165,0,330,165,0,330,165,0};
	  int[] nodeY1 = {0,60,210,360,510,660,810,960,1110,1260,1410,1560};
	  
	  int[] nodeX2 = {0,330,495,165,165,495,0};
	  int[] nodeY2 = {0,250,400,600,850,1000,1200};
	  
	  int[] nodeX3 = {0,165,495,0,165,495,165};
	  int[] nodeY3 = {0,250,400,600,850,1000,1200};
	  
	  int[] nodeX4 = {0,0,330,496,165,165,496,330};
	  int[] nodeY4 = {0,250,400,600,850,1000,1200,1300};
	  
	  int[] nodeX5 = {0,0,330,496,165,165,496,330};
	  int[] nodeY5 = {0,250,400,600,850,1000,1200,1300};
	  
	  int[] nodeX6 = {0,0,330,496,165,165,496,330};
	  int[] nodeY6 = {0,250,400,600,850,1000,1200,1300};
	  
	  int[] nodeX7 = {0,0,330,496,165,165,496,330};
	  int[] nodeY7 = {0,250,400,600,850,1000,1200,1300};
	  
	  int[] nodeX8 = {0,0,330,496,165,165,496,330};
	  int[] nodeY8 = {0,250,400,600,850,1000,1200,1300};
	  
	  
    // 112 277 442 608
	// 0   165 330 496
    private void draw() {
	 	Hps.drawImage(Hp5, 0, 0,50,720);
	 	Hps.drawImage(process, 55, 0,50,720);
	    backgd.drawImage(easy, 0, 0,664,720);
		TranslateTransition tt = new TranslateTransition();
		
		for (int i = 0; i < nodeX1.length; i++) {
			g2.drawImage(image9, nodeX1[i],nodeY1[i],width,height);
		}
		
		tt.setNode(canvas2);
		tt.setDuration(Duration.seconds(10));		
		tt.setToY(2100);
		tt.setCycleCount(1);
		tt.play();
		if(hp <=0) {
			tt.stop();
		}
		TranslateTransition t1 = new TranslateTransition();
		for (int i = 0; i < nodeX2.length; i++) {
			g3.drawImage(image9, nodeX2[i],nodeY2[i],width,height);
		}
		t1.setDelay(Duration.seconds(7));
		t1.setNode(canvas3);
		t1.setDuration(Duration.seconds(10));		
		t1.setToY(2100);
		t1.setCycleCount(1);
		t1.play();
		if(hp <=0) {
			tt.stop();
		}
		TranslateTransition t2 = new TranslateTransition();
		for (int i = 0; i < nodeX3.length; i++) {
			g4.drawImage(image9, nodeX3[i],nodeY3[i],width,height);
		}
		t2.setDelay(Duration.seconds(14));
		t2.setNode(canvas4);
		t2.setDuration(Duration.seconds(10));		
		t2.setToY(2100);
		t2.setCycleCount(1);
		t2.play();
		TranslateTransition t3 = new TranslateTransition();
		for (int i = 0; i < nodeX4.length; i++) {
			g5.drawImage(image9, nodeX4[i],nodeY4[i],width,height);
		}
		t3.setDelay(Duration.seconds(21));
		t3.setNode(canvas5);
		t3.setDuration(Duration.seconds(10));		
		t3.setToY(2100);
		t3.setCycleCount(1);
		t3.play();
		TranslateTransition t4 = new TranslateTransition();
		for (int i = 0; i < nodeX5.length; i++) {
			g6.drawImage(image9, nodeX5[i],nodeY5[i],width,height);
		}
		t4.setDelay(Duration.seconds(28));
		t4.setNode(canvas6);
		t4.setDuration(Duration.seconds(10));		
		t4.setToY(2100);
		t4.setCycleCount(1);
		t4.play();
		TranslateTransition t5 = new TranslateTransition();
		for (int i = 0; i < nodeX6.length; i++) {
			g7.drawImage(image9, nodeX6[i],nodeY6[i],width,height);
		}
		t5.setDelay(Duration.seconds(35));
		t5.setNode(canvas7);
		t5.setDuration(Duration.seconds(10));		
		t5.setToY(2100);
		t5.setCycleCount(1);
		t5.play();
		TranslateTransition t6 = new TranslateTransition();
		for (int i = 0; i < nodeX7.length; i++) {
			g8.drawImage(image9, nodeX7[i],nodeY7[i],width,height);
		}
		t6.setDelay(Duration.seconds(42));
		t6.setNode(canvas8);
		t6.setDuration(Duration.seconds(10));		
		t6.setToY(2100);
		t6.setCycleCount(1);
		t6.play();
		TranslateTransition t7 = new TranslateTransition();
		for (int i = 0; i < nodeX8.length; i++) {
			g9.drawImage(image9, nodeX8[i],nodeY8[i],width,height);
		}
		t7.setDelay(Duration.seconds(49));
		t7.setNode(canvas9);
		t7.setDuration(Duration.seconds(10));		
		t7.setToY(2100);
		t7.setCycleCount(1);
		t7.play();
		System.out.println(starttime);
	}
}
