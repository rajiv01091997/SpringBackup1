package com.globallogic.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.globallogic.dao.Dao;
@Component
public class ServiceImplement {
	//@Qualifier("oracleImpl")
    @Autowired
	Dao oracleImpl;
//	@Qualifier("mysqlImpl")
//	@Autowired
//	Dao d;
	
	public void show()
	{
		oracleImpl.connect();
		//d.connect();
	}

}
