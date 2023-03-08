package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.model;
import com.example.demo.service.service;
@CrossOrigin
@RestController
public class controller {
	@Autowired //extends another class
         service stuService;
	
	@PostMapping("/post")
	
	public model addInfo(@RequestBody model st) {
		return stuService.saveDetails(st);
	}
	@GetMapping("/get")
	public List<model>fetchDetails()
	{
		return stuService.getDetails();
	}
	@PutMapping("/put")
	public model UpdateInfo(@RequestBody model st1)
	{
		return stuService.UpdateDetails(st1);
	}
	@DeleteMapping("/delete/{artistid}")
	public String deleteInfo(@PathVariable("artistid")int artistid)
	{
		stuService.deleteDetails(artistid);
		return "Details Deleted";
	}
	
	//sorting
	@GetMapping("/product/{field}")
	public List<model> getWithSort(@PathVariable String field) {
		return stuService.getSorted(field);
	}

	// pagination
	@GetMapping("/product/{offset}/{pageSize}")
	public List<model> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
		return stuService.getWithPagination(offset, pageSize);
	}
}