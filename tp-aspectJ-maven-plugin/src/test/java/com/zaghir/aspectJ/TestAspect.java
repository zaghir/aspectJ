package com.zaghir.aspectJ;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zaghir.aspectJ.bean.Personne;
import com.zaghir.aspectJ.simpleService.PersonneService;


public class TestAspect {
	
	private static Logger log = LoggerFactory.getLogger(MainApp.class);
	
	@Test
	public void testAspectJ1(){
				
		//MainApp app = new MainApp();
		PersonneService service = new PersonneService();
		service.addPersonne(new Personne(1,"toto","ali","adresse ali"));
		service.addPersonne(new Personne(2,"toto","soufian","adresse soufian"));
		service.addPersonne(new Personne(3,"toto","mounir","adresse mounir"));
		
		log.info("list des personne {}" , service.retrieveListPersonne());
		
	}
}
