package com.ecomerce.Ecomm.Service;

//import jdk.jfr.Category;

import com.ecomerce.Ecomm.Model.Category;
import com.ecomerce.Ecomm.ServiceInter.CategoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class CategoryServiceimpl implements CategoryService {
    private List<Category> categories =new ArrayList<>();


    @Override
    public List<Category> findALL() {
        return categories;
    }

    @Override
    public void Createcategory(Category category) {
        categories.add(category);
    }


}
