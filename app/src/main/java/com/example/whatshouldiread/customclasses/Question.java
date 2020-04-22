package com.example.whatshouldiread.customclasses;

/*
 * Class to store a question in text form as well as what position the question will be. Allows for
 * multiple questions for the same position without changing the end result of the books.
 */

public class Question {

    private String questionText;
    private int questionPosition;
    private String questionAnswer1;
    private String questionAnswer2;

    /*
     * Default constructor for Question. Sets default text and position of 1.
     */

    public Question()
    {
        this.questionText = "TestQuestionText";
        this.questionPosition = 1;
        this.questionAnswer1 = "A";
        this.questionAnswer2 = "B";
    }

    /*
     * Constructor that takes a String parameter and a int to create a question.
     *
     * @param questionText Text for question
     * @param questionPosition Position for this question
     * @param questionAnswer1 Text for Answer1
     * @param questionAnswer2 Text for Answer2
     */

    public Question(String questionText, int questionPosition, String questionAnswer1, String questionAnswer2)
    {
        this.questionText = questionText;
        this.questionPosition = questionPosition;
        this.questionAnswer1 = questionAnswer1;
        this.questionAnswer2 = questionAnswer2;
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

    public String getQuestionAnswer1()
    {
        return questionAnswer1;
    }

    public void setQuestionAnswer1(String questionAnswer1)
    {
        this.questionAnswer1 = questionAnswer1;
    }

    public String getQuestionAnswer2()
    {
        return questionAnswer2;
    }

    public void setQuestionAnswer2(String questionAnswer2)
    {
        this.questionAnswer2 = questionAnswer2;
    }
}
