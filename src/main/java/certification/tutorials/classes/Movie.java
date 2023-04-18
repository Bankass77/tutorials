package certification.tutorials.classes;

public class Movie {

	private int butter = 5;

	private Movie() {

	}

	protected class PopCorn {

		private PopCorn() {

		}

		public static int butter = 10;

		public void startMovie() {

			System.out.println(butter);
		}

	}

	public static void main(String[] args) {
		var movie = new Movie();
		Movie.PopCorn in = new Movie().new PopCorn();
		in.startMovie();
		
		var s1 = new StringBuilder();
		 var s2 = new StringBuilder(5);
		 var s3 = new StringBuilder(6.0);
		 var s5 = new StringBuilder(false);
	}
	
	

}
