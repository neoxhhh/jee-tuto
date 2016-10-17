package metier;

import entities.Personne;

public interface IPersonneMetier {
	Void addPersonne(Personne personne);
	Personne getPersonneById(Integer id);
}
