package certification.tutorials.datetime;

import java.time.Instant;

public class InstantTest {

	public static void main(String[] args) {
		
		Instant  i1= Instant.now();
		
		Instant i2= Instant.ofEpochSecond(19);
		System.out.println("Curent Instant="+i1);
		System.out.println("EpocSecond="+i2);
		
		System.out.println("toString method of Instant class="+ i1.toString());
		
		long seconds=i1.getEpochSecond();
		System.out.println("seconds:"+ seconds);
		int nanoSeconds= i1.getNano();
		System.out.println("NanoSecond:"+ nanoSeconds);
		
	}

}
