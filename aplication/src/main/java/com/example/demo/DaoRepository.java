package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DaoRepository extends JpaRepository<Data, Integer> {
	
	
	@Query("from Data order by userid Asc")
	public List<Data> checkUid();
		
	@Query("from Data where username=?1 and password=?2")
	public List<Data> checkUser(String usname,String passwd);
	
	
	

}
	