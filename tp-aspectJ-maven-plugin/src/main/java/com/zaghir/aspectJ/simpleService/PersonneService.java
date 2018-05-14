package com.zaghir.aspectJ.simpleService;

import java.util.List;

import com.zaghir.aspectJ.bean.Personne;
import com.zaghir.aspectJ.simpleDao.PersonneDao;

public class PersonneService {

	private PersonneDao dao = new PersonneDao();
	
	public List<Personne> retrieveListPersonne( ){
		return dao.retrieveListPersonne() ;
	}
	public void addPersonne(Personne p){
		dao.addPersonne(p);
	}
	public void removePersonne(Personne p){
		dao.removePersonne(p);
	}
	
	public void removeAllPersonne(){
		dao.removeAllPersonne();
	}
}
