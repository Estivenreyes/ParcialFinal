package model;

import processing.core.PApplet;

public class Car implements Runnable{
	
	protected int posX;
	protected int posY;
	protected int speed;
	
	protected PApplet app;
	
	public Car (int posX, int posY, int speed, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.speed = speed;
		this.app = app;
		
	}
	
	public void draw() {
		app.rect(0, 0,posX, posY);
	}
	
	public void move() {
		
	}

	public int getPosX() {
		return posX;
	}



	public void setPosX(int posX) {
		this.posX = posX;
	}



	public int getPosY() {
		return posY;
	}



	public void setPosY(int posY) {
		this.posY = posY;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
