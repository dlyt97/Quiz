package com.DULE.Quizz;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

public class Pitanje {
	
	Label pitanje=new Label();
	RadioButton odg1=new RadioButton();
	RadioButton odg2=new RadioButton();
	RadioButton odg3=new RadioButton();
	ToggleGroup tGroup=new ToggleGroup();
	Button potvrdi=new Button("Dalje");
	VBox vBox;
	Scene scene;
	int poeni=0;
	
	void pitanje() {
		vBox=new VBox(20,pitanje,odg1,odg2,odg3,potvrdi);
		scene=new Scene(vBox,1280,720);
		
		// metthods
		vb_methods();
		prvo();
		label_methods();
		tg_methods();
		rb_methods();
		btn_methods();
	}
	
	void tg_methods() {
		odg1.setToggleGroup(tGroup);
		odg2.setToggleGroup(tGroup);
		odg3.setToggleGroup(tGroup);
	}
	
	void vb_methods() {
		vBox.setAlignment(Pos.CENTER);
	}
	
	void label_methods() {
		pitanje.setStyle
		("-fx-background-color:silver;"
	   + "-fx-font-size:35px;");
	}
	
	void rb_methods() {
		String style="-fx-background-color:lightgreen;"
				+ "-fx-font-size:25px;";
		odg1.setStyle(style);
		odg2.setStyle(style);
		odg3.setStyle(style);
		odg1.setText("a)");
		odg2.setText("b)");
		odg3.setText("c)");
	}
	
	void btn_methods() {
		String style="-fx-background-color:lightblue;"
				+ "-fx-font-size:25px;";
		potvrdi.setStyle(style);
	}
	
	public void prvo() {
		pitanje.setText("1) ");
		odg1.setText("a)");
		odg2.setText("b)");
		odg3.setText("c)");
		potvrdi.setOnAction(e->{ 
			if(odg1.isSelected()) {
				poeni+=5;
			}
			else if(odg2.isSelected()) {
				
			}
			else if(odg3.isSelected()) {
				
			}
			else {
				
			}
			drugo();
		});
	}
	
	public void drugo() {
		pitanje.setText("2) ");
		odg1.setText("a)");
		odg2.setText("b)");
		odg3.setText("c)");
		potvrdi.setOnAction(e->{ 
		if(odg1.isSelected()) {
			
		}
		else if(odg2.isSelected()) {
			poeni+=5;
		}
		else if(odg3.isSelected()) {
			
		}
		else {
			
		}
			trece();
		});
	}
	
	public void trece() {
		pitanje.setText("3) ");
		odg1.setText("a)");
		odg2.setText("b)");
		odg3.setText("c)");
		potvrdi.setOnAction(e->{ 
			if(odg1.isSelected()) {
				
			}
			else if(odg2.isSelected()) {
				
			}
			else if(odg3.isSelected()) {
				poeni+=5;
			}
			else {
				
			}
			cetvrto();
		});
	}
	
	public void cetvrto() {
		pitanje.setText("4) ");
		odg1.setText("a)");
		odg2.setText("b)");
		odg3.setText("c)");
		potvrdi.setOnAction(e->{ 
			if(odg1.isSelected()) {
				poeni+=5;
			}
			else if(odg2.isSelected()) {
				
			}
			else if(odg3.isSelected()) {
				
			}
			else {
				
			}
			peto();
		});
	}
	
	public void peto() {
		potvrdi.setText("Prikazi rezultat");
		pitanje.setText("5) ");
		odg1.setText("a)");
		odg2.setText("b)");
		odg3.setText("c)");
		potvrdi.setOnAction(e->{ 
			if(odg1.isSelected()) {
				
			}
			else if(odg2.isSelected()) {
				poeni+=5;
			}
			else if(odg3.isSelected()) {
				
			}
			else {
				
			}
			rezultat();
			potvrdi.setDisable(true);
		});
	}
	
	public void rezultat() {
		System.out.println("Zavrsili ste kviz :) \n"
				+"Imate "+poeni+" poena");
	}
	
}
