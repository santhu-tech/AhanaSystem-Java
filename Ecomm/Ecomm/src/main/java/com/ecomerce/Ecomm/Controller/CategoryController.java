package com.ecomerce.Ecomm.Controller;

import com.ecomerce.Ecomm.Model.Category;
import com.ecomerce.Ecomm.Service.CategoryServiceimpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CategoryController {

    private CategoryServiceimpl categoryserviceimpl;

    public CategoryController(CategoryServiceimpl categoryserviceimpl) {
        this.categoryserviceimpl = categoryserviceimpl;
    }

    @GetMapping("/categories")
    public List<Category> findAll(){
        return categoryserviceimpl.findALL();
    }
    @PostMapping("/addcategories")
    public String CreateCategory(@RequestBody Category category){
        categoryserviceimpl.Createcategory(category);
        return "added succefully";
    }
}
