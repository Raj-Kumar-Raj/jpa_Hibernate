package io.raj;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class pokemondelte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /// fetch and delete and commit transcation 
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("raj");
		 EntityManager entitymanager = entitymanagerfactory.createEntityManager();
			pokemon p = entitymanager.find(pokemon.class, "pikachu");
 EntityTransaction entitytransaction = entitymanager.getTransaction();
		 
		 entitytransaction.begin();
		 entitymanager.remove(p);
		 entitytransaction.commit();
	}

}
