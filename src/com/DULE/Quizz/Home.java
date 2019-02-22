package com.DULE.Quizz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

class dule extends Pitanje {
	public void test() {
		pitanje();
	}
}
public class Home extends Application {
	private static dule dusan=new dule();
	private static void prvo_pitanje() {
		dusan.test();
	}
	private static Stage stage;
	private static Scene scn;
	private static void home() {
		TextField ime=new TextField();
		ime.setPromptText("Unesite ime igraca...");
		ime.setStyle("-fx-font-size:21px;"
				+ "-fx-font-weight:bold;"
				+ "-fx-background-color:lightblue;");
		ime.setAlignment(Pos.CENTER);
		VBox vb=new VBox(20,ime);vb.setAlignment(Pos.CENTER);
		vb.setSpacing(10);vb.setPadding(new Insets(21));
		vb.setStyle("-fx-background-color:silver;");
		scn=new Scene(vb,400,100);
		ime.setOnKeyPressed(e->{
			switch (e.getCode()) {
			case ENTER:
				stage.setTitle("Quizz - "+ime.getText().toString());
				vb.setDisable(true);
				prvo_pitanje();
				stage.setScene(dusan.scene);
				stage.centerOnScreen();
				
				break;

			default:
				break;
			}
		});
	}
	private static void pocetak() {
		home();	
		stage.setScene(scn);
		stage.setTitle("Quizz");
		stage.show();
		stage.centerOnScreen();
	}
	@Override
	public void start(Stage stg) throws Exception{stage=stg;pocetak();}
	public static void main(String[] args) { launch(args); }	
}
