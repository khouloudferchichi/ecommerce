package com.khouloud.gestiondestock.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table(name="ligneCommandeFournisseur")

public class LigneCommandeFournisseur extends AbstractEntity{
	
	@ManyToOne
	@JoinColumn(name ="idCommandeFournisseur")
	private CommandeFournisseur commandeFournisseur;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	

}
