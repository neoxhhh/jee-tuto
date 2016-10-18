package entities;

import javax.persistence.Entity;

  @Entity
  public class Personne implements java.io.Serializable{
	Integer id;
	String name;
	String age;
	
	public Personne() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	

}
