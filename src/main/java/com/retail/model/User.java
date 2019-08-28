package com.retail.model;

public class User {

	private Employee employee;
	private Affliate affliate;
	private Customer customer;
	/**
	 * @param custId
	 * @param customerName
	 * @param customerType
	 * @param employee
	 * @param affliate
	 * @param customer
	 */
	public User(final Employee employee, final Affliate affliate,
			final Customer customer) {
		super();

		this.employee = employee;
		this.affliate = affliate;
		this.customer = customer;
	}

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}
	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(final Employee employee) {
		this.employee = employee;
	}
	/**
	 * @return the affliate
	 */
	public Affliate getAffliate() {
		return affliate;
	}
	/**
	 * @param affliate the affliate to set
	 */
	public void setAffliate(final Affliate affliate) {
		this.affliate = affliate;
	}
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(final Customer customer) {
		this.customer = customer;
	}
}
