package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import dao.IPersonneDao;
import entities.Personne;

@Service("PersonneMetier")
public class PersonneMetierImpl implements IPersonneMetier {
	
	@Autowired
	public IPersonneDao personneDao;

	public PersonneMetierImpl() {
	 ApplicationContext appContext =  new ClassPathXmlApplicationContext("spring-dao.xml");

 	}

	public Void addPersonne(Personne personne) {
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
