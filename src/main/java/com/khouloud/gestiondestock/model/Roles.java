package com.khouloud.gestiondestock.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity 
@Table(name="roles")

public class Roles extends AbstractEntity{

	private String nom;
}
