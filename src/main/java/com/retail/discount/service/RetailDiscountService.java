package com.retail.discount.service;

import java.util.List;

import com.retail.model.Discount;
import com.retail.model.Inventory;
import com.retail.model.Item;
import com.retail.model.Payment;
import com.retail.model.User;

public class RetailDiscountService {
	/**
	 * 
	 */
	public RetailDiscountService() {
		super();
	}
	/**
	 * 
	 * @param userName
	 */
	public void getDiscount(final String userName) {
		final User findUser = searchUsers(userName);
		if(findUser!=null) {
			if(findUser.getCustomer().getCustomerName().equalsIgnoreCase("employee")) {
				RetailDiscountService.doBillingStoreEmployee();
			} else if(findUser.getCustomer().getCustomerName().equalsIgnoreCase("affiliate")) {
				RetailDiscountService.doBillingAffliateUsers();
			} else if(findUser.getCustomer().getCustomerName().equalsIgnoreCase("consumer")) {
				RetailDiscountService.doBillingConsumer("14/01/2019 00:00:00");
			}
		} else {
			RetailDiscountService.doBillingCommon();
		}
	}

	/**
	 * to find the users
	 * @param userName
	 * @return
	 */
	private User searchUsers(final String userName) {
		User user = null;
		if(userName != null && !"".equals(userName.trim())){
			final List<User> inventory = Inventory.getInstance().addUser();;
			for (final User inv_user: inventory) {
				if(inv_user.getCustomer().getCustomerName().equalsIgnoreCase(userName)) {
					user = inv_user;
					break;
				}
			}
		}
		return user;
	}

	/**
	 * to find the affliateusers discount
	 */
	public static void doBillingAffliateUsers() {
		final Inventory inv = new Inventory();
		final List<Item> listAff = inv.addAffliateItemList();
		Double totalAffliateSum = 0.0;
		Double totalGroceriesAffliateSum = 0.0;
		Double totalNonGroceriesAffliateSum = 0.0;

		for (final Item item : listAff) {
			totalAffliateSum = totalAffliateSum + item.getPrice();
			if(item.getItemtype().equals("NG"))
				totalNonGroceriesAffliateSum = totalNonGroceriesAffliateSum + item.getPrice();
			if(item.getItemtype().equals("G"))
				totalGroceriesAffliateSum = totalGroceriesAffliateSum + item.getPrice();
		}
		final Double netValue = totalGroceriesAffliateSum + Payment.getNetPayment(Discount.getDiscountforAffliate(), totalNonGroceriesAffliateSum);
		System.out.println("Affliate Total Amount : "+totalAffliateSum);
		System.out.println("Affliate Total Groceries Amount : "+totalGroceriesAffliateSum);
		System.out.println("Affliate Total Non Groceries Amount : "+totalNonGroceriesAffliateSum);
		System.out.println("Affliate : Final Total Bill for Affliate after Discount : "+netValue);

	}

	/**
	 *  to calculate store employee discount
	 */
	public static void doBillingStoreEmployee() {
		final Inventory inv = new Inventory();
		final List<Item> empItemList = inv.addEmployeeItemList();

		Double totalSumOfEmployeeItem = 0.0;
		Double totalEmployeeGroceriesSumItems = 0.0;
		Double totalEmployeeNonGroceriesSumItems = 0.0;

		for (final Item item : empItemList) {
			totalSumOfEmployeeItem = totalSumOfEmployeeItem + item.getPrice();
			if(item.getItemtype().equals("NG"))
				totalEmployeeNonGroceriesSumItems = totalEmployeeNonGroceriesSumItems + item.getPrice();
			if(item.getItemtype().equals("G"))
				totalEmployeeGroceriesSumItems = totalEmployeeGroceriesSumItems + item.getPrice();
		}
		final Double netValue = totalEmployeeGroceriesSumItems + Payment.getNetPayment(Discount.getDiscountforEmployee(), totalEmployeeNonGroceriesSumItems);
		System.out.println("Employee Total Amount : "+totalSumOfEmployeeItem);
		System.out.println("Employee Total Groceries Amount : "+totalEmployeeGroceriesSumItems);
		System.out.println("Employee Total Non Groceries Amount : "+totalEmployeeNonGroceriesSumItems);
		System.out.println("Final Total Bill for Store Employee after Discount : "+netValue);

	}

	/**
	 *  to calcualte consumer discount
	 * @param date
	 */
	public static void doBillingConsumer(final String date) {
		final Inventory inv = new Inventory();
		final List<Item> consumerList = inv.addConsumerList();

		Double totalSumOfConCsumerItem = 0.0;
		Double totalConsumerGroceriesSumItems = 0.0;
		Double totalConsumerNonGroceriesSumItems = 0.0;

		for (final Item item : consumerList) {
			totalSumOfConCsumerItem = totalSumOfConCsumerItem + item.getPrice();
			if(item.getItemtype().equals("NG"))
				totalConsumerNonGroceriesSumItems = totalConsumerNonGroceriesSumItems + item.getPrice();
			if(item.getItemtype().equals("G"))
				totalConsumerGroceriesSumItems = totalConsumerGroceriesSumItems + item.getPrice();
		}
		final Double netValue = totalSumOfConCsumerItem + Payment.getNetPaymentforConsumer(Discount.getDiscountforConsumer(), totalConsumerNonGroceriesSumItems,Payment.getDateFromString(date));
		System.out.println("Consumer Total Amount : "+totalSumOfConCsumerItem);
		System.out.println("Consumer Total Groceries Amount : "+totalConsumerGroceriesSumItems);
		System.out.println("Consumer Total Non Groceries Amount : "+totalConsumerNonGroceriesSumItems);
		System.out.println("Final Total Bill for Consumer after Discount : "+netValue);

	}

	/**
	 * to calcualte common users discount
	 */
	public static void doBillingCommon() {
		final Inventory inv = new Inventory();
		final List<Item> consumerList = inv.addConsumerList();

		Double totalSumOfConCsumerItem = 0.0;
		Double totalConsumerGroceriesSumItems = 0.0;
		Double totalConsumerNonGroceriesSumItems = 0.0;

		for (final Item item : consumerList) {
			totalSumOfConCsumerItem = totalSumOfConCsumerItem + item.getPrice();
			if(item.getItemtype().equals("NG"))
				totalConsumerNonGroceriesSumItems = totalConsumerNonGroceriesSumItems + item.getPrice();
			if(item.getItemtype().equals("G"))
				totalConsumerGroceriesSumItems = totalConsumerGroceriesSumItems + item.getPrice();
		}
		final Double netValue = totalSumOfConCsumerItem + Payment.getNetPayment(Discount.getDiscountforCommon(), totalConsumerNonGroceriesSumItems);
		System.out.println("Common Customer Total Amount : "+totalSumOfConCsumerItem);
		System.out.println("Common Customer Total Groceries Amount : "+totalConsumerGroceriesSumItems);
		System.out.println("Common Customer Total Non Groceries Amount : "+totalConsumerNonGroceriesSumItems);
		System.out.println("Final Total Bill for Common Customer after Discount : "+netValue);

	}
}
