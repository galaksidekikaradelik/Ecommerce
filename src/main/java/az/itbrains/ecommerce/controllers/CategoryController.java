package az.itbrains.ecommerce.controllers;


import az.itbrains.ecommerce.dto.category.CategoryHomeDTO;
import az.itbrains.ecommerce.models.Category;
import az.itbrains.ecommerce.repositories.CategoryRepository;
import az.itbrains.ecommerce.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @GetMapping
    public ResponseEntity<List<CategoryHomeDTO>> getAll(){

        return new ResponseEntity<>(List.of(), HttpStatus.OK);
    }

}
