package lab11;

public class MCQuestion extends Question
{

    public MCQuestion(String question, String answer)
    {
        questionText = question;
        answerText = answer;
        intDataType = 2;//Multiple choice question
        stringDataType = "Multiple Choice";
        pointValue = 2;
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
