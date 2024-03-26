package io.raj;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class pokemonintiatorRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("raj");
		 EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		pokemon p = entitymanager.find(pokemon.class, "pikachu");
		System.out.println(p);
	}

}
