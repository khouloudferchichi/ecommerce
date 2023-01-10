package com.khouloud.gestiondestock.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ligneVente")

public class LigneVente extends AbstractEntity{
	
	@ManyToOne
	@JoinColumn(name= "idVente")
	private  Ventes vente;
	
	private BigDecimal quantite;

}
