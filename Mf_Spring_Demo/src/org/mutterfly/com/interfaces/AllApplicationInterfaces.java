package org.mutterfly.com.interfaces;

import java.util.List;

import org.mutterfly.com.model.OrderModel;

public interface AllApplicationInterfaces {

	public interface OrderMethods{
		
		List<OrderModel> getAllOrders();
		
	}
	
}
