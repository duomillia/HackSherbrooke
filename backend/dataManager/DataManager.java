package ca.hacksherbrooke.backend.dataManager;

import java.util.ArrayList;

import ca.hacksherbrooke.backend.data.EventDataObject;
import ca.hacksherbrooke.backend.data.RealTimeEventsDataObject;
import ca.hacksherbrooke.backend.data.RestaurantsInfoDataObject;
import ca.hacksherbrooke.backend.data.ZapDataObject;
import ca.hacksherbrooke.backend.dataConverter.RealTimeDataConverterObject;
import ca.hacksherbrooke.backend.dataConverter.RestaurantInfoDataConverter;
import ca.hacksherbrooke.backend.dataConverter.ZapDataConverter;
import ca.hacksherbrooke.backend.dataReader.WebRestaurantsReader;

/**
 * This is the principal class of the API for accessing
 * and processing web service data.
 * 
 * 
 * */
public class DataManager {
	
	/**
	 * getListOfEvents()
	 * 
	 * This method will return an array
	 * list of type EventDataObject.
	 * 
	 * The EventDataObject will have fields
	 * populated with information pertaining
	 * to the event, which may be literally and
	 * even or else the location of something of interest,
	 * so fields that aren't relevant are left null.
	 * 
	 * receives:	nothing
	 * returns:		arrayList<EventDataObject>
	 * 
	 * */
	public static ArrayList<EventDataObject> getListOfEvents()
	{
		ArrayList<EventDataObject> edoList = new ArrayList<EventDataObject>();
		
//		/*// Get from RealTimeEventReader		
//		RealTimeEventsReader rter = new RealTimeEventsReader();
//		ArrayList<RealTimeEventsDataObject> rtdoList = rter.getRealTimeEventsDataObjectList();
//		
//		// Send to converter
//		RealTimeDataConverterObject rtdc = new RealTimeDataConverterObject();
//		for (RealTimeEventsDataObject rtdo : rtdoList)
//		{
//			edoList.add(rtdc.toEventDataObject(rtdo));
//				*/
//		}
		
//		// Get from ZapEventReader
//		ZapReader zr = new ZapReader();
//		ArrayList<ZapDataObject> zdoList = zr.getZapDataObjectList();
//		
//		// Send to converter
//		ZapDataConverter zdc = new ZapDataConverter();
//		for (ZapDataObject zdo : zdoList)
//		{
//			edoList.add(zdc.toEventDataObject(zdo));
//				
//		}
		
		// Get from Restaurant
		WebRestaurantsReader wrr = new WebRestaurantsReader();
		ArrayList<RestaurantsInfoDataObject> ridoList = wrr.getRestaurantsInfoDataObjectList();
		
		// Send to Converter
		RestaurantInfoDataConverter ridc = new RestaurantInfoDataConverter();
		for (RestaurantsInfoDataObject rido : ridoList)
		{
			edoList.add(ridc.toEventDataObject(rido));
		}
		
		return edoList;
	}

	
	
}
