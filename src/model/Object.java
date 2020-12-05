package model;

import processing.core.PApplet;

public class Object {
	
	private String object;
	private int dir, posX, posY;
	
	private PApplet app;
	
	public Object (String object, int dir, int posX, int posY, PApplet app) {
		this.object = object;
		this.dir = dir;
		this.posX = posX;
		this.posY = posY;
		this.app = app;
	}
	
	public void draw (int posX, int posY) {
		app.text(object, posX, posY);
		
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public int getDir() {
		return dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
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

}
