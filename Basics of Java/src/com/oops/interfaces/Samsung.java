package com.oops.interfaces;

public class Samsung implements Mobile {

	String internalStorage;

	public Samsung(String internalStorage) {
		this.internalStorage = internalStorage;
	}

	@Override
	public String brandName() {
		return "Samsung";
	}

	@Override
	public String internalStorage() {
		return internalStorage;
	}

	@Override
	public String ram() {
		return "8 GB";
	}

	
	
	

}
