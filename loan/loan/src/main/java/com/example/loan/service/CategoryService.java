package com.example.loan.service;

import java.util.List;

import com.example.loan.model.Category;

public interface CategoryService {
    Category saveCategory(Category category);

    List<Category> getAllCategories();

    Category getCategoryById(Integer categoryID);

    boolean deletedCategory(Integer categoryID);

    Category updateCategory(Integer categoryID, Category category);
}
