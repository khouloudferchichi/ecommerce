package com.khouloud.gestiondestock.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mvtStk")

public class MvtStk extends AbstractEntity{
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;

}
