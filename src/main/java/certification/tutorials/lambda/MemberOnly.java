package certification.tutorials.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MemberOnly {

	// instance variable
	private StringBuilder banner;

	// static variable
	private static List<String> strLit;

	// constructor
	public MemberOnly(String str) {
		banner = new StringBuilder(str);
	}

	// static method
	public static void main(String[] args) {
			strLit= new ArrayList<>();
					strLit.add("Tom");
			strLit.add("Dick");
			strLit.add("Harriet");
			MemberOnly obMemberOnly= new MemberOnly("love");
			Predicate<String> p= obMemberOnly.getPredicte();
			System.out.println(p.test("never dies")+  " " + obMemberOnly.banner);
;		}

	private Predicate<String> getPredicte() {

		return str -> {
			System.out.println("List: " + MemberOnly.strLit); // static field
			this.banner.append(str); // Instance field

			return str.length() > 5; // boolean value
		};
	}
}
