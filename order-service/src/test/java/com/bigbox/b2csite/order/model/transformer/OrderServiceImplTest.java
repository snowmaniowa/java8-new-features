package com.bigbox.b2csite.order.model.transformer;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.bigbox.b2csite.common.DataAccessException;
import com.bigbox.b2csite.common.ServiceException;
import com.bigbox.b2csite.order.dao.OrderDao;
import com.bigbox.b2csite.order.model.domain.OrderSummary;
import com.bigbox.b2csite.order.model.entity.OrderEntity;
import com.bigbox.b2csite.order.model.entity.OrderItemEntity;
import com.bigbox.b2csite.order.service.impl.OrderServiceImpl;

import junit.framework.Assert;

//Mockito works in when-then model
public class OrderServiceImplTest {

	private static final int CUSTOMER_ID = 1;

	@Test
	public void test_getOrderSummary_success() throws ServiceException, DataAccessException{
		
		//Fixture
		OrderServiceImpl target = new OrderServiceImpl();		
		OrderDao mockitoOrderDao = Mockito.mock(OrderDao.class);
		target.setOrderDao(mockitoOrderDao);
		OrderEntityToOrderSummaryTransformer mockitoTransformer = Mockito.mock(OrderEntityToOrderSummaryTransformer.class);		
		target.setTransformer(mockitoTransformer);

		//Stubbling input
		OrderEntity orderEntityFixture = new OrderEntity();
		List<OrderEntity> orderEntityListFixture = new LinkedList<>();		
		orderEntityListFixture.add(orderEntityFixture);
		
		//Stubbling output
		OrderSummary orderSummary = new OrderSummary();
		
		//Stubbing
		Mockito.when(mockitoOrderDao.findOrdersByCustomer(CUSTOMER_ID))
		.thenReturn(orderEntityListFixture);
		
		Mockito.when(mockitoTransformer.transform(orderEntityFixture))
		.thenReturn(orderSummary);
		
		//Execution
		List<OrderSummary> resultList = target.getOrderSummary(CUSTOMER_ID);
		
		//Assertion/Verification
		Mockito.verify(mockitoOrderDao).findOrdersByCustomer(CUSTOMER_ID);
		Mockito.verify(mockitoTransformer).transform(orderEntityFixture);
		
		Assert.assertNotNull(resultList);
		Assert.assertEquals(1, resultList.size());
		
	}
	
}
