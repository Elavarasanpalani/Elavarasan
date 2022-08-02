package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class OnlineServices {
	@Autowired
	private OnlineDAO on;

	public OnlineDAO getOn() {
		return on;
	}

	public void setOn(OnlineDAO on) {
		this.on = on;
	}
	public void saveEmploye(Online onn) {
		getOn().save(onn);
	}
	
	
//	public List<Online> Checkuser(String name,String pass){
//		return getOn().checkuser(name, pass);
//	}
	
	
	public List<Online> checkuid(Online op){
		return getOn().checkkid(op);
		
	}

}
