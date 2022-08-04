package com.example.demo;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Dataservices {
	
	@Autowired
	private DaoRepository daoRepository;
	
	
	
	public DaoRepository getDaoRepository() {
		return daoRepository;
	}



	public void setDaoRepository(DaoRepository daoRepository) {
		this.daoRepository = daoRepository;
	}



	public void saveDto(Data dtouser) {
		getDaoRepository().save(dtouser);
		
	}
	
	
	public int checkUid()
	{
		
		List<Data> a = getDaoRepository().checkUid();
		Iterator<Data> itr=a.iterator();
		int b=0;
		while(itr.hasNext())
		{
			Data sto=itr.next();
			b=sto.getFlag();
		}
		
		return b+1;
		
	}
	
	
	public List<Data> checkUser(String usname,String passwd)
	{
		return getDaoRepository().checkUser(usname, passwd);
		
	}
	
	public void setFlag(String usname,String passwd,int a)	
	{
		
		List<Data> dto=getDaoRepository().checkUser(usname, passwd);
		Iterator<Data> itr=dto.iterator();
		while(itr.hasNext()) {
			Data dtouser=itr.next();
			dtouser.setFlag(a);
			getDaoRepository().save(dtouser);
			
		}
		
		
	}
	
}













