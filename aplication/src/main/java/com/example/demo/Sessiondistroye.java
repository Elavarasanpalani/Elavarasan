package com.example.demo;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sessiondistroye implements HttpSessionListener {
	@Autowired
	private Dataservices ser;

	public Dataservices getSer() {
		return ser;
	}

	public void setSer(Dataservices ser) {
		this.ser = ser;
	}
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("session created.........");
		HttpSessionListener.super.sessionCreated(se);
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		HttpSession hs=se.getSession();
		Object a=hs.getAttribute("name");
		Object b=hs.getAttribute("pass");
		if(a!=null && b!=null){
			
	
	String c=a.toString();
	String d=b.toString();
	System.out.println(c+d);
		
		getSer().setFlag(c, d, 0);
		System.out.println("session distroyer..");
			}
	}
	
	
}

