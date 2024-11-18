package ru.sky.coursework_24_2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuestionsMaximumAmountExceededException extends RuntimeException {
}