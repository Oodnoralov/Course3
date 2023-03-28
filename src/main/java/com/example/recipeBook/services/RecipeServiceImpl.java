package com.example.recipeBook.services;

import com.example.recipeBook.model.Ingredient;
import com.example.recipeBook.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service

public class RecipeServiceImpl implements RecipeService {
    private  static long idCount = 1;
    private final Map<Long, Recipe> recipes = new HashMap<>();
    private final Validation validationService;

    @Override
    public Recipe save(Recipe recipe) {
        return recipes.put(idCount++, recipe);
    }

    @Override
    public Recipe getById(Long id) {
        return recipes.get(id);
    }


}
