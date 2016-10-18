package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IPersonneDao;
import entities.Personne;

@Service("PersonneMetier")
public class PersonneMetierImpl implements IPersonneMetier {
	
	@Autowired
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
