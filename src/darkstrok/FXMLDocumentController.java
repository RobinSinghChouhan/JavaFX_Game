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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

/**
 *
 * @author Asus
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    public TextField t1;
    public PasswordField t2;
    public CheckBox c1;
    public int count=0;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {   
    }
    
    public void display(ActionEvent event) throws IOException, InterruptedException
    {
         if(!c1.isSelected())
        {
            Notifications noti = Notifications.create()
                    .title("LOGIN")
                    .text("PLEASE SELECT CHECKBOX TO CONTINUE")
                    .graphic(null)
                    .hideAfter(Duration.seconds(1))
                    .position(Pos.CENTER);
            noti.darkStyle();
            noti.showError();
        }
        else if(t1.getText().equals("admin") && t2.getText().equals("admin") && c1.isSelected())
        {
            Image img = new Image("/tick.png");
            Notifications noti = Notifications.create()
                    .title("LOGIN")
                    .text("LOGGED IN SUCCESSFULLY")
                    .graphic(new ImageView(img))
                    .hideAfter(Duration.seconds(2))
                    .position(Pos.CENTER);
            noti.darkStyle();
            noti.show();         
            
                
        Parent pt = FXMLLoader.load(getClass().getResource("Scene.fxml"));
        Scene ps = new Scene(pt);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ps);
        window.show();    
        }
        else
        {
            Notifications noti = Notifications.create()
                    .title("LOGIN")
                    .text("INVALID CREDENTIALS")
                    .graphic(null)
                    .hideAfter(Duration.seconds(2))
                    .position(Pos.CENTER);
            noti.darkStyle();
            noti.showError();         
        }
    }
    public void EnterPass()
    {
        Notifications noti = Notifications.create()
                    .title("ERROR")
                    .text("PLEASE ENTER PASSWORD")
                    .graphic(null)
                    .hideAfter(Duration.seconds(1))
                    .position(Pos.CENTER);
            noti.darkStyle();
            noti.showError(); 
    }
    public void quit()
    {
        System.exit(0);
    }
    public void change(ActionEvent event) throws IOException
    {
        Parent pt = FXMLLoader.load(getClass().getResource("Scene.fxml"));
        Scene ps = new Scene(pt);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ps);
        window.show();
    }
    public void ZeroCross(ActionEvent event) throws IOException
    {
        Parent pt = FXMLLoader.load(getClass().getResource("ZeroCross.fxml"));
        Scene ps = new Scene(pt);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ps);
        window.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
}
