package ca.hacksherbrooke.backend.dataConverter;

import ca.hacksherbrooke.backend.data.EventDataObject;
import ca.hacksherbrooke.backend.data.RealTimeEventsDataObject;

/**
 * Class to create and populate an EventDataObject
 * from a RealTimeEventsObject
 * 
 * 
 * 
 * */
public class RealTimeDataConverterObject {

	/**
	 * This method creates and populates an EventDataObject
	 * from a RealTimeEventsObject
	 * 
	 * receives:	RealTimeEventsObject
	 * returns:		EventDataObject
	 * */
	
	public EventDataObject toEventDataObject(RealTimeEventsDataObject Eo){
				
		EventDataObject Edo = new EventDataObject();
		Edo.setAddress(Eo.getAD_NO() + "," + Eo.getAD_GEN() + Eo.getAD_LIEN() + Eo.getAD_MUN());
		Edo.setCategory(Eo.getCATEG());
		
		Edo.setStartDate(Eo.getDT01());
		Edo.setEndDate(Eo.getDT02());
		Edo.setStartTime(Eo.getHR01());
		Edo.setEndTime(Eo.getHR01());
		Edo.setTitle(Eo.getTITRE());
		Edo.setDescription(Eo.getDESCRIP());
		
		Edo.setCost(Eo.getCO());
		Edo.setLangcode("FR");
		Edo.setDownloadDate(Eo.getDownloadDate());
		
		return Edo;
		}	
	
	

}
