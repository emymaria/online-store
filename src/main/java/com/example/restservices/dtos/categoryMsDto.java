package com.example.restservices.dtos;

public class categoryMsDto {
	private Long categoryid;
	private String categoryname;
	public Long getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public categoryMsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public categoryMsDto(Long categoryid, String categoryname) {
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
	}
	
}
