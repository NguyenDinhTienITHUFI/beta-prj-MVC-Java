package com.tiennguyen.betamvc.Customer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	public List<Customer> findByZone(String zone);

}
