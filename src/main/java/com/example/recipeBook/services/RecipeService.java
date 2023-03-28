package com.example.recipeBook.services;

import com.example.recipeBook.model.Ingredient;
import com.example.recipeBook.model.Recipe;

import java.util.Optional;

public interface RecipeService {

    Ingredient save(Recipe recipe);
    Recipe getById(Long id);
}
