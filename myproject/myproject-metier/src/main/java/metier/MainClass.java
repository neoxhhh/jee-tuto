package metier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import dao.IPersonneDao;
import dao.PersonneDaoImpl;
import entities.Personne;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Salut");
		PersonneMetierImpl pm = new PersonneMetierImpl();
		
		ApplicationContext appContext =  new ClassPathXmlApplicationContext("applicationContext.xml");
		IPersonneDao personneDao = (PersonneDaoImpl) appContext.getBean("personneDaoImpl");
		pm.setPersonneDao(personneDao);
		
		
		Personne p = new Personne();
		p.setName("EL BEDRAOUI");
		p.setAge("27");
		pm.addPersonne(p);

	}

}
