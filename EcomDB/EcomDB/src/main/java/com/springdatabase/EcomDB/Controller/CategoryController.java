package com.springdatabase.EcomDB.Controller;

import com.springdatabase.EcomDB.Model.Category;
import com.springdatabase.EcomDB.Service.CategoryService;
import com.springdatabase.EcomDB.Service.CategoryServiceImpl;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CategoryController {
    @Autowired
     private CategoryService categoryService;

    private final Logger LOGGER= LoggerFactory.getLogger((CategoryController.class));
    @PostMapping("/categories")
    public Category saveCategory(@Valid @RequestBody Category category){
        LOGGER.info("Inside the Category");
        return categoryService.saveCategory(category);
    }

    @GetMapping("/categories")
    public List<Category> fetchCategoryList(){
        LOGGER.info("Inside the Category of get request");
        return categoryService.fetchCategoryList();
    }
    @GetMapping("/categories/{id}")
    public Category fetchCategoryById(@PathVariable("id") Long categoryId){
        return categoryService.fetchCategoryByID(categoryId);
    }

    //deletebyid
    //update
    //fetchcatalogByName

/*@GetMapping("/exampleendpoint")
    public String Example(){
        logger.info("Endpoints");
        logger.debug("");
        return "" ;
    }*/
}
