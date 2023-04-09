package com.example.recipeBook.services;

import com.example.recipeBook.model.Ingredient;
import com.example.recipeBook.model.Recipe;

public interface ValidationService {
    public boolean validate(Recipe recipe) ;
    public boolean validate(Ingredient ingredient);
}
