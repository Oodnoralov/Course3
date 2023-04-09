package com.example.recipeBook.services;

import com.example.recipeBook.model.Ingredient;
import com.example.recipeBook.model.Recipe;

import java.util.Map;
import java.util.Optional;

public interface RecipeService {

    Ingredient save(Recipe recipe);
    Recipe getById(Long id);

    Recipe update(Long id, Recipe recipe);

    Recipe delete(Long id);

    Map<Long, Recipe> getAll();

}
