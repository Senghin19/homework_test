package com.elephant.studentManagment;

import javax.swing.*;
public class CollegeList {
	public static void main(String[] args) {
		CollegeEmployee[] emp = new CollegeEmployee[10];
		Student[] stu = new Student[10];
		int empCount = 0,  stuCount = 0;
		char letter;
		String input;
		int x;
		double maxAnnualSalary = 0, tempAnnualSalary;
		double sumAnnualSalary = 0;
		double maxGpa = 0, tempGpa,sumGpa = 0;
		input = JOptionPane.showInputDialog(null,"输入C录入员工信息" 
		+ "\n输入S录入学生信息" + "\n输入Q退出" );
		input = input.toUpperCase();
		letter = input.charAt(0);
		
		while( letter != 'Q' ) {
			if (letter == 'C') {
				if(empCount < emp.length) {
					CollegeEmployee c = new CollegeEmployee();
					c.setData();
					++empCount;
					
					//计算平均年薪和最高年薪
					tempAnnualSalary = c.getAnnualSalary();
					sumAnnualSalary = tempAnnualSalary + sumAnnualSalary;
					
					//获取最高年薪
					if(tempAnnualSalary > maxAnnualSalary) {
						maxAnnualSalary = tempAnnualSalary;
					}
				}else {
					JOptionPane.showMessageDialog(null,"对不起，录入太多的员工信息");
				}
			}else if (letter == 'S') {
				if (stuCount < stu.length) {
					Student s = new Student();
					s.setData();
					stu[stuCount] = s;
					++stuCount;
					
					//计算平均学分和最高学分
					tempGpa = s.getGpa();
					sumGpa = tempGpa + sumGpa;
					if (tempGpa > maxGpa) {
						maxGpa = tempGpa;
					}
				}else {
					JOptionPane.showMessageDialog(null,"对不起，录入太多的学生信息");
				}
			}
			
			input = JOptionPane.showInputDialog(null,"输入C录入员工信息" 
					+ "\n输入S录入学生信息" + "\n输入Q退出" );
			input = input.toUpperCase();
			letter = input.charAt(0);
		}

		System.out.println("\n员工信息：");
		if (empCount == 0)
			System.out.println("没有录入员工信息");
		else
			for (x = 0 ; x < empCount ; x++ ) {
				emp[x].display();
			}
		System.out.println("\n以上员工中的最高年薪是：" + maxAnnualSalary 
				+ "平均年薪是：" + sumAnnualSalary / empCount);
		
		System.out.println("\n学生信息");
		if (stuCount == 0)
			System.out.println("没有录入学生信息");
		else
			for (x = 0 ; x < stuCount ; x++)
				stu[x].display();
		System.out.println("\n以上学生中的最高学分" + maxGpa 
				+ "平均学分：" + sumGpa / stuCount );
		System.exit(0);
	}

}
