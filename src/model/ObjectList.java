package model;

import java.util.Collections;
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
	
	//intente hacer un Sort pero confundi algunas variables y no supe ejecutarlo.
	/*public void SortBy(char key) {

		switch (key) {

		case 'r':

			Collections.sort(objectList);

			for (int i = 0; i < objectList.size(); i++) {

				String time = objectList.get(i).getTime();
				String hour = objectList.get(i).getHour();
				String date = objectList.get(i).getDate();
			

				String line = time + "," + hour + "," + date + "," ;
				btime[i] = line;

				app.saveStream(app.dataPath("ByTime.txt"), time);
			}

			break;
		case 'n':

			Collections.sort(objectList, bhour);

			for (int i = 0; i < objectList.size(); i++) {

				String time = objectList.get(i).getTime();
				String hour = objectList.get(i).getHour();
				String date = objectList.get(i).getDate();
			

				String line = time + "," + hour + "," + date + "," ;
				btime[i] = line;

				app.saveStrings(app.dataPath("ByHour.txt"), bhour);
			}

			break;

		case 'y':

			Collections.sort(objectList, bobject);
			for (int i = 0; i < objectList.size(); i++) {

				String time = objectList.get(i).getTime();
				String hour = objectList.get(i).getHour();
				String date = objectList.get(i).getDate();
			

				String line = time + "," + hour + "," + date + "," ;
				btime[i] = line;

				app.saveStrings(app.dataPath("ByDate.txt"), bobject);
			}
			break;
		}

	}*/
	
}
