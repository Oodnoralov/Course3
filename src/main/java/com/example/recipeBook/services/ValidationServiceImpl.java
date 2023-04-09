package com.example.recipeBook.services;

import com.example.recipeBook.model.Ingredient;
import com.example.recipeBook.model.Recipe;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service

public class ValidationServiceImpl implements ValidationService

{

    @Override
    public boolean validate(Recipe recipe) {
        return recipe != null
                && recipe.getName() != null
                && StringUtils.isEmpty(recipe.getName())
                && recipe.getSteps() != null
                && recipe.getIngredients() != null
                && !recipe.getIngredients().isEmpty()
                && recipe.getSteps() != null;
    }

    @Override
    public boolean validate(Ingredient ingredient) {
        return ingredient != null
        && ingredient.getName() != null
                && ingredient.getMeasureUnit() != null;
        && StringUtils.isEmpty(ingredient.getName())
    }
}
