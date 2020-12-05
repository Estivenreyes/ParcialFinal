package model;

import java.util.LinkedList;

import processing.core.PApplet;

public class ObjectList {
	
	String[] bobject, btime, bhour;
	private int dir, time, posX, posY;
	SortByDate byDate;
	SortByHour byHour;
	SortByTime byTime;
	
	private PApplet app;
	private LinkedList<Object> objectList;
	
	public ObjectList(PApplet app) {
		this.app = app;
		byDate = new SortByDate();
		byHour = new SortByHour();
		byTime = new SortByTime();
		
		bobject = new String [4];
		btime = new String [4];
		bhour = new String [4];
	}
	
}
