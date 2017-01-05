package com.hernchri.spring;

import java.text.DecimalFormat;

public class Calculate {
	private double height = 0;
	private double weight = 0;
	
	public void getBMI(){
		System.out.println("Your height is : " + height + "m\n");
		System.out.println("Your weight is : " + weight + "kg\n");
		System.out.println(printBMI());
	}
	
	private String printBMI(){
		double bmi = BMI();
		String result = "You are at a healthy and normal weight with " + bmi + "BMI";
		
		if (bmi > 25){
			result = "You are over weight with " + bmi + " BMI!!!";
		}
		else if(bmi <19){
			result = "You are underweigh with " + bmi + "BMI!!!";
		}
		
		
		return result;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	private double BMI(){
		double bmi = 0;
		bmi = weight / (height * height);
		
		return bmi;
	}
}
