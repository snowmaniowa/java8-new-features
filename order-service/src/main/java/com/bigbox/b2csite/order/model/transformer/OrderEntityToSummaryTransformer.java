package com.bigbox.b2csite.order.model.transformer;

import com.bigbox.b2csite.order.model.domain.OrderSummary;
import com.bigbox.b2csite.order.model.entity.OrderEntity;

public class OrderEntityToSummaryTransformer {

	public OrderSummary transform(OrderEntity entity) {
		
		if(entity == null){
			return new OrderSummary();
		}		
		OrderSummary orderSummary = new OrderSummary();
		orderSummary.setOrderNumber(entity.getOrderNumber());		
		return orderSummary;
	}

}
