package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Personne;

public class PersonneDaoImpl implements IPersonneDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public PersonneDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	public void addPersonneDao(Personne personne) {
		System.out.println("from add personne dao");
		
	}

	public Personne getPersonneByIdDao(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
