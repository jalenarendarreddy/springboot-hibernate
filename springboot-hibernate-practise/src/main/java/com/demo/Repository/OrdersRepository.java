package com.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.Entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {
	
	@Query("select max(o.price) from Orders o")
	public Integer getMaxOrderPrice();
	
	@Query("SELECT o.price FROM Orders o ORDER BY o.price DESC")
	public List<Integer> getOrderPriceinDescendingOrder();
	
	@Query("SELECT new com.demo.Entity.Orders(o.id, o.name, o.price) FROM Orders o")
	public List<Orders> getOrderObjectWithoutCustomer();
	

	
}
