package com.globallogic.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.globallogic.dao.Bank;
@Component
public class InterestCalculator {

@Qualifier("ICICIbank")
@Autowired
Bank bankICICI;

@Qualifier("SBIbank")
@Autowired
Bank bankSBI;

@Qualifier("axisBank")
@Autowired
Bank bankAXIS;

public void display()
{
	bankICICI.getInterest();
	bankSBI.getInterest();
	bankAXIS.getInterest();
}




}
