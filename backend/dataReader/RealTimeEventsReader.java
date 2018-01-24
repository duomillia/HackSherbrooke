//package ca.hacksherbrooke.backend.dataReader;
//
//import java.io.StringReader;
//import java.util.ArrayList;
//import java.util.Date;
//
//import javax.json.Json;
//import javax.json.JsonArray;
//import javax.json.JsonObject;
//import javax.json.JsonReader;
//import javax.json.JsonValue;
//
//import ca.hacksherbrooke.backend.configuration.ConfigurationManager;
//import ca.hacksherbrooke.backend.data.RealTimeEventsDataObject;
//
///*
// * For Gradle, add this to your build.gradle
// * compile 'javax.json:javax.json-api:1.0'
// * 
// * For desktop Eclipse,
// * http://www.java2s.com/Code/Jar/j/Downloadjavaxjson102jar.htm
// * 
// * 
// * THIS CODE *MIGHT* NEED TO BE REWRITTEN
// * TO MAKE USE OF ANDROID LIBRARIES ?????
// * */
//
//
////http://www.java2s.com/Tutorials/Java/JSON/0100__JSON_Java.htm
//
///**
// * Class to obtain data from the Zap location webservice
// * and populate an array list of ZapDataObjects.
// * 
// * */
//public class RealTimeEventsReader {
//	
//	/**
//	 * This method obtains the data from the
//	 * Real Time Events  webservice, and then
//	 * places it in an array list of RealTimeEventsDataObject s
//	 * 
//	 * receives:	none
//	 * returns:		ArrayList<ZapDataObject>
//	 * */	
//	public ArrayList<RealTimeEventsDataObject> getRealTimeEventsDataObjectList()
//	{
//		ArrayList<RealTimeEventsDataObject> rtedoList = new ArrayList<RealTimeEventsDataObject>(); 
//		
//		String jsonData = WebServiceReader.getStringFromURL(ConfigurationManager.getUrl("realTimeEvents"));
//		
//		JsonReader reader = Json.createReader( new StringReader (jsonData));			
//	    JsonObject jsonObject = reader.readObject();	    
//	    reader.close();
//	    
//	    
//	    
//	    JsonObject evts = jsonObject.getJsonObject("EVTS");
//	    JsonArray evt = evts.getJsonArray("EVT");
//	    
//	    for (JsonValue jsonValue : evt) {
//	    	JsonReader reader2 = Json.createReader( new StringReader (jsonValue.toString()));			
//		    JsonObject jsonObject2 = reader2.readObject();	    
//		    reader.close();
//	    	if (jsonObject2 != null){
//		    rtedoList.add(generateRealTimeEventDataObject(jsonObject2));
//	    	} else
//	    	{
//	    		System.out.println ("Whis is jsonObject2 null???");
//	    		
//	    	}
//	    	//System.out.println(jsonObject2.get("MUNID")));
//	    }
//	    
//		return rtedoList;
//	}
//	
//	
//	RealTimeEventsDataObject generateRealTimeEventDataObject(JsonObject jo)
//	{
//		RealTimeEventsDataObject rteo = new RealTimeEventsDataObject();
//		
//			rteo.setAD_GEN(processString(jo.get("AD_GEN")));
//			rteo.setAD_LIEN(processString(jo.get("AD_LIEN")));
//			rteo.setAD_NO(processString(jo.get("AD_NO")));
//			rteo.setAD_MUN(processString(jo.get("AD_MUN")));
//			
//			
//			rteo.setCATEG(processString(jo.get("CATEG")));
//			rteo.setCO(processString(jo.get("CO")));
//			rteo.setCODEID(processString(jo.get("CODEID")));
//			
//			rteo.setDESCRIP(processString(jo.get("DESCRIP")));
//			rteo.setDT01(processString(jo.get("DT01")));
//			rteo.setDT02(processString(jo.get("DT02")));
//			rteo.setHR01(processString(jo.get("HR01")));
//			rteo.setHR02(processString(jo.get("HR02")));
//
//			rteo.setLOC(processString(jo.get("LOC")));
//			
//			rteo.setMUNID(processString(jo.get("MUNID")));
//			rteo.setTEL1(processString(jo.get("TEL1")));
//			rteo.setTITRE(processString(jo.get("TITRE")));
//			rteo.setURL(processString(jo.get("URL")));
//			rteo.setCATEG(processString(jo.get("CATEG")));
//			
//			rteo.setDownloadDate(new Date());
//		
//		
//		return rteo;
//	}
//	
//	String processString(JsonValue jv)
//	{
//		if (jv != null) {
//			return jv.toString().replace("\"", " ").replace("<br>", " ").replace("</br>", " ");
//		}
//		
//		return "";
//	}
//}
