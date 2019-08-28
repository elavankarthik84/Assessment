package com.retail.discount.testcase;

import org.junit.Test;

import com.retail.discount.service.RetailDiscountService;

public class RetailTestCase {

	// to be execute store employee 30% discount
	@Test public void getDiscountForStoreEmployee() {
		RetailDiscountService discountService = new RetailDiscountService();
		discountService.getDiscount("employee");
	}

	// to be execute store affliate 10% discount
	@Test public void getDiscountForAffliate() {
		RetailDiscountService discountService = new RetailDiscountService();
		discountService.getDiscount("affiliate");

	}

	// to be execute store consumer 5% discount
	@Test public void getDiscountForConsumer() {
		RetailDiscountService discountService = new RetailDiscountService();
		discountService.getDiscount("consumer");

	}
	// to be execute store common 5% discount
	@Test public void getDiscountForCommonUsers() {
		RetailDiscountService discountService = new RetailDiscountService();
		discountService.getDiscount("consumer");
	}


}
