package com.example.whatshouldiread.customclasses;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void bookCons()
    {
        Book book1 = new Book();
        assertNotNull(book1);
    }


    @Test
    public void bookObjects(){
        Question[] bookQuestions = new Question[]{new Question()};

        Book bookInfo  = new Book("TestBook","TestAuthor", bookQuestions, new Integer[] {1});
        assertNotNull(bookInfo);
    }

    @Test
    public void getMethods() {
        Book book1 = new Book();

        assertEquals(book1.getBookName(), "TestBook");
        assertEquals(book1.getBookAuthor(), "TestAuthor");
        assertNotNull(book1.getBookQuestions());
        assertNotNull(book1.getAmazonStoreLink());
        assertNotNull(book1.getBookImagePath());
    }

    @Test
    public void setMethods()
    {
        Book book1 = new Book();

        book1.setBookAuthor("Author");
        book1.setBookName("Book");
        book1.setBookQuestions(new Question[] {new Question(), new Question()});

        assertNotNull(book1.getBookAuthor());
        assertNotNull(book1.getBookName());
        assertNotNull(book1.getBookQuestions());
    }
}