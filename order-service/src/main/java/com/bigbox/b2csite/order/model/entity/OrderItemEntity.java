package com.bigbox.b2csite.order.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OrderItemEntity {

	private long id;
	private String sku;
	private int quantity;
	private BigDecimal sellingPrice;
	private Date addedToOrderDateTime;
	private OrderEntity owningOrder;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(BigDecimal sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public Date getAddedToOrderDateTime() {
		return addedToOrderDateTime;
	}

	public void setAddedToOrderDateTime(Date addedToOrderDateTime) {
		this.addedToOrderDateTime = addedToOrderDateTime;
	}

	public OrderEntity getOwningOrder() {
		return owningOrder;
	}

	public void setOwningOrder(OrderEntity owningOrder) {
		this.owningOrder = owningOrder;
	}
}
