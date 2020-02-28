package com.example.whatshouldiread.customclasses;

public class Book {

    private String bookName;
    private String bookAuthor;
    private Question[] bookQuestions;

    public Book()
    {
        this.bookName = "TestBook";
        this.bookAuthor = "TestAuthor";
        this.bookQuestions = new Question[]{new Question()};
    }

    public Book(String bookName, String bookAuthor, Question[] bookQuestions)
    {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookQuestions = bookQuestions;
    }

    public String getBookName()
    {
        return bookName;
    }

    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }

    public String getBookAuthor()
    {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor)
    {
        this.bookAuthor = bookAuthor;
    }

    public Question[] getBookQuestions()
    {
        return bookQuestions;
    }

    public void setBookQuestions(Question[] bookQuestions)
    {
        this.bookQuestions = bookQuestions;
    }

    public String getBookImagePath()
    {
        String bookImagePath = "/app/data/";

        for (Question question : bookQuestions)
        {
            bookImagePath.concat(String.valueOf(question.getQuestionPosition()));
        }

        return bookImagePath.concat(".png");
    }

    public String getAmazonStoreLink()
    {
        String amazonBookName = this.bookName.replace(' ', '+');
        return "https://www.amazon.com/s?k=" + amazonBookName + "&i=stripbooks\"";
    }
}
