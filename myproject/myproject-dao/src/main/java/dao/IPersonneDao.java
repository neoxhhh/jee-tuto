package dao;

import entities.Personne;

public interface IPersonneDao {
	void addPersonneDao(Personne personne);
	Personne getPersonneByIdDao(Integer id);
}
