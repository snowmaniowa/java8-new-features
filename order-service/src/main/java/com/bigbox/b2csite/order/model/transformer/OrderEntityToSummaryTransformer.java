package com.bigbox.b2csite.order.model.transformer;

import java.math.BigDecimal;

import com.bigbox.b2csite.order.model.domain.OrderSummary;
import com.bigbox.b2csite.order.model.entity.OrderEntity;
import com.bigbox.b2csite.order.model.entity.OrderItemEntity;

public class OrderEntityToSummaryTransformer {

	public OrderSummary transform(OrderEntity orderEntity) {
		
		if(orderEntity == null){
			return new OrderSummary();
		}		
		OrderSummary orderSummary = new OrderSummary();
		orderSummary.setOrderNumber(orderEntity.getOrderNumber());		
		
		int totalItems = 0;
		for(OrderItemEntity orderItemEntity : orderEntity.getOrderItemList()){
			totalItems += orderItemEntity.getQuantity();
		}		
		orderSummary.setItemCount(totalItems);		
		return orderSummary;
	}

}
