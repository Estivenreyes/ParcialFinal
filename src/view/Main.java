package view;

import java.util.ArrayList;

import exception.ExceptionLost;
import model.Car;
import model.MainCharacter;
import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(Main.class.getName());
	}
	
	int screen = 0;
	String [] arrayData;
	MainCharacter ball;
	
	ArrayList<Car> car = new ArrayList<Car>();

	public void settings() {
		size (800,600);
	}
	
	public void setup() {
		noStroke();
		textMode(CENTER);
		textAlign(CENTER);
		arrayData = loadStrings("../data/Data.txt");
		System.out.println(arrayData[0]);
	}
	
	public void draw() {
		background(0);
		switch(screen) {
		case 0:
			/*validateColision(car, ball.get());
			ball.draw();	
			for(int i = 0; i < car.size(); i++) {
				car.get(i).draw();
				car.get(i).run(); 
				try {
					if(car.get(i).getPosY()+84 > ball.getPosY()) {
						throw new ExceptionLost("Perdiste");
					}
				}catch(Exception e) {
					System.out.println(e.getMessage());
					screen = 2;
				}
				
			}*/
		break;
		
		//pantalla de gansate
		case 1:
			fill(255,168);
			rect(0, 0, width, height);
			fill(0);
			textSize(50);
			text("Felicidades, ganaste\nhas click y vuelve a jugar",width/2,height/2);
		break;
		
		//pantalla de perdiste
		case 2:
			fill(255,168);
			rect(0, 0, width, height);
			fill(0);
			textSize(50);
			text("Perdiste\nhas click y vuelve a jugar", width/2,height/2);
		break;
		
		//Pantalla de datos
		case 3:
			
		break;
		}
	}
	
	public void reload() {
		for (int i = 0; i < car.size(); i++) {
			car.remove(i);
		}
	}
	
	public void mousePressed() {
		switch(screen) {
		case 1:
			reload();
			screen = 0;
		break;
		
		case 2:
			reload();
			screen = 0;
		break;
		}
	}
	
}
