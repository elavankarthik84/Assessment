package com.retail.model;

import java.util.Date;

public class Affliate {
	
	private long aff_id;
	private String affliateName;
	private Date createdDate;
	/**
	 * @param aff_id
	 * @param affliateName
	 * @param createdDate
	 */
	public Affliate(long aff_id, String affliateName, Date createdDate) {
		super();
		this.aff_id = aff_id;
		this.affliateName = affliateName;
		this.createdDate = createdDate;
	}
	/**
	 * @return the aff_id
	 */
	public long getAff_id() {
		return aff_id;
	}
	/**
	 * @param aff_id the aff_id to set
	 */
	public void setAff_id(long aff_id) {
		this.aff_id = aff_id;
	}
	/**
	 * @return the affliateName
	 */
	public String getAffliateName() {
		return affliateName;
	}
	/**
	 * @param affliateName the affliateName to set
	 */
	public void setAffliateName(String affliateName) {
		this.affliateName = affliateName;
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
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
