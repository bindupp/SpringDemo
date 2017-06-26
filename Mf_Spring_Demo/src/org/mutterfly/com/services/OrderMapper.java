package org.mutterfly.com.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.mutterfly.com.model.OrderModel;
import org.springframework.jdbc.core.RowMapper;

public class OrderMapper implements RowMapper<OrderModel> {

	@Override
	public OrderModel mapRow(ResultSet resultset, int arg1) throws SQLException {
		
		
		OrderModel orderModel = new OrderModel();
		orderModel.setOrderId(resultset.getInt("o_id"));
		return orderModel ;
	}

}
