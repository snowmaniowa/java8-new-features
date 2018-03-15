package com.bigbox.b2csite.order.model.transformer;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bigbox.b2csite.order.model.domain.OrderSummary;
import com.bigbox.b2csite.order.model.entity.OrderEntity;

public class OrderEntityToSummaryTransformerTest {

	private OrderEntityToSummaryTransformer target;
	
	@Before
	public void setup(){
		target = new OrderEntityToSummaryTransformer();		
	}

	@Test
	public void test_Transform_Not_Null(){				
		OrderSummary resultOrderSummary = target.transform(null);		
		Assert.assertNotNull(resultOrderSummary);		
	}
	
	
	@Test
	public void test_Transform_Success(){		
		
		//Fixture
		String orderNumberFixture = UUID.randomUUID().toString();
		OrderEntity orderEntityFixture = new OrderEntity();
		
		//Execution
		orderEntityFixture.setOrderNumber(orderNumberFixture);
		
		//Assertion
		OrderSummary resultOrderSummary = target.transform(orderEntityFixture);		
		Assert.assertEquals(orderNumberFixture, resultOrderSummary.getOrderNumber());
	}
	
	
}
