open module zoo.animal.talks {

	exports zoo.animal.talks.content to zoo.staff;
	exports zoo.animal.talks.media;
	exports zoo.animal.talks.schedule;

	opens zoo.animal.talks.schedule;  // Doe not compile
	// no longer needed requires zoo.animal.care;
	// no needed longer requires zoo.animal.feeding;

	requires transitive zoo.animal.care;
}