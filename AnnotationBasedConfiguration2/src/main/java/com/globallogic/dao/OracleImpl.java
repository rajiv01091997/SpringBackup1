package com.globallogic.dao;

import org.springframework.stereotype.Component;

@Component
public class OracleImpl implements Dao {

	@Override
	public void connect() {
		System.out.println("this is oracle Implementation");
		
	}

}
