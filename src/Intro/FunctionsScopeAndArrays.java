package Intro;

public class FunctionsScopeAndArrays
{
    static int classVariable = 1;
    static boolean unlockTheNuclearFootball = false;

    int[] intArray = {0, 1, 0, 2};

    public static void main(String[] args)
    {
        int j = 20;
        //double randomNumber = Math.random();
        System.out.println("Let's call a function");
        sampleFunction(j);
        classVariable = 10;
        sampleFunction(j);

        System.out.println(sumRange(1,10));
        System.out.println(sumRange(1,100));
    }

    public static void sampleFunction(int input)
    {
        System.out.println("Sample function has been called!!");
        System.out.println("Our class variable is " + input);
        classVariable++;
    }

    public static int sumRange(int lower, int upper)
    {
        int sum = 0;

        for(int i = lower; i <= upper; i++)
        {
            sum += i;
        }

        return sum;
    }

}
