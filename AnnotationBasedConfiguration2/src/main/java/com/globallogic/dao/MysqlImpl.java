package com.globallogic.dao;

import org.springframework.stereotype.Component;

@Component
public class MysqlImpl implements Dao {

	@Override
	public void connect() {
		System.out.println("this is mysql implementation");
		
	}

}
