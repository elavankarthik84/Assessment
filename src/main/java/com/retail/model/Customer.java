package com.retail.model;

import java.util.Date;

public class Customer {
	private long custId;
	private String customerName;
	private Date createdDate;

	/**
	 * @param custId
	 * @param customerName
	 * @param createdDate
	 */
	public Customer(final long custId, final String customerName, final Date createdDate) {
		super();
		this.custId = custId;
		this.customerName = customerName;
		this.createdDate = createdDate;
	}

	/**
	 * @return the custId
	 */
	public long getCustId() {
		return custId;
	}

	/**
	 * @param custId the custId to set
	 */
	public void setCustId(final long custId) {
		this.custId = custId;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(final String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(final Date createdDate) {
		this.createdDate = createdDate;
	}
}
