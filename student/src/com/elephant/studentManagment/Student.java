package com.elephant.studentManagment;

import javax.swing.*;

public class Student extends Person {

	private String id;
	private double gpa;
	private String major;
	
	public void setData() {
		String temp;
		super.setData();
		
		id = JOptionPane.showInputDialog(null,"Please input id");
		major = JOptionPane.showInputDialog(null,"Please input major");
	
		while(true) {
			try {
				temp = JOptionPane.showInputDialog(null,"Please input gpa");
				gpa = Double.parseDouble(temp);
				break;
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Please input legal gpa.");
			}
		}
	}
	
	public void display() {
		super.display();
		System.out.println("\tMajor:" + major + "\tGpa:" + gpa );
	}
	
	public String getMajor() {
		return major;
	}
	
	public double getGpa() {
		return gpa;
	}
}
