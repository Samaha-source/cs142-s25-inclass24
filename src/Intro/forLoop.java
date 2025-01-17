package Intro;

public //Nate Phillips, professor for COMP 142
class forLoop
{
    public static void main(String[] args)
    {
        int i = 0;
        String roundCount = "Round # ";

        while (i < 20)
        {
            System.out.println(i);

            i = i + 3;//i +=3
        }

        for(int j = 0; j < 5; j++)//j = j + 1
        {
            System.out.println(j+1);
        }

        i = 3;
        while(i >= 0)
        {
            roundCount = roundCount + "I ";

            for(int k = 0; k < 5; k++)
            {
                System.out.println(roundCount + k);
            }

            i--;//i = i - 1;
        }
    }
}
