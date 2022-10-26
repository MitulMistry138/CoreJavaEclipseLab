package com.Studentfees;

import java.util.HashMap;
import java.util.Scanner;

public class StudentFees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating a hashmap
		HashMap<String, StudentInfo> sfees = new HashMap<>();

		// decalring a variable
		String idd;

		// creating scanner object
		Scanner sc = new Scanner(System.in);

		// creating Student Information Object
		StudentInfo std_info = new StudentInfo();

		// adding some data
		sfees.put("1", new StudentInfo(1, "Mitul", "10th", "Arts", 10000));
		sfees.put("2", new StudentInfo(2, "SAm", "12th", "Science", 4500));
		sfees.put("3", new StudentInfo(3, "Joe", "FY ", "Digital art", 6000));
		sfees.put("4", new StudentInfo(4, "June", "SY", "sketch art", 2000));
		sfees.put("5", new StudentInfo(5, "Liva", "TY", "Graphic designer", 25000));

		System.out.println(">>>> Welcome too the Student Portal <<<<");
		System.out.println("***********************************");
		System.out.println("Enter The Id of Student:");
		idd = sc.nextLine();

		// checking if Student is present in the map or not
		boolean status = sfees.containsKey(idd);

		// displaying the information
		if (status) {
			System.out.println("************Student Details*************");
			std_info = sfees.get(idd);
			System.out.println(std_info);

		}

		else {
			System.out.println("Error 404 Student Not found ");
		}

		sc.close();

	}

}
