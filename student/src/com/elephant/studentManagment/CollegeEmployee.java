package com.elephant.studentManagment;

import javax.swing.*;

public class CollegeEmployee extends Person {
	private String ssn;
	private double annualSalary;
	private String dept;

	public void setData() {
		String temp;
		super.setData();
		ssn = JOptionPane.showInputDialog(null,"������Ա������ᱣ�պ�");
		
		while(true) {
			try {
				temp = JOptionPane.showInputDialog(null,"������Ա������н");
				annualSalary = Double.parseDouble(temp);
				break;
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null, "������Ϸ���нˮ");
			}
		}
	}
	
	public  void display () {
		super.display();
		System.out.println("\tSSN: " + ssn + "\t ��н:" + annualSalary);
	}
	
	public double getAnnualSalary() {
		return annualSalary;
	}

}
