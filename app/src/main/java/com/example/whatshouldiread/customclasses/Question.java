package com.example.whatshouldiread.customclasses;

public class Question {

    private String questionText;
    private int questionPosition;

    public Question()
    {
        this.questionText = "TestQuestionText";
        this.questionPosition = 1;
    }

    public Question(String questionText, int questionPosition)
    {
        this.questionText = questionText;
        this.questionPosition = questionPosition;
    }

    public String getQuestionText()
    {
        return questionText;
    }

    public void setQuestionText(String questionText)
    {
        this.questionText = questionText;
    }

    public int getQuestionPosition() {
        return questionPosition;
    }

    public void setQuestionPosition(int questionPosition)
    {
        this.questionPosition = questionPosition;
    }
}
