package certification.tutorials.datetime;

import java.time.LocalDate;
import java.time.Month;

public class ExploringDateTime {

	public static void main(String[] args) {

		LocalDate ld1 = LocalDate.of(2021, Month.APRIL, 2);
		System.out.println(ld1);
		LocalDate ld2 = ld1.withYear(2014);
		System.out.println(ld2);
		
		LocalDate ldDate= LocalDate.of(2023, 6, 24);
		LocalDate localDate=  ldDate.plusDays(5);
		LocalDate ldDate2= ldDate.plusMonths(3);
		LocalDate ld3= ldDate.plusWeeks(3);
		LocalDate ld4= ldDate.minusMonths(7);
		LocalDate ld5= ldDate.minusWeeks(3);
		System.out.println(ld3);
		System.out.println(ld4);
		System.out.println(ldDate2);
		System.out.println(ld5);
		System.out.println(ldDate);  // 2023-06-24
		System.out.println(localDate); // 2023-06-29
		

	}

}
