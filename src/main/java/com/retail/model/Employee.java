package com.retail.model;

import java.util.Date;

public class Employee {

	private long empId;
	private String empName;
	private Date createDate;
	/**
	 * @param empId
	 * @param empName
	 * @param createDate
	 */
	public Employee(final long empId, final String empName, final Date createDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.createDate = createDate;
	}
	/**
	 * @return the empId
	 */
	public long getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(final long empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(final String empName) {
		this.empName = empName;
	}
	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(final Date createDate) {
		this.createDate = createDate;
	}

}
