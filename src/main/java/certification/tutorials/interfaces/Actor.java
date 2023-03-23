package certification.tutorials.interfaces;

import java.util.List;

public interface Actor {
	
	String getActingScholl();
	void setActingSchool(String actingSchool);
	List<String> getFilms();
	void setFilms(List<String> films);
	void addFimls(String filmName);
	

}
