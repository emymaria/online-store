package com.example.restservices.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservices.dtos.categoryMsDto;
import com.example.restservices.entities.Category;
import com.example.restservices.mappers.CategoryMapper;
import com.example.restservices.repositories.CategoryRepository;
import com.example.restservices.services.CategoryService;

@RestController
public class categoryController {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/categories")
	public List<categoryMsDto> getAllcategories(){
		return categoryService.getAllcategories();
	}
}
