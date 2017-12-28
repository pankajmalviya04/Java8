package com.Funtional_Interface;

@FunctionalInterface
public interface GlocalMarket{
	

	int GlobalMarketOpeningPrice();
	
	default void currentStockPrice(int price)
	{	
		System.out.println("Current Market Price: "+ price);
	}
	
	static void GolablmarketClosingPrice(int closingPrice)
	{
		System.out.println("Stock closing price : "+ closingPrice);
	}
	

	

	
	

}
