/**
 * @author kbenjabr 18 juil. 2017/11:14:26 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.defaultmethod;

public interface SoftwareEngineer {
	/** Pas d'implémentation - comme en Java 7 et antérieur */
	public void grade();

	/** Implémentation par défaut, qu'on surchargera dans la classe fille */
	default void print() {
		System.out.println("Bonjour, je suis un ingénieur de Logiciel chez capgemini");
	}

	/** Implémentation par défaut, non surchargée dans la classe fille */
	default void specialite() {
		System.out.println("ma spécialité est FRONT END");
	}
}
