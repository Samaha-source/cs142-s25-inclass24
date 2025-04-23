package lab11;

import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class QuizDemo
{
    static ArrayList<Question> qList;
    static int currentCombo = 1;
    static int points = 0;

    public static void main(String[] args)
    {
        initializeQuizEnvironment();
        run10QuestionQuiz();
    }

    public static void initializeQuizEnvironment()
    {
        qList = new ArrayList<>();

        String filePath = "src/lab11/questionInputs.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null && !line.isEmpty()) {
                String[] lineSplit = line.split(";");
                if(lineSplit[0].equals("MC"))
                    qList.add(new MCQuestion(lineSplit[1], lineSplit[2]));
                else if(lineSplit[0].equals("TF"))
                    qList.add(new TFQuestion(lineSplit[1], lineSplit[2]));
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    public static void run10QuestionQuiz()
    {
        int questionNumber = 1;
        int randomNumber = -1;
        String userAnswer = "";

        Scanner input = new Scanner(System.in);

        while(questionNumber <= 10)
        {
            randomNumber = (int) (Math.random() * qList.size()) ;
            System.out.println("Next question: ");
            System.out.print(qList.get(randomNumber).questionText.replaceAll("newLine", "\n"));

            userAnswer = input.nextLine();
            if(userAnswer.equals(qList.get(randomNumber).answerText))
            {
                System.out.println("Answer correct!  Adding " + qList.get(randomNumber).pointValue * currentCombo + " to points.");
                points += qList.get(randomNumber).pointValue * currentCombo;
                currentCombo++;
                System.out.println("Combo is now " + currentCombo + ".");
                System.out.println("Total points: " + points);
            }
            else
            {
                System.out.println("Incorrect answer.");
                currentCombo = 1;
                System.out.println("Combo is now " + currentCombo + ".");
            }
            questionNumber++;
        }

        if(points != 1)
            System.out.println("The end!  You have scored " + points + " points over 10 questions!");
        else
            System.out.println("The end!  You have scored " + points + " point over 10 questions!");
    }
}
