package com.spring.shoppingbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.shoppingbackend.dao.CategoryDAO;
import com.spring.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();

		// adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("Some description of Television!!!");
		category.setImageUrl("CAT_1.png");

		categories.add(category);

		// second category

		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Some description of Mobile !!!");
		category.setImageUrl("CAT_2.png");

		categories.add(category);

		// third category

		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Some description of Laptop !!!");
		category.setImageUrl("CAT_3.png");

		categories.add(category);
	}

	@Override
	public List<Category> list() {
		return categories;
	}

	@Override
	public Category get(int id) {
		// enhanced for loop
		for(Category category:categories) {
			if(category.getId()==id) return category;
		}
		
		return null;

	}

}
