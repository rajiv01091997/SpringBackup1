package com.globallogic.dao;

import org.springframework.stereotype.Component;

@Component
public class SBIbank implements Bank{
     int SbiBankInterestRate=4;
	@Override
	public void getInterest() {
		// TODO Auto-generated method stub
		float interest=(PRINCIPAL*SbiBankInterestRate*TIME)/100;
		System.out.println("Interest for SBI Bank will be: "+interest);
	}

}
