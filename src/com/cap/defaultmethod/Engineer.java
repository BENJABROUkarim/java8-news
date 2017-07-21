/**
 * @author kbenjabr 18 juil. 2017/11:19:15 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.defaultmethod;

public class Engineer implements SoftwareEngineer {

	private String nom;
	private long salaire;
	private int age;

	public Engineer() {
		super();
	}

	public Engineer(String nom, int salaire, int age) {
		this.nom = nom;
		this.salaire = salaire;
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getSalaire() {
		return salaire;
	}

	public void setSalaire(long salaire) {
		this.salaire = salaire;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void grade() {
		System.out.println("mon grade est A");
	}

	@Override
	public void print() {
		System.out.println("hello i'am a software enginneer");
	}

	@Override
	public String toString() {
		return "Ingénieur" + "[" + "nom" + "=" + nom + "," + "salaire" + "=" + salaire + "," + "age" + "=" + age + "]";
	}

}
