package model;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement

public class Capital {
	String id;
	String Capital;
	String Country;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCapital() {
		return Capital;
	}
	public void setCapital(String capital) {
		Capital = capital;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
}
