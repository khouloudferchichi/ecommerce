package com.khouloud.gestiondestock.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name="commandeClient")

public class CommandeClient extends AbstractEntity {
	
	private String code;
	
	private Date dateCommande;
		
	@ManyToOne
	@JoinColumn(name = "idClient")
	private Client client;
	
	@OneToMany(mappedBy = "commandeClient")
	private List<LigneCommandeClient> LigneCommandeClients;
	
	

}
