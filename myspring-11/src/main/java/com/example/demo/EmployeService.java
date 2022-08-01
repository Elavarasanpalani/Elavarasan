package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployeService {
	@Autowired
	private EmployeDAO edao;

	public EmployeDAO getEdao() {
		return edao;
	}

	public void setEdao(EmployeDAO edao) {
		this.edao = edao;
	}

	
	public void saveEmployee(Employe emp) {
		getEdao().save(emp);
}
public List<Employe> checkUser(String name,String pass){
		
		return getEdao().CheckUser(name, pass);
		
	}
	public List<Employe> checkUID(Employe d) {
		
		return getEdao().checkkid(d);
		
	}
	
}
