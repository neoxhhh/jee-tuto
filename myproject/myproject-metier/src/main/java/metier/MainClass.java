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
		PersonneMetierImpl pmetier = new PersonneMetierImpl();
		
		ApplicationContext appContext =  new ClassPathXmlApplicationContext("spring-dao.xml");
		System.out.println("step 1");
		IPersonneDao personneDao = (PersonneDaoImpl) appContext.getBean("personneDaoImpl");
		System.out.println("step 2");
		pmetier.setPersonneDao(personneDao);
		System.out.println("step 3");
		
		
		Personne p = new Personne();
		p.setName("EL BEDRAOUI");
		p.setAge("27");
		pmetier.addPersonne(p);

	}

}
