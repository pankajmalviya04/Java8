package com.Funtional_Interface;

public class ZABroking implements GlocalMarket, IndianMarket{

	@Override
	public int IndianMarketOpeningPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int GlobalMarketOpeningPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void currentStockPrice(int price) {
		// TODO Auto-generated method stub
		GlocalMarket.super.currentStockPrice(price);
	}

	
	

	
}
