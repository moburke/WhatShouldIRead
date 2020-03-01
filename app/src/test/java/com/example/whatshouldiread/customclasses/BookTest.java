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

        Book bookInfo  = new Book("TestBook","TestAuthor", bookQuestions);
        assertNotNull(bookInfo);
    }
}