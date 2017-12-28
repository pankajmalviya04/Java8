package com.Funtional_Interface;

@FunctionalInterface
public interface IndianMarket {
	
	int IndianMarketOpeningPrice();
	
	default void currentStockPrice(int price)
	{	
		System.out.println("Current Market Price: "+ price);
	}
	
	static void indianMarketClosingPrice(int closingPrice)
	{
		System.out.println("Stock closing price : "+ closingPrice);
	}
	
}
