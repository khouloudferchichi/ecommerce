package com.khouloud.gestiondestock.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity 
@Table(name="entreprise")

public class Entreprise extends AbstractEntity{
	
	private String nom;
	
	

}
