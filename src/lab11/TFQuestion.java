package lab11;

public class TFQuestion extends Question
{

    public TFQuestion(String question, String answer)
    {
        questionText = "T/F: " + question;
        answerText = answer;
        intDataType = 1;//True/False question
        stringDataType = "True/False";
        pointValue = 5;
    }
    public boolean evaluateAnswer(String answer)
    {
        if(answer.equals(answerText))
        {
            return true;
        }
        return false;
    }
}
