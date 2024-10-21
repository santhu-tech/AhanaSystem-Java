package com.ecomerce.Ecomm.ServiceInter;

//import jdk.jfr.Category;

import com.ecomerce.Ecomm.Model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findALL();
    void Createcategory(Category category);
}
