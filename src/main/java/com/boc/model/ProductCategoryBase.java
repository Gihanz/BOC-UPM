package com.boc.model;
// Generated Jun 10, 2016 11:13:38 AM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * ProductCategoryBase generated by hbm2java
 */
@Entity
@Table(name = "PRODUCT_CATEGORY_BASE", schema = "WFCONFIG", uniqueConstraints = @UniqueConstraint(columnNames = "PRODUCT_CATEGORY"))
public class ProductCategoryBase implements java.io.Serializable {

	private int productCategoryId;
	private String productCategory;
	private Set<ProductBase> productBases = new HashSet<ProductBase>(0);

	public ProductCategoryBase() {
	}

	public ProductCategoryBase(int productCategoryId, String productCategory) {
		this.productCategoryId = productCategoryId;
		this.productCategory = productCategory;
	}

	public ProductCategoryBase(int productCategoryId, String productCategory, Set<ProductBase> productBases) {
		this.productCategoryId = productCategoryId;
		this.productCategory = productCategory;
		this.productBases = productBases;
	}

	@Id

	@Column(name = "PRODUCT_CATEGORY_ID", unique = true, nullable = false)
	public int getProductCategoryId() {
		return this.productCategoryId;
	}

	public void setProductCategoryId(int productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	@Column(name = "PRODUCT_CATEGORY", unique = true, nullable = false, length = 25)
	public String getProductCategory() {
		return this.productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productCategoryBase")
	public Set<ProductBase> getProductBases() {
		return this.productBases;
	}

	public void setProductBases(Set<ProductBase> productBases) {
		this.productBases = productBases;
	}

}