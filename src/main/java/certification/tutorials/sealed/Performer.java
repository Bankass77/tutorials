package certification.tutorials.sealed;

import java.util.List;

public final class Performer extends Human {
	
	public Performer(String name, int age, float height) {
		super(name, age, height);
		
	}
	private String musicSchool;
	private String genre;

	private List<String> songs;

	private String actingSchool;
	private List<String> films;
	public String getMusicSchool() {
		return musicSchool;
	}
	public void setMusicSchool(String musicSchool) {
		this.musicSchool = musicSchool;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public List<String> getSongs() {
		return songs;
	}
	public void setSongs(List<String> songs) {
		this.songs = songs;
	}
	public String getActingSchool() {
		return actingSchool;
	}
	public void setActingSchool(String actingSchool) {
		this.actingSchool = actingSchool;
	}
	public List<String> getFilms() {
		return films;
	}
	public void setFilms(List<String> films) {
		this.films = films;
	}
	

}
