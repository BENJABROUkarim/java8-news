/**
 * @author kbenjabr 8 déc. 2017/15:08:32 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.instance;

public class Developpeur {

	private int age;
	private String nom;

	public Developpeur(int age, String nom) {
		super();
		this.age = age;
		this.nom = nom;
	}

	public final int getAge() {
		return age;
	}

	public final void setAge(int age) {
		this.age = age;
	}

	public final String getNom() {
		return nom;
	}

	public final void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return this.nom + "," + this.age;
	}

}
