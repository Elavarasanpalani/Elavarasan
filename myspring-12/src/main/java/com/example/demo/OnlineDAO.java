package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OnlineDAO   extends JpaRepository<Online, Integer>{
	
//	@Query("from Online where uname=?1 and upass=?2")
//	public List<Online>  checkuser(String name,String pass);
	

	@Query("from Online order by uid ASC")
	public List<Online> checkkid(Online d);

	

}
