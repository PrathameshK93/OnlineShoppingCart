package com.ghostriders.osc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`order`")
public class Order {

	@Id
	@Column(name = "order_id")
	private int OrderId;
	@Column(name = "order_date")
	private Date OrderDate;
	@Column(name = "order_delivery_address")
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
