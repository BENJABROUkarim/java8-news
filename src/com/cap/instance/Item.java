/**
 * @author kbenjabr 12 déc. 2017/14:49:54 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.instance;

import java.math.BigDecimal;

public class Item {

	private String nom;
	private int qte;
	private BigDecimal price;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Item(String nom, int qte, BigDecimal price) {
		super();
		this.nom = nom;
		this.qte = qte;
		this.price = price;
	}

}
