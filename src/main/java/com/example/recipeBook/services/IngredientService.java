package com.example.recipeBook.services;

import com.example.recipeBook.model.Ingredient;

import java.util.Optional;

public interface IngredientService
{
    Ingredient save(Ingredient ingredient);
    Ingredient getById(Long id);

}
