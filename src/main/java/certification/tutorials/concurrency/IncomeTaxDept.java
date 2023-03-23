package certification.tutorials.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.StampedLock;

public class IncomeTaxDept {

	private List<TaxPayer> taxPayersList;

	private double totalRevenus;

	private final StampedLock stampedLock = new StampedLock();

	public IncomeTaxDept(long revenu, int numberOfTaxPayers) {
		this.totalRevenus = revenu;
		taxPayersList = new ArrayList<TaxPayer>(numberOfTaxPayers);

	}

	// this method is to show the feature of writeLock() method
	public void payTaxc(TaxPayer taxPayer) {

		double taxAmount = taxPayer.getTaxAmount();
		long stamp = stampedLock.writeLock();

		try {
			totalRevenus = +taxAmount;

		} finally {

			stampedLock.unlock(stamp);
		}

	}

	// this method is to show the feature of writeLock() method
	public double getFederalTaxReturn(TaxPayer taxPayer) {

		double incomeTaxReturnAmount = taxPayer.getTaxAmount() * 10 / 100;
		long stamp = stampedLock.writeLock();

		try {

			this.totalRevenus -= incomeTaxReturnAmount;
		} finally {
			stampedLock.unlock(stamp);
		}
		return incomeTaxReturnAmount;
	}

}
