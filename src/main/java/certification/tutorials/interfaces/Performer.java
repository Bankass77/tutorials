package certification.tutorials.interfaces;

import java.util.List;

public class Performer extends Human implements Musician, Actor {

	private String musicSchool;
	private String genre;

	private List<String> songs;

	private String actingSchool;
	private List<String> films;

	public Performer(String name, float height, int age, Gender gender) {
		super(name, height, age, gender);

	}

	@Override
	public String getActingScholl() {

		return actingSchool;
	}

	@Override
	public void setActingSchool(String actingSchool) {

		this.actingSchool = actingSchool;
	}

	@Override
	public List<String> getFilms() {

		return films;
	}

	@Override
	public void setFilms(List<String> films) {
		this.films = films;

	}

	@Override
	public void addFimls(String filmName) {

		films.add(filmName);

	}

	@Override
	public String getMusicSchool() {

		return musicSchool;
	}

	@Override
	public void setMusicSchool(String musicSchool) {
		this.musicSchool = musicSchool;

	}

	@Override
	public List<String> getSong() {

		return songs;
	}

	@Override
	public void setSong(List<String> songs) {
		this.songs = songs;

	}

	@Override
	public String getGenre() {

		return genre;
	}

	@Override
	public void setGenre(String genre) {
		this.genre = genre;

	}

	@Override
	public String getSchool() {

		return musicSchool;
	}

	@Override
	public void setSchool(String school) {

		this.musicSchool = school;

	}

	public String getCapitalizeName() {
		return Artist.capitalize(this.name);

	}
}
