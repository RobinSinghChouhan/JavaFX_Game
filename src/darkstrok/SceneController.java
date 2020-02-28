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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import static testing.mainClass.correct;
import static testing.mainClass.count;
import static testing.mainClass.incorrect;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class SceneController implements Initializable {

    public Label l1;
    public Label l2;
    public Label l3;
    public Button b1;
    public Button b2;
    public Button b3;
    public Button b4;
    public int d=0;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        int a=(int)(Math.random()*10);
        l1.setText(a+"");
        int b=(int)(Math.random()*10);
        l3.setText(b+"");
        int c=(int)(Math.random()*4);
        //int c=0;
        switch(c)
        {
            case 0: l2.setText("+");
                    d=a+b;
                    break;
            case 1: l2.setText("-");
                    d=a-b;
                    break;
            case 2: l2.setText("*");
                    d=a*b;
                    break;
            case 3: l2.setText("/");
                    d=a/b;
                    break;
            case 4: l2.setText("%");
                    d=a%b;
                    break;
        }
        int ans=(int)(Math.random()*3);
        switch(ans)
        {
            case 0: 
        b1.setText(d+"");
        b2.setText((d-10)+"");
        b3.setText(d+10+"");
        b4.setText(d+1+"");
        break;
        case 1: 
        b2.setText(d+"");
        b1.setText((d-10)+"");
        b3.setText(d+10+"");
        b4.setText(d+1+"");
        break;
        case 2: 
        b3.setText(d+"");
        b2.setText((d-10)+"");
        b1.setText(d+10+"");
        b4.setText(d+1+"");
        break;
        case 3: 
        b4.setText(d+"");
        b2.setText((d-10)+"");
        b3.setText(d+10+"");
        b1.setText(d+1+"");
        break;
        }            
    }    
    @FXML
    public void nextQ2(ActionEvent event) throws IOException
    {   
        if(count<10)
        {
        Button bt=(Button)event.getSource();
        String s1=bt.getText();
        if(s1.equals(""+d))
        {
            correct=correct+1;
        }
        else
        {
            incorrect=incorrect+1;
        }
        Parent pt = FXMLLoader.load(getClass().getResource("Scene.fxml"));
        Scene ps = new Scene(pt);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ps);
        window.show();
        count=count+1;
        }
        else
        {
        Parent pt = FXMLLoader.load(getClass().getResource("Thanks.fxml"));
        Scene ps = new Scene(pt);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ps);
        window.show();
        }
    }
}
