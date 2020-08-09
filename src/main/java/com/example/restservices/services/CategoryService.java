package com.example.restservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.restservices.dtos.categoryMsDto;
import com.example.restservices.entities.Category;
import com.example.restservices.mappers.CategoryMapper;
import com.example.restservices.repositories.CategoryRepository;

@Service

public class CategoryService {
	@Autowired 
	private CategoryRepository categoryRepository;
	
	
	@Autowired
	private CategoryMapper categoryMapper;
	@GetMapping("/categories")
	public List<categoryMsDto> getAllcategories(){
		return categoryMapper.categoriesToCategoryDtos(categoryRepository.findAll());
	}
	
	
}
