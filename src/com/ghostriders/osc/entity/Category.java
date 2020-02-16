package com.ghostriders.osc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Category {

	@Id
	private int cid;
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	private String CategoryType;

	public String getCategoryType() {
		return CategoryType;
	}

	public void setCategoryType(String categoryType) {
		CategoryType = categoryType;
	}

}
