package model;

import processing.core.PApplet;

public class Object {
	
	private String object;
	private String time, hour, date;
	private int dir, posX, posY;
	
	private PApplet app;
	
	public Object (String object, int dir, int posX, int posY, String time,String hour, String date, PApplet app) {
		this.object = object;
		this.dir = dir;
		this.posX = posX;
		this.posY = posY;
		this.app = app;
		this.time = time;
		this.hour = hour;
		this.date = date;
	}
	
	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
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
