module zoo.staff {

	requires zoo.animal.talks;
// no needed longer	requires zoo.animal.feeding;
// no needed longer 	requires zoo.animal.care;
	requires zoo.animal.talks;
	requires transitive zoo.animal.talks; // Does not Compile, beacause java does not allow you to repeat the same
											// module in a requires clause

}
