package certification.tutorials.basics;

/**
 * 
 * Lines 2 and 3 do not compile because var can only be used for local
 * variables. Line 6 does not compile because a single underscore is not
 * permitted as a variable name. These three compiler errors
 *
 */
public class VarDeclarationTest {
	var name = "Sherrin";

	public void massage(var num) {
		var zip = 10017;
		var underscores = 1_001_7;
		var __ = "";
	}

}
