package certification.tutorials.records;

record Music() {

}

record Song(String lyrics) {
	Song {
		this.lyrics = lyrics + "Hello World";
	}
}

sealed class Dance {
}

record March() {
	@Override
	String toString() {
		return null;
	}
}

class Ballet extends Dance {
}
