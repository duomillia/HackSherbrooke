package ca.hacksherbrooke.backend.dataReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * This class is responsible for obtaining the raw
 * data from various web services.
 * 
 * 
 * */
public class WebServiceReader {

	int status = 0;
	static String r = "";

/**
 * getStringFromURL
 * 
 * This method is a mock data provider.
 * 
 * The real one will receive a url for a webservice
 * and return the text of the response. 
 * */
	public static String getStringFromFile(String url) {
		String s = "";		
		{
			try {
				s = new Scanner(new File("txt/restaurants.json")).useDelimiter("\\Z")
						.next();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return s;

		}

	}

	
}

// public static String getStringFromURL_2(String url)
// {
// http://programmerguru.com/android-tutorial/android-restful-webservice-tutorial-how-to-call-restful-webservice-in-android-part-3/

// AsyncHttpClient client = new AsyncHttpClient();
// client.get("http://192.168.2.2:9999/useraccount/login/dologin",params ,new
// AsyncHttpResponseHandler() {
// @Override
// public void onSuccess(String response) {
// // Hide Progress Dialog
// prgDialog.hide();
// try {
// WebServiceReader.r = response;
// WebServiceReader.status = 1;
// }
// }

// While (status = 0) {}
// return response;
// }

// }

// }