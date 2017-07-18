/**
 * @author kbenjabr 18 juil. 2017/11:14:26 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.defaultmethod;

public interface SoftwareEngineer {
	/** Pas d'impl�mentation - comme en Java 7 et ant�rieur */
	public void grade();

	/** Impl�mentation par d�faut, qu'on surchargera dans la classe fille */
	default void print() {
		System.out.println("Bonjour, je suis un ing�nieur de Logiciel chez capgemini");
	}

	/** Impl�mentation par d�faut, non surcharg�e dans la classe fille */
	default void specialite() {
		System.out.println("ma sp�cialit� est FRONT END");
	}
}
