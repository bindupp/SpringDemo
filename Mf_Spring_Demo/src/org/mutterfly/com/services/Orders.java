package org.mutterfly.com.services;


import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.mutterfly.com.interfaces.AllApplicationInterfaces;
import org.mutterfly.com.model.OrderModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Orders implements AllApplicationInterfaces.OrderMethods {
	
	public DataSource getDataSource() {
		return dataSource;
	}
 

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	DataSource dataSource ;
  
    
   
	JdbcTemplate jdbcTemplate = new JdbcTemplate(); 


	@Override
	
	public List<OrderModel> getAllOrders() {
		
		
		
		List <OrderModel>orderList = new ArrayList<OrderModel>();
		
		jdbcTemplate.setDataSource(getDataSource());
		
		// jdbcTemplate.query("Select o_id from orders where o_resource_id = ?",new Object[]{167},new OrderMapper());
		
		
		
		return jdbcTemplate.query("Select o_id from orders where o_resource_id = ? like 5",new Object[]{167},new OrderMapper());
		
	}
    

}
