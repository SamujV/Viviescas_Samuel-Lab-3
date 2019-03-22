package ui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;

public class PackManController implements Initializable {

	@FXML
	private Pane Pane;

	@FXML
	private MenuBar MenuBar;

	@FXML
	private MenuItem LoadGame;

	@FXML
	private MenuItem SaveGame;

	@FXML
	private MenuItem BestScores;

	@FXML
	private MenuItem WhatIsThis;

	@FXML
	void CloseApp(ActionEvent event) {

		System.exit(0);

	}

	@FXML
	void Load(ActionEvent event) {

	}

	@FXML
	void Save(ActionEvent event) {

	}

	@FXML
	void Scores(ActionEvent event) {

	}

	@FXML
	void WhatIsThis(ActionEvent event) {

	}



	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}
	@FXML
	void click(MouseEvent event) {
		double x = event.getX();
		double y = event.getY();



		Circle circle = new Circle();
		circle.setRadius(5);
		circle.setLayoutX(x+10);
		circle.setLayoutY(y-25);
		circle.setFill(Color.BLACK);


		Arc arco = new Arc();
		arco.setType(ArcType.ROUND);
		arco.setRadiusX(50);
		arco.setRadiusY(50);
		arco.setLayoutX(x);
		arco.setLayoutY(y);	
		arco.setStartAngle(45);
		arco.setLength(270);
		arco.setFill(Color.YELLOW);
		arco.setStroke(Color.BLACK);
		arco.setStrokeWidth(5);


		Pane.getChildren().addAll( arco, circle);



	}


}
