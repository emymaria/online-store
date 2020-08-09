package com.example.restservices.mappers;

import java.util.List;


import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.example.restservices.dtos.categoryMsDto;
import com.example.restservices.entities.Category;

@Mapper(componentModel="Spring")
public interface CategoryMapper {

	CategoryMapper INSTANCE= Mappers.getMapper(CategoryMapper.class);
	
//List<Category> to List<CategoryMsDto>
	List<categoryMsDto> categoriesToCategoryDtos(List<Category>categories);
}
