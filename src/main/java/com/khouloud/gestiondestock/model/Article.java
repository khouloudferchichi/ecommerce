package com.khouloud.gestiondestock.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="article")
public class Article extends AbstractEntity{
	
	private String codeArticle;
	
	private String designation;
	
	private BigDecimal prixUnitaireHt;
	
	private BigDecimal tauxTva;

	private BigDecimal prixUnitaireTtc;
	
	private String photo;
	
	@ManyToOne
	@JoinColumn(name = "idcategory")
	private Category category;
 
	public String getCodeArticle() {
		return codeArticle;
	}

	public void setCodeArticle(String codeArticle) {
		this.codeArticle = codeArticle;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public BigDecimal getPrixUnitaireHt() {
		return prixUnitaireHt;
	}

	public void setPrixUnitaireHt(BigDecimal prixUnitaireHt) {
		this.prixUnitaireHt = prixUnitaireHt;
	}

	public BigDecimal getTauxTva() {
		return tauxTva;
	}

	public void setTauxTva(BigDecimal tauxTva) {
		this.tauxTva = tauxTva;
	}

	public BigDecimal getPrixUnitaireTtc() {
		return prixUnitaireTtc;
	}

	public void setPrixUnitaireTtc(BigDecimal prixUnitaireTtc) {
		this.prixUnitaireTtc = prixUnitaireTtc;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, codeArticle, designation, photo, prixUnitaireHt, prixUnitaireTtc, tauxTva);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		return Objects.equals(category, other.category) && Objects.equals(codeArticle, other.codeArticle)
				&& Objects.equals(designation, other.designation) && Objects.equals(photo, other.photo)
				&& Objects.equals(prixUnitaireHt, other.prixUnitaireHt)
				&& Objects.equals(prixUnitaireTtc, other.prixUnitaireTtc) && Objects.equals(tauxTva, other.tauxTva);
	}

	
}
