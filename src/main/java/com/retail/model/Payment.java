package com.retail.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Payment {

	/**
	 * to calaculate net payment process
	 * @param disCount
	 * @param totalBill
	 * @return
	 */
	public static Double getNetPayment(final Double disCount, final Double totalBill) {
		final Double total = totalBill * disCount/100;
		return total;
	}
	/**
	 * to calculate comsumer payment
	 * @param disCount
	 * @param totalBill
	 * @param createdDate
	 * @return
	 */
	public static Double getNetPaymentforConsumer(final Double disCount, final Double totalBill, final Date createdDate) {
		final Date currentDt = new Date();
		Double total = 0.0;
		if(getDiffYears(createdDate, currentDt) > 2)
			total = totalBill * disCount/100;
		else
			total = totalBill;
		return total;
	}
	/**
	 * calculate flate 5%
	 * @return
	 */
	public static int getNetPaymentforCommon() {
		return 5;
	}
	/**
	 * to calculate 2 years customer get 5% of discount
	 * @param first
	 * @param last
	 * @return
	 */
	public static int getDiffYears(final Date first, final Date last) {
		final Calendar a = getCalendar(first);
		final Calendar b = getCalendar(last);
		int diff = b.get(Calendar.YEAR) - a.get(Calendar.YEAR);
		if (a.get(Calendar.MONTH) > b.get(Calendar.MONTH) || 
				(a.get(Calendar.MONTH) == b.get(Calendar.MONTH) && a.get(Calendar.DATE) > b.get(Calendar.DATE))) {
			diff--;
		}
		return diff;
	}
	/**
	 * @param date
	 * @return
	 */
	public static Calendar getCalendar(final Date date) {
		final Calendar cal = Calendar.getInstance(Locale.US);
		cal.setTime(date);
		return cal;
	}
	/**
	 * @param date
	 * @return
	 */
	public static Date getDateFromString(final String date) {
		final SimpleDateFormat sdf = (SimpleDateFormat) SimpleDateFormat.getDateInstance();
		sdf.applyPattern("dd/MM/yyyy HH:mm:ss");
		try {
			return sdf.parse(date);
		} catch (final ParseException e) {
			return null;
		}

	}

}
