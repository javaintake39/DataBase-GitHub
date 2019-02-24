/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasourceemployee;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Abdelrhman
 */
public class DataSourceEmployee extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        FXMLBase root = new FXMLBase();
        
        Scene scene = new Scene(root, 700, 500);
        
        primaryStage.setTitle("Employee Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
