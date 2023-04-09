package com.example.recipeBook.services;

import com.example.recipeBook.exception.validationException;
import com.example.recipeBook.model.Ingredient;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service


public class IngredientServiceImpl implements IngredientService {
    private  static long idCount = 1;
    private final Map<Long, Ingredient> ingredients = new HashMap<>();
    private final ValidationService validation;

    public IngredientServiceImpl(ValidationService validation) {
        this.validation = validation;
    }

    @Override
    public Ingredient save(Ingredient ingredient) {
        if(!validation.validate(ingredient)) {
            throw new validationException(ingredient.toString());
        }
        return ingredients.put(idCount++, ingredient);
    }

    @Override
    public Ingredient getById(Long id) {

        return ingredients.get(id);
    }

    @Override
    public Ingredient update(Long id, Ingredient ingredient) {

        if (!ValidationService.validate(Ingredient ingredient)) {
            throw new validationException(ingredient.toString());
        }
        return ingredients.replace(id, ingredient);
    }

    @Override
    public Ingredient delete(Long id) {
        return ingredients.remove(id);
    }

    @Override
    public Map<Long, Ingredient> getAll() {
        return ingredients;
    }


}
