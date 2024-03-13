package com.core.nestedclasses.innerclass;

public class Outer {
	private int outerData;
	public final static Inner i = new Inner();
	
	

	Outer() {
		outerData = 10;
	}

	public Inner getI() {
		return i;
	}


	@Override
	public String toString() {
		return "Outer [outerData=" + outerData + "]";
	}

	public int getOuterData() {
		return outerData;
	}

	public void setOuterData(int outerData) {
		this.outerData = outerData;
	}

	// a class inside another class in inner class
	static class Inner {
		private int innerData;

		Inner() {
			innerData = 45;
			
		}

		public int getInnerData() {
			return innerData;
		}

		public void setInnerData(int innerData) {
			this.innerData = innerData;
		}

		@Override
		public String toString() {
			return "Inner [innerData=" + innerData + "]";
		}

	}


}
