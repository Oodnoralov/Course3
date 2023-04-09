package com.example.recipeBook.services;

import com.example.recipeBook.model.Ingredient;

import java.util.Map;
import java.util.Optional;

public interface IngredientService
{
    Ingredient save(Ingredient ingredient);
    Ingredient getById(Long id);
    Ingredient update(Long id, Ingredient ingredient);

    Ingredient delete(Long id);

    Map<Long, Ingredient> getAll();

}
