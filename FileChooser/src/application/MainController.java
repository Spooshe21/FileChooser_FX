/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  File chooser example with JavaFX
 *   Project:  JavaFX File Chooser
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:      Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

package application;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

/**
 * MainController is the controller class for handling file chooser operations
 * in the JavaFX application. It allows users to select single or multiple PDF
 * files from their system and displays the selected file names in a ListView.
 **/

public class MainController {

	@FXML
	private Button btn1; // Button to trigger single file selection

	@FXML
	private Button btn2; // Button to trigger multiple file selection

	@FXML
	private ListView<String> listview; // ListView to display selected file names

	/**
	 * Handles the action of Button1 to select a single file
	 * 
	 * @param event The ActionEvent triggered by Button1
	 */
	public void Button1Action(ActionEvent event) {
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File("C:\\Program Files\\Git"));
		fc.getExtensionFilters().addAll(new ExtensionFilter("PDF Files", "*.pdf"));
		File selectedFile = fc.showOpenDialog(null);

		if (selectedFile != null) {
			listview.getItems().add(selectedFile.getName());
		} else {
			System.out.println("File is not valid");
		}
	}

	/**
	 * Handles the action of Button2 to select multiple files
	 * 
	 * @param event The ActionEvent triggered by Button2
	 */
	public void Button2Action(ActionEvent event) {
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File("C:\\Program Files\\Git"));
		fc.getExtensionFilters().addAll(new ExtensionFilter("PDF Files", "*.pdf"));
		List<File> selectedFiles = fc.showOpenMultipleDialog(null);

		if (selectedFiles != null) {
			for (File file : selectedFiles) {
				listview.getItems().add(file.getName());
			}
		} else {
			System.out.println("Files are not valid");
		}
	}
}
