package ru.sky.coursework_24_2.servise;

import ru.sky.coursework_24_2.Question;

import java.util.Collection;
import java.util.stream.Collectors;

public interface QuestionService {
    Question add(String question, String answer);

    Question add(Question question);

    Question find(Question question);

    Question remove(Question question);

    Collection<Question> getAll();

    Question getRandomQuestion();

}