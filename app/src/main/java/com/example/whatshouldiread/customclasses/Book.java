package com.example.whatshouldiread.customclasses;

/*
 * Javadoc Template for class
 */

public class Book {

    private String bookName;
    private String bookAuthor;
    private Question[] bookQuestions;

    /*
    * Javadoc template
     */

    public Book()
    {
        this.bookName = "TestBook";
        this.bookAuthor = "TestAuthor";
        this.bookQuestions = new Question[]{new Question()};
    }

    /*
     * Javadoc template
     *
     * @param bookName
     * @param bookAuthor
     * @param bookQuestion
     */

    public Book(String bookName, String bookAuthor, Question[] bookQuestions)
    {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookQuestions = bookQuestions;
    }

    /*
     * Javadoc template
     *
     * @return bookName
     */
    public String getBookName()
    {
        return bookName;
    }

    /*
     * Javadoc template
     *
     * @param bookName
     */

    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }

    /*
     * Javadoc template
     *
     * @return bookAuthor
     */

    public String getBookAuthor()
    {
        return bookAuthor;
    }

    /*
     * Javadoc template
     *
     * @param bookAuthor
     */

    public void setBookAuthor(String bookAuthor)
    {
        this.bookAuthor = bookAuthor;
    }

    /*
     * Javadoc template
     *
     * @return bookQuestion
     */

    public Question[] getBookQuestions()
    {
        return bookQuestions;
    }

    /*
     * Javadoc template
     *
     * @param bookQuestion
     */

    public void setBookQuestions(Question[] bookQuestions)
    {
        this.bookQuestions = bookQuestions;
    }

    /*
     * Javadoc template
     *
     * @return bookImagePath
     */

    public String getBookImagePath()
    {
        String bookImagePath = "/app/data/";

        for (Question question : bookQuestions)
        {
            bookImagePath.concat(String.valueOf(question.getQuestionPosition()));
        }

        return bookImagePath.concat(".png");
    }

    /*
     * Javadoc template
     *
     * @return Amazon Link
     */

    public String getAmazonStoreLink()
    {
        String amazonBookName = this.bookName.replace(' ', '+');
        return "https://www.amazon.com/s?k=" + amazonBookName + "&i=stripbooks\"";
    }
}
