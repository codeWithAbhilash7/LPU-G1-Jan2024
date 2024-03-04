package com.oops.interfaces;

public interface Mobile {
	
	int data = 20;		// public static final
	
	String brandName();			// public abstract String brandName();	

	String internalStorage(); 	// public abstract String internalStorage();
	
	default String camera() {
		return "NA";
	}
	
	String ram();
}
