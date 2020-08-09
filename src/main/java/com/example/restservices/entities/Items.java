package com.example.restservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="items")
public class Items {
	
	@Id
	@GeneratedValue
	private long itemid;
	
	@Column(name="ITEM_NAME",length=50,nullable=false)
	private String itemname;
	
	@Column(name="QUANTITY",length=50,nullable=false)
	private String quantity;
	
	@Column(name="STOCK",nullable=false)
	private Long stock;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private Shops shop;

	public long getItemid() {
		return itemid;
	}

	public void setItemid(long itemid) {
		this.itemid = itemid;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Long getStock() {
		return stock;
	}

	public void setStock(Long stock) {
		this.stock = stock;
	}

	public Shops getShop() {
		return shop;
	}

	public void setShop(Shops shop) {
		this.shop = shop;
	}

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
