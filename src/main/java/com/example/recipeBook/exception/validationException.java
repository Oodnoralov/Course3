package com.example.recipeBook.exception;

public class validationException extends RuntimeException {
    public validationException(String entity) {
        super("ошибка валидации " + entity);
    }
}
