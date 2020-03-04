package com.example.whatshouldiread.customclasses;

/*
 * Class to store a question in text form as well as what position the question will be. Allows for
 * multiple questions for the same position without changing the end result of the books.
 */

public class Question {

    private String questionText;
    private int questionPosition;

    /*
     * Default constructor for Question. Sets default text and position of 1.
     */

    public Question()
    {
        this.questionText = "TestQuestionText";
        this.questionPosition = 1;
    }

    /*
     * Constructor that takes a String parameter and a int to create a question.
     *
     * @param questionText Text for question
     * @param questionPosition Position for this question
     */

    public Question(String questionText, int questionPosition)
    {
        this.questionText = questionText;
        this.questionPosition = questionPosition;
    }

    /*
     * Returns the text for the question in a string.
     *
     * @return questionText Value of questionText
     */

    public String getQuestionText()
    {
        return questionText;
    }

    /*
     * Sets the value of the question text to a given string.
     *
     * @param questionText string to set question text to.
     */

    public void setQuestionText(String questionText)
    {
        this.questionText = questionText;
    }

    /*
     * Gets the position of this question.
     *
     * @return questionPosition int value of this question location.
     */

    public int getQuestionPosition() {
        return questionPosition;
    }

    /*
     * Sets the position of this question to int parameter.
     *
     * @param questionPosition int value to set questionPosition to
     */

    public void setQuestionPosition(int questionPosition)
    {
        this.questionPosition = questionPosition;
    }
}
