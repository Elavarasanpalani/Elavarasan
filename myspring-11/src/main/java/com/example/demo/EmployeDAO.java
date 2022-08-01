package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeDAO  extends JpaRepository<Employe, Integer>{
	
	
	@Query("from Employe where kname=?1 and kpassword=?2")
	public List<Employe> CheckUser(String name,String pass);
	

	@Query("from Employe order by kid ASC")
	public List<Employe> checkkid(Employe d);

}
