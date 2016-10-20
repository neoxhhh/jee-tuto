package metier;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import dao.IPersonneDao;
import dao.PersonneDaoImpl;
import entities.Personne;

  public class PersonneMetierImpl implements IPersonneMetier {
	
	 
	public IPersonneDao personneDao;

	public PersonneMetierImpl() {
 
 	}

	public Void addPersonne(Personne personne) {
		if(personneDao == null) System.out.println("from metier personne Dao NULL");
		
		personneDao.addPersonneDao(personne);
		return null;
	}

	public Personne getPersonneById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public IPersonneDao getPersonneDao() {
		return personneDao;
	}

	public void setPersonneDao(IPersonneDao personneDao) {
		this.personneDao = personneDao;
	}
	
	

}
