package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import entities.Personne;

@Repository
@Transactional
public class PersonneDaoImpl implements IPersonneDao {
	
	@PersistenceContext()
	private EntityManager entityManager;
	
	public PersonneDaoImpl() {
  	}
	
	public void addPersonneDao(Personne personne) {
		System.out.println("from add personne dao");
		if(entityManager == null) System.out.println("Em is still null");
		entityManager.persist(personne);
		
	}

	public Personne getPersonneByIdDao(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	

}
