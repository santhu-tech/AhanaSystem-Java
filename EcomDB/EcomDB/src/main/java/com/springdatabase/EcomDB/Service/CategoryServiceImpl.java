package com.springdatabase.EcomDB.Service;

import com.springdatabase.EcomDB.Model.Category;
import com.springdatabase.EcomDB.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> fetchCategoryList() {
        return categoryRepository.findAll();
    }

    @Override
    public Category fetchCategoryByID(Long categoryId) {
        Optional<Category> category=categoryRepository.findById(categoryId);
        if(!category.isPresent()){
            System.out.println("Department not available");
        }
        return category.get();
    }


}
