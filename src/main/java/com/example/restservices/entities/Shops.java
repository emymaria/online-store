package com.example.restservices.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="shops")
public class Shops {
	
	@Id
	@GeneratedValue
	private Long shopid;
	
	@Column(name="SHOP_NAME",length=50,nullable=false)
	private String shopname;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private Category category;
	
	@OneToMany(mappedBy="shop")
	private List<Items>items;

	

	public Shops() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shops(Long shopid, String shopname, String category) {
		super();
		this.shopid = shopid;
		this.shopname = shopname;
	}

	public Long getShopid() {
		return shopid;
	}

	public void setShopid(Long shopid) {
		this.shopid = shopid;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	
	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Shops [shopid=" + shopid + ", shopname=" + shopname + "]";
	}
	
	
}
