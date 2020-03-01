package com.example.whatshouldiread.customclasses;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void subtractionWorks()
    {
        assertEquals(2, 4-2);
    }

    @Test
    public void questionCons()
    {
        Question question1 = new Question();
        assertNotNull(question1);
    }

    @Test
    public void questionObjects(){
        Question testQuestion  = new Question("TestQuestionText", 1);
        assertNotNull(testQuestion);
    }

    @Test
    public void questionTextGetter(){
        Question questionTextGetter = new Question("TestQuestionText",1);
        assertNotNull(questionTextGetter);
    }


}
