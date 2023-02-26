package com.example.recipeBook.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class FirstController {

    public String name = "Имя ученика: Олег Одноралов";
    public String nameProject = "Название проекта: RecipeBookApplication";
    public String date = "Дата создания проекта: 25.02.2023";
    public String description = "Описание проекта: Проект для записи и хранения кулинарных рецептов";




    @GetMapping
    public String Start() {
        return "Приложение запущено";
    }
    @GetMapping("/info")
    public String Page() {
        return name+ "</br>" + nameProject+ "</br>" + date + "</br>" + description;
    }
}

