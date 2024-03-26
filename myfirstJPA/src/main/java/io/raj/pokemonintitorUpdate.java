package io.raj;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class pokemonintitorUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // fetch pekachu and update its power to 200 and transcation commit 
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("raj");
		 EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		 EntityTransaction entitytransaction = entitymanager.getTransaction();
		pokemon p = entitymanager.find(pokemon.class, "pikachu");
		if(p!=null) {
			p.setPower(200);
			entitytransaction.begin();
			 entitymanager.persist(p);
			 entitytransaction.commit();
		}else {
			System.out.println("entry dosen't exits");
		}
	}

}
