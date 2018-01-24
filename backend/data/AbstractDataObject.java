package ca.hacksherbrooke.backend.data;

import java.util.Date;

/**
 * The super class for Data Objects.
 * Gives them a source url, and downloaddate. 
 * */
public abstract class AbstractDataObject {

	String sourceURL;
	Date downloadDate;
	
	public String SourceURL() {
		return sourceURL;
	}

	public void setSourceURL(String pSourceURL) {
		sourceURL = pSourceURL;
	}

	public Date getDownloadDate() {
		return downloadDate;
	}

	public void setDownloadDate(Date downloadDate) {
		this.downloadDate = downloadDate;
	}
	
	
	
}
