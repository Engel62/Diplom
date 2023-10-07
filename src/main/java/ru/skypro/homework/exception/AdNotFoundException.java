package ru.skypro.homework.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Такое объявление не найдено")
public class AdNotFoundException extends RuntimeException {

    public AdNotFoundException() {
        super("Объявление не найдено!");
    }
}
