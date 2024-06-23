/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Load and display a JavaFX application using FXML
 *   Project:  JavaFX FXML Loader
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:      Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			// Load the FXML file
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));

			// Create a scene with the loaded FXML file
			Scene scene = new Scene(root, 400, 400);

			// Add the CSS file to the scene
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			// Set the scene to the stage
			primaryStage.setScene(scene);

			// Show the stage
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
