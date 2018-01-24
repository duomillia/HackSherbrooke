package ca.hacksherbrooke.backend;

import java.util.ArrayList;

import ca.hacksherbrooke.backend.data.EventDataObject;
import ca.hacksherbrooke.backend.dataManager.DataManager;

public class driver {

	public static void main(String args[])
	{
		//ArrayList<EventDataObject> al = DataManager.getListOfEvents();
		ArrayList<EventDataObject> ar = DataManager.getListOfEvents();
		
		System.out.println("success");
	}
	
}
