/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkstrok;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;
import static testing.mainClass.correct;
import static testing.mainClass.count;
import static testing.mainClass.incorrect;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class ThanksController implements Initializable {

    /**
     * Initializes the controller class.
     */
    public Label l1;
    public Label label;
    public Button button;
    public ProgressIndicator pb;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        System.out.println(correct);
        label.setText(""+correct);
        double value=(double)correct/10.0;
        //System.out.println(value);
        pb.setStyle("-fx-accent: #f6f688");
        
        pb.setProgress(value);
        count=1;
        correct=0;
        incorrect=0;   
    }    
    public void Quit(ActionEvent event) throws IOException
    {   
       // System.exit(0);
        Parent pt = FXMLLoader.load(getClass().getResource("ThanksKashish.fxml"));
        Scene ps = new Scene(pt);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ps);
        window.show();
    }
    public void PlayAgain(ActionEvent event) throws IOException
    {
        Parent pt = FXMLLoader.load(getClass().getResource("Scene.fxml"));
        Scene ps = new Scene(pt);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ps);
        window.show();
    }
}
