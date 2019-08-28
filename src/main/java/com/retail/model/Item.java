package com.retail.model;

public class Item {

	private long itemId;
	private String itemName;
	private String itemtype;
	private Double price;

	/**
	 * @param itemId
	 * @param itemName
	 * @param itemtype
	 * @param price
	 */
	public Item(final long itemId, final String itemName, final String itemtype, final Double price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemtype = itemtype;
		this.price = price;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(final Double price) {
		this.price = price;
	}
	/**
	 * @return the itemId
	 */
	public long getItemId() {
		return itemId;
	}
	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(final long itemId) {
		this.itemId = itemId;
	}
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(final String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @return the itemtype
	 */
	public String getItemtype() {
		return itemtype;
	}
	/**
	 * @param itemtype the itemtype to set
	 */
	public void setItemtype(final String itemtype) {
		this.itemtype = itemtype;
	}

}
