package Intro;
public class Program4Loops
{
    public static void main(String [] args) //We will discuss this more in later classes...but this is the part that Actually Runs in Java.
    {
        int j = 0;

        while(j <= 10)
        {
            System.out.println("Round " + j);
            j++;
        }
        System.out.println();
        for(int i = 1; i < 25; i+=i)
        {
            System.out.println(i);
        }
        System.out.println();
        while(true)
        {
            if(j<=0)
            {
                System.out.println("Exiting loop!");
                break;
            }
            System.out.println("Countdown " + j);
            j--;
        }

        /*for(int i = 0; i < 25; i+=i)
        {
            System.out.println(i);
        }*/
    }
}
