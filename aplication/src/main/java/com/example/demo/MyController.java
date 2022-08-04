package com.example.demo;

import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/shopping")
public class MyController {
	
	@Autowired
	private Dataservices servicetest;

	public Dataservices getServicetest() {
		return servicetest;
	}

	public void setServicetest(Dataservices servicetest) {
		this.servicetest = servicetest;
	}
	
	
	@RequestMapping(method = RequestMethod.GET,value="/reg")
	public ModelAndView loadReg(Data dtouser) {
		
		ModelAndView mv= new ModelAndView();
		
		mv.addObject("obj", dtouser);
		mv.setViewName("register");		
		return mv;
		
	}
	
	
	@RequestMapping(method = RequestMethod.POST,value="/reg")
	public ModelAndView process(@Valid @ModelAttribute("obj") Data dtouser ,BindingResult result,HttpServletRequest request) {
		
		ModelAndView mv= new ModelAndView();
		if(result.hasErrors()) {
			mv.setViewName("register");
		}
		
		else {	
			if(dtouser.getPassword().equals(request.getParameter("password2"))) {
				
				mv.addObject("obj", dtouser);
				dtouser.setFlag(0);
				dtouser.setUserid(getServicetest().checkUid());
				getServicetest().saveDto(dtouser);
				mv.setViewName("login");		
				return mv;
				
				}else {
					
					mv.setViewName("register");		
					return mv;
				
				}
		}
		return mv;
		
		
	
		
	}

	
	@RequestMapping(method = RequestMethod.GET,value="/log")
	public String loadlog(Data dtouser) {
		
		return "login";
		
	}
	
	
	@RequestMapping(method = RequestMethod.POST,value="/log")
	public ModelAndView processlog(HttpServletRequest request,Data dtouser1) {
		
		
		ModelAndView mv= new ModelAndView();
		
	String name=request.getParameter("username");
	String pass=request.getParameter("password");
	
	List<Data> lis=getServicetest().checkUser(name, pass);
	Iterator<Data> tr=lis.iterator();
	
	request.getSession().setAttribute("name",name);
	request.getSession().setAttribute("pass", pass);
	
	while(tr.hasNext()) {
		request.setAttribute("name", name);
		request.setAttribute("pass", pass);
		Data dto2=tr.next();
		if(dto2.getFlag()==0) {
			 
			
		HttpSession hs=request.getSession();
		hs.setMaxInactiveInterval(30);
		getServicetest().setFlag(name, pass, 1);
			
		mv.setViewName("welcome");
		
		return mv;
		}else {
			
		mv.setViewName("logout");
		return mv;
		}
	}
		
		mv.addObject("obj",dtouser1);
		
		mv.setViewName("register");
		
		return mv;
		
	}
	
	@RequestMapping(method = RequestMethod.GET,value="/logout")
	public String logout(HttpServletRequest request) {
		
		getServicetest().setFlag(request.getParameter("name"),request.getParameter("pass"),0);
		
		return "login";
		
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/shops")
	public String shop(HttpServletRequest request) {
		
		Enumeration<String> emnu=request.getParameterNames();
		
		HttpSession h=request.getSession();
		
		while(emnu.hasMoreElements()) {
			
			String a=emnu.nextElement().toString();
			String b=request.getParameter(a);
			h.setAttribute(a, b);
			
			
		}
		return request.getParameter("shop");
		
	}
	
	@RequestMapping("/img")
	public void getimg(HttpServletRequest request,HttpServletResponse response) {
		response.setContentType("image/jpg");
		String a=request.getParameter("shopname");
		String b=request.getParameter("name");
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/anound","root","root");
			String sql="select * from "+a+" where name=?";
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1, b);
			
			ResultSet re=st.executeQuery();
			while(re.next()) {
			
				byte[] by=re.getBytes(3);
				OutputStream op=response.getOutputStream();
				op.write(by);
				op.flush();
				op.close();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	
	
	
	
	
	
	

}
