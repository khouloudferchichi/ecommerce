package com.khouloud.gestiondestock.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity 
@Table(name="ventes")

public class Ventes extends AbstractEntity{
	
	private String code;

}
