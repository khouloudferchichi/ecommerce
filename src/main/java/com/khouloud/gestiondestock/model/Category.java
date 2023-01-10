package com.khouloud.gestiondestock.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category")

public class Category extends AbstractEntity{
	
	private String code;
	
	private String designation;
	
	@OneToMany(mappedBy = "category")
	private List<Article> articles;
	
	

}
