package com.khouloud.gestiondestock.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Embeddable
public class Adresse extends AbstractEntity{
	
	private String adresse1;
	
	private String adresse2;
	
	private String ville;
	
	private String codePostal;
	
	private String pays;

	public String getAdresse1() {
		return adresse1;
	}

	public void setAdresse1(String adresse1) {
		this.adresse1 = adresse1;
	}

	public String getAdresse2() {
		return adresse2;
	}

	public void setAdresse2(String adresse2) {
		this.adresse2 = adresse2;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}
	

}
