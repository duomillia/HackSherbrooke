package ca.hacksherbrooke.backend.dataReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

import ca.hacksherbrooke.backend.configuration.ConfigurationManager;
import ca.hacksherbrooke.backend.data.RealTimeEventsDataObject;
import ca.hacksherbrooke.backend.data.RestaurantsInfoDataObject;
import ca.hacksherbrooke.backend.data.ZapDataObject;

/**
 * 
 * http://donnees.ville.sherbrooke.qc.ca/storage/f/2016-04-21T16%3A41%3A20.260Z/restaurants.json
 * */

/**
 * This class reads in the json file, which was downloaded from the above url
 * and converts it into an array of RestaurantInfoDataObjects
 * 
 * */
public class WebRestaurantsReader {
	
	public ArrayList<RestaurantsInfoDataObject> getRestaurantsInfoDataObjectList()
	{
	ArrayList<RestaurantsInfoDataObject> ridoList = new ArrayList<RestaurantsInfoDataObject>(); 
	
	String jsonData = WebServiceReader.getStringFromFile("restaurants.json");
	
	JsonReader reader = Json.createReader( new StringReader (jsonData));			
    JsonArray jsonArray = reader.readArray();
    reader.close();
    
    for (JsonValue jsonValue : jsonArray) {
    	JsonReader reader2 = Json.createReader( new StringReader (jsonValue.toString()));			
	    JsonObject jsonObject2 = reader2.readObject();	    
	    reader.close();
    	if (jsonObject2 != null){
	    ridoList.add(generateRestaurantsInfoDataObject(jsonObject2));
    	} else
    	{
    		System.out.println ("Whis is jsonObject2 null???");
    		
    	}
    }
    
	return ridoList;
}


RestaurantsInfoDataObject generateRestaurantsInfoDataObject(JsonObject jo)
{
	RestaurantsInfoDataObject rido = new RestaurantsInfoDataObject();
	
		rido.setID(processString(jo.get("ID")));
		rido.setNom(processString(jo.get("Nom")));
		rido.setSiteWeb(processString(jo.get("SiteWeb")));
		rido.setNumeroCivique(processString(jo.get("NumeroCivique")));
		rido.setRue(processString(jo.get("Rue")));
		rido.setCodePostal(processString(jo.get("CodePostal")));
		rido.setArrondissement(processString(jo.get("Arrondisement")));
		rido.setVille(processString(jo.get("Ville")));
		rido.setLatitude(processString(jo.get("Latitude")));
		rido.setLongitude(processString(jo.get("Longitude")));
		rido.setNumeroTelephone(processString(jo.get("NumeroTelephone")));
		rido.setEchellePrix(processString(jo.get("EchellePrix")));
		rido.setFichierImage(processString(jo.get("FichierImage")));
		rido.setDescriptionCourte(processString(jo.get("DescriptionCourte")));
		rido.setDistance(processString(jo.get("Distance")));
		
		rido.setDownloadDate(new Date());
	
	
	return rido;
}

String processString(JsonValue jv)
{
	if (jv != null) {
		return jv.toString().replace("\"", " ").replace("<br>", " ").replace("</br>", " ");
	}
	
	return "";
}


}
	
	
	
	


