package com.example.whatshouldiread.customclasses;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuizText
{
    @Test
    public void QuizConstructor()
    {
        Quiz quiz = new Quiz();
        assertNotNull(quiz);
        assertEquals(5, quiz.getQuestions().size());
    }
}
