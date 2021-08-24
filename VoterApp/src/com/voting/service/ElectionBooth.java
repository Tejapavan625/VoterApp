package com.voting.service;

import com.voting.exceptions.*;

public class ElectionBooth {
	String localities[] = {"ABC Nagar","XYZ Nagar","RK Nagar"};
	
	//if age is less than 18 throw exception
	boolean checkAge(int age) throws UnderAgeException{
		if(age<18) {
			throw new UnderAgeException("you are underage ");
		}
		return true;
	} 
	// check if the locality matches with the array
	boolean checkLocality(String locality ) throws LocalityNotFoundException{
		boolean check= false;
		for(String c : localities) {
			if(c.equals(locality)) {
				check= true;
			}
		} if(check==false) {
			throw new LocalityNotFoundException("locality is not matching");
		}
		return true;
	}
	//check if id is within 1000 - 9000
	boolean checkVoterId(int vid ) throws NoVoterIDException{
		 if(vid<1000 || vid>9000) {
			 throw new NoVoterIDException("Voter id not found");
		 }
	
		return true;
	}
	public boolean checkEligibility(int age,String locality,int vid)
			throws NotEligibleException{
		//call all three methods 
		//handle the exception
		//throw it to the voter
		boolean a= checkAge(age);
		boolean b =checkLocality(locality);
		boolean c=checkVoterId(vid);
		
		if(a==true &&b==true && c==true) {
			return true;
		}else {
			return false;
			
		}
		
		
		
		
		
		
		
	
	}

}
