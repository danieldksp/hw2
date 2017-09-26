package edu.nccu.misds.stu105306094.hw2;
public class Double_Progression
{
    protected double first;
    protected double cur;
    Double_Progression()
    { //Constructor
        first = cur = 1;
    }
    protected double firstValue()
    { //Reset cur
         cur = first;
         return cur;
    }
    protected double nextValue()
    { //cur = cur+1; return cur;
        return ++cur;
    }
    protected void printProgression(int n)
    {
        System.out.print(firstValue());
        for(int i =2; i<=n; i++)
        System.out.print(""+ nextValue());
        System.out.println();
    } 
}

