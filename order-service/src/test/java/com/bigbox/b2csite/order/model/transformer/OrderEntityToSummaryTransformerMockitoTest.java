package com.bigbox.b2csite.order.model.transformer;

import java.util.UUID;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bigbox.b2csite.order.model.domain.OrderSummary;
import com.bigbox.b2csite.order.model.entity.OrderEntity;
import com.bigbox.b2csite.order.model.entity.OrderItemEntity;

public class OrderEntityToSummaryTransformerMockitoTest {

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
		
		//Assertion/Verification
		OrderSummary resultOrderSummary = target.transform(orderEntityFixture);		
		Assert.assertEquals(orderNumberFixture, resultOrderSummary.getOrderNumber());
	}

	
	@Test
	public void test_Transform_Item_Count(){		
		
		//Fixture
		String orderNumberFixture = UUID.randomUUID().toString();
		OrderEntity orderEntityFixture = new OrderEntity();
		
		OrderItemEntity item1Fixture = new OrderItemEntity();
		item1Fixture.setQuantity(1);
		orderEntityFixture.getOrderItemList().add(item1Fixture);
		
		OrderItemEntity item2Fixture = new OrderItemEntity();
		item2Fixture.setQuantity(2);
		orderEntityFixture.getOrderItemList().add(item2Fixture);
		
		OrderItemEntity item3Fixture = new OrderItemEntity();
		item3Fixture.setQuantity(3);
		orderEntityFixture.getOrderItemList().add(item3Fixture);
				
		//Execution
		orderEntityFixture.setOrderNumber(orderNumberFixture);
		
		//Assertion
		OrderSummary resultOrderSummary = target.transform(orderEntityFixture);		
		Assert.assertEquals(6, resultOrderSummary.getItemCount());
	}
	
	@After
	public void tearDown(){
		target = null;		
	}

	
}
