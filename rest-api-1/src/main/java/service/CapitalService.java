package service;
import java.util.ArrayList;
//import java.util.Hashtable;
//import java.util.stream.Stream;
import org.springframework.stereotype.Service;
import model.Capital;
@Service

public class CapitalService {
	ArrayList<Capital> persons = new ArrayList<Capital>();
	public CapitalService() {
		Capital p = new Capital();
		p.setId("1");
		p.setCapital("ottawa");
		p.setCountry("canada");
		persons.add(p);
		
	 
	
	}
	public Capital getcapital(String id) {
		for(Capital capital:persons) {
			if(capital.getId().equalsIgnoreCase(id)) return capital;
		}
	    return null;
	}
	public ArrayList<Capital> getAll() {
		return persons;
	}
}
