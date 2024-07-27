package com.tiennguyen.betamvc.Customer;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.tiennguyen.learnspringboot.myfirstwebapp.todo.Todo;

@Service
public class CustomerService {
	private static List<Customer> customers=new ArrayList<Customer>();
	private static int cusCount=0;
	static {
		customers.add(new Customer(cusCount++,"hcm","Nguyen Dinh Tien",LocalDate.now().minusYears(22),"47 Nguyen Chi Thanh, Q11"));
		customers.add(new Customer(cusCount++,"hcm","Luu Gia Tri",LocalDate.now().minusYears(9),"85 Le Trong Tan, Tan Phu"));
		customers.add(new Customer(cusCount++,"hcm","Nguyen Thi Tuong Vy",LocalDate.now().minusYears(22),"42 Nguyen Hue, Q1"));
		customers.add(new Customer(cusCount++,"hcm","Le Thi Mong Thao",LocalDate.now().minusYears(22),"23/2/7 Doan Van Bo, Q4"));
	}
	public List<Customer> showAllCustomer(String zone) {
		
		Predicate<? super Customer> predicate=c ->c.getZone().equalsIgnoreCase(zone);
		return customers.stream().filter(predicate).toList();
	}
	public void addNewCus(String zone, String name, LocalDate date, String address) {
		Customer cus=new Customer(cusCount++,zone,name,date,address);
		customers.add(cus);
		
	}

}