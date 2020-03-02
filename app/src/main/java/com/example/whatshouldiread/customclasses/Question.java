package com.example.whatshouldiread.customclasses;

/*
 * Javadoc Template for class
 */

public class Question {

    private String questionText;
    private int questionPosition;

    /*
     * Javadoc Template
     */

    public Question()
    {
        this.questionText = "TestQuestionText";
        this.questionPosition = 1;
    }

    /*
     * Javadoc Template
     *
     * @param questionText
     * @param questionPosition
     */

    public Question(String questionText, int questionPosition)
    {
        this.questionText = questionText;
        this.questionPosition = questionPosition;
    }

    /*
     * Javadoc Template
     *
     * @return questionText
     */

    public String getQuestionText()
    {
        return questionText;
    }

    /*
     * Javadoc Template
     *
     * @param questionText
     */

    public void setQuestionText(String questionText)
    {
        this.questionText = questionText;
    }

    /*
     * Javadoc Template
     *
     * @return questionPosition
     */

    public int getQuestionPosition() {
        return questionPosition;
    }

    /*
     * Javadoc Template
     *
     * @param questionPosition
     */

    public void setQuestionPosition(int questionPosition)
    {
        this.questionPosition = questionPosition;
    }
}
