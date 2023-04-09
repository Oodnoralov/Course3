package com.example.recipeBook.controllers;

import com.example.recipeBook.model.Ingredient;
import com.example.recipeBook.services.IngredientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/ingredient")

public class ingredientController {
    private final IngredientService ingredientService;

    public void IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }
    @PostMapping
    public ResponseEntity<Ingredient> save(@RequestBody Ingredient ingredient) {
        return ResponseEntity.ok(ingredientService.save(ingredient));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Ingredient> getById(@PathVariable Long id) {
        Ingredient ingredient = ingredientService.getById(id);
        if (ingredient == null) {
            return ResponseEntity.notFound();
        }
        return ResponseEntity.of(ingredientService.getById(id));
    }
    @PutMapping("/{id}")

    public ResponseEntity<Ingredient> update(@PathVariable Long id, @RequestBody Ingredient ingredient)
    {
        return ResponseEntity.ok(ingredientService.update(id, ingredient));
    }
    @DeleteMapping("/{id}")

    public ResponseEntity<Ingredient> delete(@PathVariable Long id)
    {
        return ResponseEntity.ok(ingredientService.delete(id));
    }

    @GetMapping("/{id}")

    public ResponseEntity<Map<Long, Ingredient>> getAll()
    {
        return ResponseEntity.ok(ingredientService.getAll());
    }



}
