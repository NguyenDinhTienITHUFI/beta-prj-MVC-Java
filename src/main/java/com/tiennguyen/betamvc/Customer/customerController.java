package com.tiennguyen.betamvc.Customer;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tiennguyen.learnspringboot.myfirstwebapp.todo.Todo;

import jakarta.validation.Valid;

public class customerController {
	private CustomerService customerService;
	public customerController(CustomerService customerService) {
		super();
		this.customerService=customerService;
	}
	
	@RequestMapping("say-hello")
	public String sayhello()
	{
		return "sayHello";
	}
	@RequestMapping("list-customer")
	public String listCustomer(ModelMap model) {
		List<Customer> listCus=customerService.showAllCustomer("hcm");
		model.addAttribute("listCus",listCus);
		return "listCustomer";
	}
	@RequestMapping(value="add-cus",method=RequestMethod.GET)
	public String showAddCus(ModelMap model) {
		Customer cus=new Customer(0,"hcm","",LocalDate.now(),"");
		model.put("cus", cus);
		return "addCus";
	}
	@RequestMapping(value="add-cus",method=RequestMethod.POST)
	public String addCus(ModelMap model,@Valid Customer cus, BindingResult result) {
		if(result.hasErrors()) {
			return "addCus";
		}
		customerService.addNewCus("hcm", cus.getName(), cus.getDob(), cus.getAddress());
		return "redirect:/list-customer";
	}
	 @RequestMapping("delete-cus")
	    public String deleteCus(@RequestParam int id) {
	        customerService.deleteById(id);
	        return "redirect:/list-customer";
	    }
	 @RequestMapping(value="update-cus",method=RequestMethod.GET)
		public String showUpdateCus(@RequestParam int id, ModelMap model) {
			Customer cus=customerService.findById(id);
			model.addAttribute("cus",cus);
			return "addCus";
		}
		@RequestMapping(value="update-cus",method=RequestMethod.POST)
		public String updateCus(ModelMap model,@Valid Customer cus, BindingResult result) {
			if(result.hasErrors()) {
				return "addCus";
			}
			cus.setZone("hcm");
			customerService.updateCus(cus);
			return "redirect:/list-customer";
		}

}
