package ca.hacksherbrooke.backend.data;
import ca.hacksherbrooke.backend.data.AbstractDataObject;

/**
 * This is a basic data object
 * 
 * for Event Data.
 * 
 * An 'event' is anything
 * that the app might want to display to the user. 
 * */
public class EventDataObject extends AbstractDataObject{
	
	private String StartDate;
	private String EndDate;	
	private String StartTime;
	private String EndTime;	
	private String Title;
	private String Description;
	private String Address;
	private String Category;
	private String Latitude;
	private String Longitude;
	private String Cost;
	private String langcode;
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	public String getStartTime() {
		return StartTime;
	}
	public void setStartTime(String startTime) {
		StartTime = startTime;
	}
	public String getEndTime() {
		return EndTime;
	}
	public void setEndTime(String endTime) {
		EndTime = endTime;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getLatitude() {
		return Latitude;
	}
	public void setLatitude(String latitude) {
		Latitude = latitude;
	}
	public String getLongitude() {
		return Longitude;
	}
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}
	public String getCost() {
		return Cost;
	}
	public void setCost(String cost) {
		Cost = cost;
	}
	public String getLangcode() {
		return langcode;
	}
	public void setLangcode(String langcode) {
		this.langcode = langcode;
	}

		
	
}

