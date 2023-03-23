package certification.tutorials.datetime;

import java.time.Duration;

public class DurationTest {

	public static void main(String[] args) {
		
		Duration d= Duration.ofSeconds(200);
		System.out.println("d="+d);
		
		Duration  d1= d.multipliedBy(2);
		System.out.println("d2="+ d1);
		
		Duration d2= d.negated();
		System.out.println("d2="+d2);
		
		// A duration of 2 days
		Duration d3= Duration.ofDays(2);
		System.out.println("d3="+ d3);
		// A duration of 25 minutes
		Duration d4= Duration.ofMinutes(25);
		System.out.println("d4="+d4);
		
		System.out.println("toString method of Duration="+ d4.toString());
		
		
	}

}
