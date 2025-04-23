package lab11;

public abstract class Question
{
    protected String stringDataType = "Question";
    protected int intDataType = -1;

    protected int pointValue = 1;

    protected String questionText = "";
    protected String answerText = "";
    public abstract boolean evaluateAnswer(String answerString);

    public String toString()
    {
        return stringDataType + ": " + questionText + " Ans: " + answerText;
    }

    public String getAnswer()
    {
        return answerText;
    }

    public String getQuestionText()
    {
        return questionText;
    }

    public int getPointValue()
    {
        return pointValue;
    }
}
