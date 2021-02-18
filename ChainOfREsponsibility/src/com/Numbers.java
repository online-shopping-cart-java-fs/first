package com;

public class Numbers {
	private int number1;
	private int number2;
	private String calculationWanted;

	public Numbers(int number1, int number2, String calcWanted) {

		this.number1 = number1;
		this.number2 = number2;
		this.calculationWanted = calcWanted;
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public String getCalcWanted() {
		return calculationWanted;
	}

	public void setCalcWanted(String calculationWanted) {
		this.calculationWanted = calculationWanted;
	}

}
