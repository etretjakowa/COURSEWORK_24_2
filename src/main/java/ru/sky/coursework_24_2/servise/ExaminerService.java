package ru.sky.coursework_24_2.servise;

import ru.sky.coursework_24_2.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
    //2
}