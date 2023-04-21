package certification.tutorials.interfaces;

public class RockBand {
	public static void main(String[] strings) {
		final class MyElectricBass extends ElectricBass {
		
			public int getVolume() {
				return 30;
			}

			public void strum() {
				System.out.print("Y");
			}

			@Override
			public void sum() {
				// TODO Auto-generated method stub

			}
		}
	}

}
