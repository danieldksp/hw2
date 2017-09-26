package edu.nccu.misds.stu105306094.hw2;
public class Progression 
{
    protected long first;
    protected long cur;

    Progression() 
    {
        cur = first = 1;
    }

    protected long firstValue() 
    {
        cur = first;
        return cur;
    }

    protected long nextValue() 
    {
        return ++cur;
    }

    public void printProgression(int n) 
    {
        System.out.print(firstValue());
        for (int i = 2; i <= n; i++) 
        {
            System.out.print(" " + nextValue());
        }
        System.out.println();
    }

    public static void main (String[] args) 
    {
        Progression prog = new Progression();
        System.out.println("Default Progression: ");
        prog.printProgression(10);
    }

}