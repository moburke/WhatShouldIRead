package com.example.whatshouldiread.customclasses;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionTest {

    private Question testQuestion = null;
    private String testQuestionText = null;
    private int testQuestionPosition = -1;

    @Before
    public void setUp() throws Exception
    {

    }

    @After
    public void tearDown() throws Exception
    {
        testQuestion = null;
        testQuestionText = null;
        testQuestionPosition = -1;
    }

    @Test
    public void subtractionWorks()
    {
        assertEquals(2, 4-2);
    }

    @Test
    public void testDefaultQuestionConstructor()
    {
        givenDefaultQuestionConstructorIsCalled();
        whenGetQuestionPositionIsCalled();
        whenGetQuestionTextIsCalled();
        thenTestValuesEquals("TestQuestionText", 1);
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

    private void givenDefaultQuestionConstructorIsCalled()
    {
        testQuestion = new Question();
    }

    private void whenGetQuestionTextIsCalled()
    {
        testQuestionText = testQuestion.getQuestionText();
    }

    private void whenGetQuestionPositionIsCalled()
    {
        testQuestionPosition = testQuestion.getQuestionPosition();
    }

    private void thenTestValuesEquals(String questionText, int questionPosition)
    {
        assertEquals(questionText, testQuestionText);
        assertEquals(questionPosition, testQuestionPosition);
    }

    @Test
    public void questionSetters()
    {
        givenDefaultQuestionConstructorIsCalled();
        whenQuestionTextSetterIsCalled();
        whenQuestionPositionSetterIsCalled();
        thenQuestionGettersEqual();
    }

    private void whenQuestionTextSetterIsCalled()
    {
        testQuestion.setQuestionText("ABCD");
    }

    private void whenQuestionPositionSetterIsCalled()
    {
        testQuestion.setQuestionPosition(4);
    }

    private void thenQuestionGettersEqual()
    {
        assertEquals("ABCD", testQuestion.getQuestionText());
        assertEquals(4, testQuestion.getQuestionPosition());
    }
}
