package certification.tutorials.interfaces;

import java.util.List;

public interface Musician  extends Artist{

	String getMusicSchool();
	void setMusicSchool(String musicSchool);
	List<String> getSong();
	void setSong(List<String> songs);
	String getGenre();
	void setGenre(String genre);
	
}
