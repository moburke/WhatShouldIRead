package com.example.whatshouldiread.customclasses;

/*
 * Class that stores information for a particular book. Allows for links to amazon for the particular
 * book be created through a function, rather than hardcoding.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {

    private String bookName;
    private String bookAuthor;
    private Question[] bookQuestions;
    private Integer[] bookAnswers;
    private String bookName1;
    private String bookAuthor1;
    private String bookName2;
    private String bookAuthor2;
    private String bookName3;
    private String bookAuthor3;
    private String bookName4;
    private String bookAuthor4;
    private String bookName5;
    private String bookAuthor5;
    private String bookName6;
    private String bookAuthor6;
    private String bookName7;
    private String bookAuthor7;
    private String bookName8;
    private String bookAuthor8;
    private String bookName9;
    private String bookAuthor9;
    private String bookName10;
    private String bookAuthor10;
    private String bookName11;
    private String bookAuthor11;
    private String bookName12;
    private String bookAuthor12;
    private String bookName13;
    private String bookAuthor13;
    private String bookName14;
    private String bookAuthor14;
    private String bookName15;
    private String bookAuthor15;
    private String bookName16;
    private String bookAuthor16;
    private String bookName17;
    private String bookAuthor17;
    private String bookName18;
    private String bookAuthor18;
    private String bookName19;
    private String bookAuthor19;
    private String bookName20;
    private String bookAuthor20;
    private String bookName21;
    private String bookAuthor21;
    private String bookName22;
    private String bookAuthor22;
    private String bookName23;
    private String bookAuthor23;
    private String bookName24;
    private String bookAuthor24;
    private String bookName25;
    private String bookAuthor25;
    private String bookName26;
    private String bookAuthor26;
    private String bookName27;
    private String bookAuthor27;
    private String bookName28;
    private String bookAuthor28;
    private String bookName29;
    private String bookAuthor29;
    private String bookName30;
    private String bookAuthor30;
    private String bookName31;
    private String bookAuthor31;
    private String bookName32;
    private String bookAuthor32;

    /*
    * Default constructor for Book class. Sets test values for the book name, book author, and
    * questions to get to this book.
     */

    public Book()
    {
        this.bookName = "TestBook";
        this.bookAuthor = "TestAuthor";
        this.bookName1 = "Good Omens";
        this.bookAuthor1 = "Neil Gaiman";
        this.bookName2 = "Kafka on the Shore";
        this.bookAuthor2 = "Haruki Murakami";
        this.bookName3 = "A short history of nearly everything";
        this.bookAuthor3 = "Bill Bryson";
        this.bookName4 = "Reading Lolita in Tehran";
        this.bookAuthor4 = "Azar Nafisi";
        this.bookName5 = "Room";
        this.bookAuthor5 = "Emma Donoghue";
        this.bookName6 = "The Kite Runner";
        this.bookAuthor6 = "Khaled Hosseeini";
        this.bookName7 = "The Glass Castle";
        this.bookAuthor7 = "Jeanette Walls";
        this.bookName8 = "I am Malala";
        this.bookAuthor8 = "Malala Yousafzi";
        this.bookName9 = "The Gates";
        this.bookAuthor9 = "John Connolly";
        this.bookName10 = "Legue of Spies: Fortune of France";
        this.bookAuthor10 = "Robert Merle";
        this.bookName11 = "Freakonomics";
        this.bookAuthor11 ="Steven D. Levitt";
        this.bookName12 = "Day";
        this.bookAuthor12 = "Elie Weisel";
        this.bookName13 = "A hat full of sky";
        this.bookAuthor13 = "Terry Pratchett";
        this.bookName14 = "Rain and Other stories";
        this.bookAuthor14 = "Mia Couto";
        this.bookName15 = "SuperFreakonomics";
        this.bookAuthor15 = "Steven D. Levitt";
        this.bookName16 = "Night";
        this.bookAuthor16 = "Elie Weisel";
        this.bookName17 = "Middlemarch";
        this.bookAuthor17 = "George Elliot";
        this.bookName18 = "The Tale of Genji";
        this.bookAuthor18 = "Murasaki Shikibu";
        this.bookName19 = "Silent Spring";
        this.bookAuthor19 = "Rachel Carson";
        this.bookName20 = "The Kagero Diary";
        this.bookAuthor20 = "Sonja Arntzen";
        this.bookName21 = "Alice's Adventures in Wonderland";
        this.bookAuthor21 = "Lewis";
        this.bookName22 = "Antigone";
        this.bookAuthor22 = "Sophocles";
        this.bookName23 = "Orientalism";
        this.bookAuthor23 = "Edward Said";
        this.bookName24 = "Tao Te Ching";
        this.bookAuthor24 = "Lao Tzu";
        this.bookName25 = "The Lord of the Rings";
        this.bookAuthor25 = "J.R.R. Tolkien";
        this.bookName26 = "Lost Illusions";
        this.bookAuthor26 = "Herbert J. Hunt";
        this.bookName27 = "Against Interpretation Essays";
        this.bookAuthor27 = "Susan Sontag";
        this.bookName28 = "Essays";
        this.bookAuthor28 = "Michael de Montaigne";
        this.bookName29 = "White Nights";
        this.bookAuthor29 = "Fyodor Dostoyevsky";
        this.bookName30 = "The Selected Poems of Tao Chien";
        this.bookAuthor30 = "Tao Chien";
        this.bookName31 = "Five Dialogues";
        this.bookAuthor31 = "Plato";
        this.bookName32 = "Art of War";
        this.bookAuthor32 = "Sun Tzu";
        this.bookQuestions = new Question[]{new Question()};
        this.bookAnswers = new Integer[] {1};
    }

    /*
     * Constructor for Book class that takes in parameters for each parameter of the Book Class.
     *
     * @param bookName String value of book name
     * @param bookAuthor String value of the book's author
     * @param bookQuestion Array of questions that were used to get to this book
     * @param bookAnswers int array of answer values to get to this book.
     */

    public Book(String bookName, String bookAuthor, Question[] bookQuestions, Integer[] bookAnswers, String bookName1,
                String bookAuthor1, String bookName2, String bookAuthor2, String bookName3, String bookAuthor3)
    {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookQuestions = bookQuestions;
        this.bookAnswers = bookAnswers;
        this.bookName1 = bookName1;
        this.bookAuthor1 = bookAuthor1;
        this.bookName2 = bookName2;
        this.bookAuthor2 = bookAuthor2;
        this.bookName3 = bookName3;
        this.bookAuthor3 = bookAuthor3;



    }

    public Book(Integer[] bookAnswers)
    {
        this.bookAnswers = bookAnswers;
        String bookString = bookAnswers.toString();
        File file = new File("./data/books/" + bookString + "/book.txt");
        Scanner sc = null;
        try
        {
            sc = new Scanner(file);
            List<String> textStrings = new ArrayList<>();
            while (sc.hasNextLine())
            {
                textStrings.add(sc.nextLine());
            }
            this.bookName = textStrings.get(0);
            this.bookAuthor = textStrings.get(1);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
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

    public Integer[] getBookAnswers()
    {
        return bookAnswers;
    }

    public void setBookAnswers(Integer[] bookAnswers)
    {
        this.bookAnswers = bookAnswers;

    }

    public String getBookImagePath()
    {
        String bookImagePath = "/app/data/";

        for (int answer : bookAnswers)
        {
            bookImagePath.concat(String.valueOf(answer));
        }

        return bookImagePath.concat("bookImage.jpg");
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
