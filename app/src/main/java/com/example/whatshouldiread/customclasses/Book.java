package com.example.whatshouldiread.customclasses;

/*
 * Class that stores information for a particular book. Allows for links to amazon for the particular
 * book be created through a function, rather than hardcoding.
 */

public class Book {

    private String bookName;
    private String bookAuthor;
    private Question[] bookQuestions;
    private int[] bookAnswers;

    /*
    * Default constructor for Book class. Sets test values for the book name, book author, and
    * questions to get to this book.
     */

    public Book()
    {
        this.bookName = "TestBook";
        this.bookAuthor = "TestAuthor";
        this.bookQuestions = new Question[]{new Question()};
        this.bookAnswers = new int[] {1};
    }

    /*
     * Constructor for Book class that takes in parameters for each parameter of the Book Class.
     *
     * @param bookName String value of book name
     * @param bookAuthor String value of the book's author
     * @param bookQuestion Array of questions that were used to get to this book
     * @param bookAnswers int array of answer values to get to this book.
     */

    public Book(String bookName, String bookAuthor, Question[] bookQuestions, int[] bookAnswers)
    {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookQuestions = bookQuestions;
        this.bookAnswers = bookAnswers;
    }

    /*
     * Gets a string value of the books name.
     *
     * @return bookName string value of bookName for class.
     */
    public String getBookName()
    {
        return bookName;
    }

    /*
     * Sets a string value of the books name.
     *
     * @param bookName string value of bookName.
     */

    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }

    /*
     * Gets string value for book author.
     *
     * @return bookAuthor string value of book author
     */

    public String getBookAuthor()
    {
        return bookAuthor;
    }

    /*
     * Sets string value for book author
     *
     * @param bookAuthor string value of book author
     */

    public void setBookAuthor(String bookAuthor)
    {
        this.bookAuthor = bookAuthor;
    }

    /*
     * Gets array of questions for this book.
     *
     * @return bookQuestion array of questions for this class.
     */

    public Question[] getBookQuestions()
    {
        return bookQuestions;
    }

    /*
     * Sets questions to get to this book.
     *
     * @param bookQuestion Question array to set
     */

    public void setBookQuestions(Question[] bookQuestions)
    {
        this.bookQuestions = bookQuestions;
    }

    /*
     * Gets a png file from app/data (custom directory) based on the answers needed to get to the book.
     * As there are no duplicate books for a set of answers, this allows us to get the unique book
     * image for each book.
     *
     * @return bookImagePath string of the relative path of the png file.
     */

    public String getBookImagePath()
    {
        String bookImagePath = "/app/data/";

        for (int answer : bookAnswers)
        {
            bookImagePath.concat(String.valueOf(answer));
        }

        return bookImagePath.concat(".png");
    }

    /*
     * Gets a string value of an amazon link for the book. Replaces any spaces within the book name
     * to create the amazon link while preserving other special characters.
     *
     * @return String value of amazon link for this class.
     */

    public String getAmazonStoreLink()
    {
        String amazonBookName = this.bookName.replace(' ', '+');
        return "https://www.amazon.com/s?k=" + amazonBookName + "&i=stripbooks\"";
    }
}
