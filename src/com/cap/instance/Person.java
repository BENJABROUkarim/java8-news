/**
 * @author kbenjabr 11 déc. 2017/15:31:15 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.instance;

public class Person {

	private String nom;
	private int age;

	public Person(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		//Person{name='jack', age=20}
		return "Person{name="+this.getNom()+","+" age="+this.getAge()+"}";
	}
}
