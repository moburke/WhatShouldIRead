package com.example.whatshouldiread.customclasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Quiz
{
    private List<Question> questions;
    private Integer[] answers;

    public Quiz()
    {
        questions = generateQuizQuestions();
        answers = new Integer[5];
    }

    private List<Question> generateQuizQuestions()
    {
        List<Question> returnQuestions = new ArrayList<>();
        Random rand = new Random();
        for (Integer position = 0; position < 5; position++)
        {
            Integer questionIntVariation = 0;
            String questionVariation = questionIntVariation.toString();
            File file = new File("./data/questions/" + position.toString() + "/" + questionVariation + ".txt");
            Scanner sc = null;
            try
            {
                sc = new Scanner(file);
                List<String> textStrings = new ArrayList<>();
                while (sc.hasNextLine())
                {
                    textStrings.add(sc.nextLine());
                }
                returnQuestions.add(new Question(textStrings.get(0), position, textStrings.get(1), textStrings.get(2)));
            } catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
        }
        return returnQuestions;
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
