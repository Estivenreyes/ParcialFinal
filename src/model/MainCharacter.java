package model;

import processing.core.PApplet;

public class MainCharacter {

	private float posX;
	private float posY;
	
	private PApplet app;
	
	public MainCharacter(float posX, float posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.app = app;
	}
	
	public void draw() {
		app.ellipse(400, 20, posX,posY); 
	}
	
	
	
	public float getPosX() {
		return posX;
	}

	public void setPosX(float posX) {
		this.posX = posX;
	}

	public float getPosY() {
		return posY;
	}

	public void setPosY(float posY) {
		this.posY = posY;
	}

	public void move (int keyCode) {
		switch(keyCode) {
		
		case 38:
			if(this.posX+100 < 20) {
				posX += 100;
			}
			
		break;
		case 40:
			if(this.posX-100 > 0) {
				posX -= 100;
				
			}
			
		}
		
	}
	
}
