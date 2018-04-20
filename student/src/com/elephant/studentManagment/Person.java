package com.elephant.studentManagment;

import javax.swing.*;

public class Person {
	private String name;
	private String gender;
	private String address;
	private String phone;
	
	public void setData() {
		name = JOptionPane.showInputDialog( null , "Please input name" );
		address = JOptionPane.showInputDialog( null, "Please input address" );
		gender = JOptionPane.showInputDialog(null,"Please input sex");
		phone = JOptionPane.showInputDialog(null,"Please input phone");
	}
	
	public void display() {
		System.out.println("Name:" + name + "\tGender:" + gender + 
				"\tAddress:" + address + "Phone:" + phone);
	}
}
