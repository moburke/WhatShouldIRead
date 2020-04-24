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
    private String questionAnswer3;
    private String questionAnswer4;
    private String questionAnswer5;
    private String questionAnswer6;
    private String questionAnswer7;
    private String questionAnswer8;
    private String questionAnswer9;
    private String questionAnswer10;

    /*
     * Default constructor for Question. Sets default text and position of 1.
     */

    public Question()
    {
        this.questionText = "TestQuestionText";
        this.questionPosition = 1;
        this.questionPosition = 2;
        this.questionPosition = 3;
        this.questionPosition = 4;
        this.questionPosition = 5;
        this.questionAnswer1 = "Modern";
        this.questionAnswer2 = "Old";
        this.questionAnswer3 = "One-Off";
        this.questionAnswer4 = "Series";
        this.questionAnswer5 = "Long";
        this.questionAnswer6 = "Short";
        this.questionAnswer7 = "Fiction";
        this.questionAnswer8 = "Non-Fiction";
        this.questionAnswer9 = "English";
        this.questionAnswer10 = "Non-English";
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
        this.questionAnswer3 = questionAnswer3;
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

    public String getQuestionAnswer3(){return questionAnswer3;}

    public void setQuestionAnswer3(String questionAnswer3){
        this.questionAnswer3 = questionAnswer3;
    }

    public String getQuestionAnswer4(){return questionAnswer4;}

    public void setQuestionAnswer4(String questionAnswer4){
        this.questionAnswer4 = questionAnswer4;
    }

    public String getQuestionAnswer5(){return questionAnswer5;}

    public void setQuestionAnswer5(String questionAnswer5){
        this.questionAnswer5 = questionAnswer5;
    }

    public String getQuestionAnswer6(){return questionAnswer6;}

    public void setQuestionAnswer6(String questionAnswer6){
        this.questionAnswer6 = questionAnswer6;
    }

    public String getQuestionAnswer7(){return questionAnswer7;}

    public void setQuestionAnswer7(String questionAnswer7){
        this.questionAnswer7 = questionAnswer7;
    }

    public String getQuestionAnswer8(){return questionAnswer8;}

    public void setQuestionAnswer8(String questionAnswer8){
        this.questionAnswer8 = questionAnswer8;
    }

    public String getQuestionAnswer9(){return  questionAnswer9;}

    public void setQuestionAnswer9(String questionAnswer9){
        this.questionAnswer9 = questionAnswer9;
    }

    public String getQuestionAnswer10(){return questionAnswer10;}

    public void setQuestionAnswer10(String questionAnswer10){
        this.questionAnswer10 = questionAnswer10;
    }

}
