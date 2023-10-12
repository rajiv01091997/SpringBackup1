package com.globallogic.dao;

import org.springframework.stereotype.Component;

@Component
public class AxisBank implements Bank{
      int AxisBankInterestRate=9;
	@Override
	public void getInterest() {
		// TODO Auto-generated method stub
		float interest=(PRINCIPAL*AxisBankInterestRate*TIME)/100;
		System.out.println("Interest for Axis Bank will be: "+interest);
	}

}
