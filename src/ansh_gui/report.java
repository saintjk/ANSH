/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ansh_gui;

import javafx.application.Application;
import javafx.scene.Scene;

import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class report extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}
@Override
	public void start(Stage stage) throws Exception {
		WebView myWebView = new WebView();
		WebEngine engine = myWebView.getEngine();
		engine.load("http://172.31.15.127/img/");
            engine.setUserAgent("Mozilla/5.0 (Linux; U; Android 3.2.1; en-us; Nexus One Build/FRG83) AppleWebKit/555.9 (KHTML, like Gecko) Version/4.0 Mobile Safari/555.9");

		
		VBox root = new VBox();
		root.getChildren().add( myWebView);
		
		Scene scene = new Scene(root, 800, 600);
		stage.setScene(scene);
                               
		stage.setTitle("Report");
		stage.show();
	}

}