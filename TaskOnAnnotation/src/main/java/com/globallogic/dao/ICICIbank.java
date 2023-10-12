package com.globallogic.dao;

import org.springframework.stereotype.Component;

@Component
public class ICICIbank implements Bank{
     int IciciBankInterestRate=6;
	@Override
	public void getInterest() 
	{
		
	  float interest=(PRINCIPAL*IciciBankInterestRate*TIME)/100;
	  System.out.println("Interest for ICICI bank will be: "+interest);
	}

	
	
}
