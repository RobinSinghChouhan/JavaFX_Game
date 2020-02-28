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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */

public class ZeroCrossController implements Initializable {

    /**
     * Initializes the controller class.
     */
    public Button b1;
    public Button b2;
    public Button b3;
    public Button b4;
    public Button b5;
    public Button b6;
    public Button b7;
    public Button b8;
    public Button b9;
    public Label l1;
    public int i=0;
    public int status=0;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void buttonclicked(ActionEvent event) throws IOException
    {
     String a1="ZERO";
     String b11="CROSS";
     Button bt=(Button)event.getSource();
   if(status == 0)
     if(i%2==0 && status==0)
        {
           bt.setText(a1);
           bt.setStyle("-fx-background-color: #f6f688");
           System.out.println("first click");
           
        }
        else if((i%2)!=0 && status==0)
        {
            bt.setText(b11);
            bt.setStyle("-fx-background-color: #b2b2b2");
            System.out.println("second click");
            
        }
        if(status==0)
        {
        if((b1.getText().equals(a1) && b2.getText().equals(a1) && b3.getText().equals(a1)) ||
                (b1.getText().equals(a1) && b5.getText().equals(a1) && b9.getText().equals(a1)) ||
                (b4.getText().equals(a1) && b5.getText().equals(a1) && b6.getText().equals(a1)) ||
                (b7.getText().equals(a1) && b8.getText().equals(a1) && b9.getText().equals(a1)) ||
                (b3.getText().equals(a1) && b5.getText().equals(a1) && b7.getText().equals(a1)) ||
                (b1.getText().equals(a1) && b4.getText().equals(a1) && b7.getText().equals(a1)) ||
                (b2.getText().equals(a1) && b5.getText().equals(a1) && b8.getText().equals(a1)) ||
                (b3.getText().equals(a1) && b6.getText().equals(a1) && b9.getText().equals(a1)))
        {
            System.out.println("Player 1 wins!!!!");
            status=1;
            l1.setText("Player 1 wins!!!!");
        }
        else if((b1.getText().equals(b11) && b2.getText().equals(b11) && b3.getText().equals(b11)) ||
                (b1.getText().equals(b11) && b5.getText().equals(b11) && b9.getText().equals(b11)) ||
                (b4.getText().equals(b11) && b5.getText().equals(b11) && b6.getText().equals(b11)) ||
                (b7.getText().equals(b11) && b8.getText().equals(b11) && b9.getText().equals(b11)) ||
                (b3.getText().equals(b11) && b5.getText().equals(b11) && b7.getText().equals(b11)) ||
                (b1.getText().equals(b11) && b4.getText().equals(b11) && b7.getText().equals(b11)) ||
                (b2.getText().equals(b11) && b5.getText().equals(b11) && b8.getText().equals(b11)) ||
                (b3.getText().equals(b11) && b6.getText().equals(b11) && b9.getText().equals(b11)))
        {
            System.out.println("Player 2 wins!!!");
            status=1;
            l1.setText("Player 2 wins!!!!");
        }
        
        }
        i++;
    }
    public void playagain(ActionEvent event) throws IOException
    {
        System.out.println("Play Again");
        Parent pt=FXMLLoader.load(getClass().getResource("ZeroCross.fxml"));
        Scene ps=new Scene(pt);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ps);
        window.show();
    }
    
}
