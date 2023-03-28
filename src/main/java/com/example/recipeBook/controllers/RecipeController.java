package com.example.recipeBook.controllers;

import com.example.recipeBook.model.Recipe;
import com.example.recipeBook.services.RecipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipe")


public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
    @PostMapping
    public ResponseEntity<Recipe> save(@RequestBody Recipe recipe) {
        return ResponseEntity.ok(recipeService.save(recipe));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Recipe> getById(@PathVariable Long id) {
        Recipe recipe = recipeService.getById(id);
        if (recipe == null) {
            return ResponseEntity.notFound();
        }
        return ResponseEntity.of(recipeService.getById(id));
    }
}
