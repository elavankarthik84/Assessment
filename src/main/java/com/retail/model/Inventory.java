package com.retail.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Inventory {

	private static Inventory inventory = null;
	private final List<User> userManagement = new ArrayList<User>();
	private final List<Item> itemList = new ArrayList<Item>();

	/**
	 * inizialize the object and loading the date
	 * @return
	 */
	public static Inventory getInstance() {
		if (null == inventory) {
			inventory = new Inventory();
		}

		return inventory;
	}

	public List<User> getUserList() {
		return userManagement;
	}
	/* ------------------ LOADING STATIC DATA -------------  */
	public List<User> addUser() {
		userManagement.add(new User(new Employee(001, "employee", new Date()), new Affliate(001, "store", new Date()), new Customer(001, "employee", new Date())));
		userManagement.add(new User(new Employee(001, "affiliate", new Date()), new Affliate(001, "vendor", new Date()), new Customer(001, "affiliate", new Date())));
		userManagement.add(new User(new Employee(001, "consumer", new Date()), new Affliate(001, "consumer", new Date()), new Customer(001, "consumer", new Date())));
		return userManagement;
	}

	public List<Item> addItemList() {
		itemList.add(new Item(1, "apple", "G", 10.25));
		itemList.add(new Item(2, "waterBottle", "NG", 4.25));
		itemList.add(new Item(3, "mobile", "NG", 400.05));
		return itemList;
	}

	public List<Item> addEmployeeItemList() {
		itemList.add(new Item(1, "apple", "G", 10.25));
		itemList.add(new Item(2, "waterBottle", "NG", 4.25));
		itemList.add(new Item(3, "mobile", "NG", 200.05));
		return itemList;
	}

	public List<Item> addConsumerList() {
		itemList.add(new Item(1, "onion", "G", 4.25));
		itemList.add(new Item(2, "watch", "NG", 2.25));
		itemList.add(new Item(3, "mouse", "NG", 25.05));
		return itemList;
	}
	public List<Item> addAffliateItemList() {
		itemList.add(new Item(1, "grap", "G", 3.25));
		itemList.add(new Item(2, "shoe", "NG", 7.25));
		itemList.add(new Item(3, "glass", "NG", 150.05));
		return itemList;
	}
	/* ------------------ END LOADING STATIC DATA -------------  */
}
