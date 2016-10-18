package metier;

import dao.IPersonneDao;
import entities.Personne;


public class PersonneMetierImpl implements IPersonneMetier {
	
	public IPersonneDao personneDao;

	public PersonneMetierImpl() {
 	}

	public Void addPersonne(Personne personne) {
		personneDao.addPersonneDao(personne);
		return null;
	}

	public Personne getPersonneById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
