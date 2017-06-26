package org.mutterfly.com;

import java.util.List;

import org.mutterfly.com.model.OrderModel;
import org.mutterfly.com.services.Orders;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		 
	
		        Orders orders = (Orders) applicationContext.getBean("ordersDao");
		        
		        List<OrderModel>list = orders.getAllOrders();
		        
		        for(int i = 0; i <= list.size() -1 ; i++){
		        	OrderModel orderModel = list.get(i);
		        	 System.out.println("Order Id : "+orderModel.getOrderId());
		        
		        }
	}

}
