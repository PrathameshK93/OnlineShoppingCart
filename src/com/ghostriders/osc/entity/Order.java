package com.ghostriders.osc.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="`Order`")
public class Order {

	@Id
	private int OrderId;
	private Date OrderDate;
	private String OrderDA;

	public int getOrderId() {
		return OrderId;
	}

	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

	public Date getOrderDate() {
		return OrderDate;
	}

	public void setOrderDate(Date orderDate) {
		OrderDate = orderDate;
	}

	public String getOrderDA() {
		return OrderDA;
	}

	public void setOrderDA(String orderDA) {
		OrderDA = orderDA;
	}

}
