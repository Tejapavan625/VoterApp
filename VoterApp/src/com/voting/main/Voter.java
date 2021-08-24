package com.voting.main;

import java.util.Scanner;

import com.voting.exceptions.NotEligibleException;
import com.voting.service.ElectionBooth;

public class Voter {

	public static void main(String[] args) {

		ElectionBooth booth  = new ElectionBooth();
		//booth.checkEligibility(age, locality, vid)
		int age;
		String locality;
		int vid;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("enter the locality");
		sc.nextLine();
		locality=sc.nextLine();
		System.out.println("enter the vid");
		vid=sc.nextInt();
		
		
		
		
		try {
			boolean b= booth.checkEligibility(age,locality,vid);
			if(b==true)
				System.out.println("yourvote casted");
		} catch (NotEligibleException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
