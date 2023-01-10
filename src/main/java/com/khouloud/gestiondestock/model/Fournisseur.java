package com.khouloud.gestiondestock.model;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name="fournisseur")

public class Fournisseur extends AbstractEntity{
	
private String nom;
	
	private String prenom;
	
	@Embedded
	private Adresse adresse;
	
	private String photo;
	
	private String mail;
	
	private String numTel;
	
	@OneToMany(mappedBy = "fournisseur")
	private List<CommandeFournisseur> commandeFournisseurs;

}
