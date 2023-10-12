package com.globallogic.Application;

import com.globallogic.Modal.Payment;
import com.globallogic.Service.UPIpayment;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Payment payment=new Payment();
payment.transfer();
Payment payment1=new UPIpayment();//Upcasting (using parent reference to store child object)
payment1.transfer();


	}

}
