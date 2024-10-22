package com.springdatabase.EcomDB.Service;

import com.springdatabase.EcomDB.Model.Category;

import java.util.List;

public interface CategoryService {
    public Category saveCategory(Category category);

    public List<Category> fetchCategoryList();

   public Category fetchCategoryByID(Long CategoryId);

    //public Category deleteCategory(Long id);
}
