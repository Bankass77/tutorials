package certification.tutorials.concurrency;

import lombok.extern.slf4j.Slf4j;

public class IncomeTaxClient {

	private static int NUMBER_OF_TAX_PAYER = 1000;

	private static IncomeTaxDept incomeTaxDept = new IncomeTaxDept(null);

}
