module zoo.animal.talks {

	exports zoo.animal.talks.content;
	exports zoo.animal.talks.media;
	exports zoo.animal.talks.schedule;

	requires zoo.animal.care;
	requires zoo.animal.feeding;
}