package com.example.recipeBook.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Objects;
@Data
@AllArgsConstructor

public class Ingredient {
    private String name;
    private int count;
    private String measureUnit;



