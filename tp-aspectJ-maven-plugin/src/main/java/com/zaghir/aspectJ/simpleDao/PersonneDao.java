package com.zaghir.aspectJ.simpleDao;

import java.util.ArrayList;
import java.util.List;

import com.zaghir.aspectJ.bean.Personne;

public class PersonneDao {
	
	private List<Personne> listPersonne = new ArrayList<Personne>();
	
	public List<Personne> retrieveListPersonne( ){
		return listPersonne ;
	}
	public void addPersonne(Personne p){
		listPersonne.add(p);
	}
	public void removePersonne(Personne p){
		listPersonne.remove(p);
	}
	
	public void removeAllPersonne(){
		listPersonne.clear();
	}
	
}
