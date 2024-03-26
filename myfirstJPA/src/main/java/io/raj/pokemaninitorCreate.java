
package io.raj;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class pokemaninitorCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        pokemon p1  = new pokemon();
        p1.setName("pikachu");
        p1.setPower(100);
        p1.setType("electricl");
        
         EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("raj");
		 EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		 EntityTransaction entitytransaction = entitymanager.getTransaction();
		 
		 entitytransaction.begin();
		 entitymanager.persist(p1);
		 entitytransaction.commit();
	}

}