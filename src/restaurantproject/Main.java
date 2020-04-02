/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantproject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import javafx.application.Application;
import javafx.stage.Stage;

import javax.xml.bind.JAXBException;

/**
 *
 * @author MIX
 */
public class Main extends Application {

    private static Stage window;

    public static Stage getWindow() {
        return window;
    }

    public static void setWindow(Stage window) {
        Main.window = window;
    }

    public static void main(String args[]) throws JAXBException {

       //InputStream in = Main.class.getResourceAsStream("file:///C:/Users/MIX/Documents/NetBeansProjects/RestaurantProject/input.xml");
        Reader fileReader = null;

        InputStream in = Main.class.getClassLoader().getResourceAsStream("/input.xml");
        if (null != in) {
            fileReader = new InputStreamReader(in);
        }

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Restaurant");
        window = primaryStage;
        GUI gui = new GUI();
        gui.prepareScene();
        primaryStage.setScene(gui.getScene());
        primaryStage.show();

    }

}
