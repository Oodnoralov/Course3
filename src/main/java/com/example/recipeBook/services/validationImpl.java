package com.example.recipeBook.services;

import com.example.recipeBook.model.Ingredient;
import com.example.recipeBook.model.Recipe;
import org.springframework.stereotype.Service;

@Service

public class validationImpl implements Validation

{

    @Override
    public boolean validate(Recipe recipe) {
        return recipe != null
                && recipe.getName() != null
                && recipe.getSteps() != null
                && recipe.getIngredients() != null
                && !recipe.getIngredients().isEmpty()
                && recipe.getSteps() != null;
    }

    @Override
    public boolean validate(Ingredient ingredient) {
        return ingredient;
    }
}
