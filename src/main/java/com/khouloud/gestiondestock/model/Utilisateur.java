package com.khouloud.gestiondestock.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="users")

public class Utilisateur extends AbstractEntity{
	
	private String nom;

}
