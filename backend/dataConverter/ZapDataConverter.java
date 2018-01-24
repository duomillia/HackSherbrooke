package ca.hacksherbrooke.backend.dataConverter;

import java.util.Date;

import ca.hacksherbrooke.backend.data.EventDataObject;
import ca.hacksherbrooke.backend.data.ZapDataObject;

/**
 * The converter class to transform a ZapDataObject
 * into and EventDataObject.
 * 
 * */
public class ZapDataConverter {

	/**
	 * This method can be used to create and populate
	 * an EventDataObject from a ZapDataObject.
	 * 
	 * Receives:	ZapDataObject
	 * Returns:		EventDataObject
	 * 
	 * */
	public EventDataObject toEventDataObject(ZapDataObject zdo){
		
	EventDataObject edo = new EventDataObject();
	
	edo.setAddress((zdo.getCivic_number() +
			", " + zdo.getStreet_name() + 
			" " +
			zdo.getCity() + " " +
			zdo.getProvince() + 
			" (" +
			zdo.getPostal_code() +
			")"
			).replace("\"", ""));
	
	edo.setCategory("ZAP");
		
	edo.setDescription(zdo.getDescription().replace("\"", ""));
	
	edo.setDownloadDate(new Date());
	
	edo.setLatitude(zdo.getLatitude().replace("\"", ""));
	edo.setLongitude(zdo.getLongitude().replace("\"", ""));
	
	
	return edo;
	}	
	
}
