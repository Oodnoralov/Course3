package com.example.recipeBook.controllers;

import com.example.recipeBook.model.Ingredient;
import com.example.recipeBook.services.IngredientService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/ingredient")
@Tag(name = "API по работе с ингредиентами", description = "CRUD операции для работы с ингредиентами")

public class ingredientController {
    private final IngredientService ingredientService;

    public void IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }
    @PostMapping
    @Operation(summary = "метод для сохранения ингредиентов")
    public ResponseEntity<Ingredient> save(@RequestBody Ingredient ingredient) {
        return ResponseEntity.ok(ingredientService.save(ingredient));
    }
    @GetMapping("/{id}")
    @Operation(summary = "получение игредиента по ID")
    public ResponseEntity<Ingredient> getById(@PathVariable Long id) {
        Ingredient ingredient = ingredientService.getById(id);
        if (ingredient == null) {
            return ResponseEntity.notFound();
        }
        return ResponseEntity.of(ingredientService.getById(id));
    }
    @PutMapping("/{id}")
    @Operation(summary = "обновление ингредиента")

    public ResponseEntity<Ingredient> update(@PathVariable Long id, @RequestBody Ingredient ingredient)
    {
        return ResponseEntity.ok(ingredientService.update(id, ingredient));
    }
    @DeleteMapping("/{id}")
    @Operation(summary = "удаление ингредиента")

    public ResponseEntity<Ingredient> delete(@PathVariable Long id)
    {
        return ResponseEntity.ok(ingredientService.delete(id));
    }

    @GetMapping("/{id}")
    @Operation(summary = "получение всех ингредиентов")

    public ResponseEntity<Map<Long, Ingredient>> getAll()
    {
        return ResponseEntity.ok(ingredientService.getAll());
    }



}
