package ca.hacksherbrooke.backend.data;
import ca.hacksherbrooke.backend.data.AbstractDataObject;

public class RestaurantsInfoDataObject extends AbstractDataObject{
	
	private String ID;
	private String Nom;
	private String SiteWeb;
	private String NumeroCivique;
	private String Rue;
	private String CodePostal;
	private String Arrondissement;
	private String Ville;
	private String Latitude;
	private String Longitude;
	private String NumeroTelephone;
	private String EchellePrix;
	private String DescriptionCourte;
	private String FichierImage;	
	private String Distance;
	    
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getSiteWeb() {
		return SiteWeb;
	}
	public void setSiteWeb(String siteWeb) {
		SiteWeb = siteWeb;
	}
	public String getNumeroCivique() {
		return NumeroCivique;
	}
	public void setNumeroCivique(String numeroCivique) {
		NumeroCivique = numeroCivique;
	}
	public String getRue() {
		return Rue;
	}
	public void setRue(String rue) {
		Rue = rue;
	}
	public String getCodePostal() {
		return CodePostal;
	}
	public void setCodePostal(String codePostal) {
		CodePostal = codePostal;
	}
	public String getArrondissement() {
		return Arrondissement;
	}
	public void setArrondissement(String arrondissement) {
		Arrondissement = arrondissement;
	}
	public String getVille() {
		return Ville;
	}
	public void setVille(String ville) {
		Ville = ville;
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
	public String getNumeroTelephone() {
		return NumeroTelephone;
	}
	public void setNumeroTelephone(String numeroTelephone) {
		NumeroTelephone = numeroTelephone;
	}
	public String getEchellePrix() {
		return EchellePrix;
	}
	public void setEchellePrix(String echellePrix) {
		EchellePrix = echellePrix;
	}
	public String getDescriptionCourte() {
		return DescriptionCourte;
	}
	public void setDescriptionCourte(String descriptionCourte) {
		DescriptionCourte = descriptionCourte;
	}
	public String getFichierImage() {
		return FichierImage;
	}
	public void setFichierImage(String fichierImage) {
		FichierImage = fichierImage;
	}
	public String getDistance() {
		return Distance;
	}
	public void setDistance(String distance) {
		Distance = distance;
	}
	
	
}


