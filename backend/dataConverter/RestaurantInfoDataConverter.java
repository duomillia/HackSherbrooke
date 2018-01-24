package ca.hacksherbrooke.backend.dataConverter;

import ca.hacksherbrooke.backend.data.EventDataObject;
import ca.hacksherbrooke.backend.data.RealTimeEventsDataObject;
import ca.hacksherbrooke.backend.data.RestaurantsInfoDataObject;

/**
 * Class to create and populate an EventDataObject
 * from a RealTimeEventsObject
 * 
 * 
 * 
 * */
public class RestaurantInfoDataConverter {

	/**
	 * This method creates and populates an EventDataObject
	 * from a RestaurantsInfoDataObject
	 * 
	 * receives:	RealTimeEventsObject
	 * returns:		EventDataObject
	 * */
	
	public EventDataObject toEventDataObject(RestaurantsInfoDataObject rido){
				
		EventDataObject Edo = new EventDataObject();
		
		Edo.setAddress(rido.getNumeroCivique() + "," + 
				rido.getRue() + 
				rido.getCodePostal() + 
				rido.getArrondissement() +
				rido.getVille()
				);
		Edo.setCategory("RESTAURANT");
		
		Edo.setTitle(rido.getNom());
		Edo.setDescription(rido.getDescriptionCourte());
		
		Edo.setCost(rido.getEchellePrix());
		Edo.setLangcode("FR");
		Edo.setDownloadDate(rido.getDownloadDate());
		
		Edo.setLangcode(rido.getLatitude());
		Edo.setLongitude(rido.getLongitude());
		
	
		return Edo;
		}	
	
	

}
