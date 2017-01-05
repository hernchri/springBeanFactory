package com.hernchri.spring;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class prjBMICalculator {

	public static void main(String args[]){
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		Calculate bmi = (Calculate) factory.getBean("bmiCalc"); 
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter your height in meters : ");
		bmi.setHeight(s.nextDouble());
		System.out.println("Please enter your weight in kg : ");
		bmi.setWeight(s.nextDouble());
		bmi.getBMI();
	}
}
