package application;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SampleController implements Initializable{
	Music introMusic = new Music("introMusic.mp3",true);
    @FXML
    private ImageView imageview;
    @FXML
    private Text Maintext;

    @FXML
    private Button StartBtn;

    @FXML
    private Button ExitBtn;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Image image = new Image("Images/StartBackground.jpg");
		imageview.setImage(image);	
		introMusic.start();
		
	}
    @FXML
    void PlayBtn(ActionEvent event) throws IOException {
    	Parent root2 = FXMLLoader.load(getClass().getResource("fxml2.fxml"));
   		Scene scene2 = new Scene(root2);
   		Stage primaryStage = new Stage();
    	primaryStage.setScene(scene2);
    	primaryStage.show();   
    	introMusic.close();
    //	imageview.setVisible(false);
  //  	Image image2 = new Image("Images/Background2.jpg");
  //  	imageview.setImage(image2);
  //  	Maintext.setVisible(false);
  //  	StartBtn.setVisible(false);
 //   	ExitBtn.setVisible(false);
    	
    	
    }



}
