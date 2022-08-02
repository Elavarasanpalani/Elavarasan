package com.example.demo;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/moon")
public class ControlerOn {
	@Autowired
	private OnlineServices ser;

	public OnlineServices getSer() {
		return ser;
	}

	public void setSer(OnlineServices ser) {
		this.ser = ser;
	}
	
//	@RequestMapping(method = RequestMethod.GET,value = "/go")
//	public ModelAndView lodefile() {
//		ModelAndView mo=new ModelAndView();
//		
//		mo.addObject("login",new Online());
//		mo.setViewName("login");
//		System.out.println("workadfkab...........");
//		return mo;
//		
//	}
//	@RequestMapping(method=RequestMethod.POST,value="/go")
//	public ModelAndView process(HttpServletRequest request) {
//		ModelAndView mo=new ModelAndView();
//		System.out.println("adfkahdfk/.............");
//		
//		String name=request.getParameter("uname");
//		String pass=request.getParameter("upass");
//		
//		List<Online> list=ser.Checkuser(name, pass);
//		Iterator<Online> iter=list.iterator();
//		while(iter.hasNext()) {
//			
//			mo.setViewName("welcome");
//			System.out.println("erooreeeee......");
//			return mo;
//		}
//		
//		mo.setViewName("error");
//		System.out.println("error page show");
//		return mo;
//		
//	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/go")
	public ModelAndView lodepro() {
		ModelAndView mo=new ModelAndView();
		Online on=new Online();
		on.setUflag(0);
		mo.addObject("user",on);
		mo.setViewName("register");
		return  mo;
	}
	@RequestMapping(method = RequestMethod.POST,value = "/go")
	public ModelAndView por(@ModelAttribute ("user") Online op) {
		ModelAndView mo=new ModelAndView();
		List<Online> list=ser.checkuid(op); 
		Iterator<Online> iter=list.iterator();
		int f=0;
		while(iter.hasNext()) {
			f=iter.next().getUid();
			
		}
		int g=f+1;
		op.setUid(g);
		
		mo.addObject("user",op);
		ser.saveEmploye(op);
		 mo.setViewName("welcome");
		
		return mo;
		
	}
	

}



