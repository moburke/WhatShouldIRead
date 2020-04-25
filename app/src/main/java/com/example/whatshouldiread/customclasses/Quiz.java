package com.example.whatshouldiread.customclasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Quiz
{
    private List<Question> questions;
    private Integer[] answers;

    public Quiz()
    {
        questions = new ArrayList<>();
        answers = new Integer[5];
    }

    public void addQuestion(InputStream is, int position) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        List<String> textStrings = new ArrayList<>();
        String line = null;
        while((line = br.readLine()) != null)
        {
            textStrings.add(line);
        }
        br.close();
        questions.add(new Question(textStrings.get(0), position, textStrings.get(1), textStrings.get(2)));
    }

    public List<Question> getQuestions()
    {
        return questions;
    }

    public Integer[] getAnswers()
    {
        return answers;
    }

    public void setAnswers(Integer[] answers)
    {
        this.answers = answers;
    }
}
