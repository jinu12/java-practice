package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Controller2 implements Initializable {
	Music SelectedMusic = new Music("selection1.mp3",true);
	Music SelectedMusic2 = new Music("selection2.mp3",true);
	Image image = new Image("Images/Background2.jpg");
	Image image2 = new Image("Images/selection1.jpg");
	Image image3 = new Image("Images/RightBtn.png");
	Image image4 = new Image("Images/LeftBtn.png");
	Image image5 = new Image("Images/EasyText.png");
	Image image6 = new Image("Images/HardText.png");
    @FXML
    private ImageView imageview2;

    @FXML
    private Canvas canvas;
    
    @FXML
    private ImageView NextBtn;
    
    @FXML
    private ImageView EasyBtn;

    @FXML
    private ImageView HardBtn;

    @FXML
    private ImageView PreviewBtn1;
    

    GraphicsContext gc;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		gc = canvas.getGraphicsContext2D();
		imageview2.setImage(image);
		gc.drawImage(image2, 0, 0,200,200);
		NextBtn.setImage(image3);
		SelectedMusic.start();
		PreviewBtn1.setImage(image4);
		EasyBtn.setImage(image5);
		HardBtn.setImage(image6);
	}
	@FXML
    void Next(MouseEvent event) {
		SelectedMusic.close();
		Image image = new Image("Images/Background.jpg");
		gc.drawImage(image,0, 0,200,200);
		SelectedMusic2.start();
    }
	@FXML
    void PreivewBtm(MouseEvent event) {
		SelectedMusic2.close();
		Image image = new Image("Images/Background.jpg");
		gc.drawImage(image,0, 0,200,200);
		SelectedMusic.start();
    }
    @FXML
    void Easy(MouseEvent event) throws IOException{
    	SelectedMusic.close();
    	Parent root2 = FXMLLoader.load(getClass().getResource("EasyMode.fxml"));
   		Scene scene2 = new Scene(root2);
   		Stage primaryStage = new Stage();
    	primaryStage.setScene(scene2);
    	primaryStage.show();   
    }

    @FXML
    void Hard(MouseEvent event) {
    	
    }


	

}
