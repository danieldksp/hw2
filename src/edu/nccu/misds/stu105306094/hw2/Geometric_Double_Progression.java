package edu.nccu.misds.stu105306094.hw2;
public class Geometric_Double_Progression extends Double_Progression
{
    protected double r;
    Geometric_Double_Progression()
    {               //first =1, r =1 by default
        this(1,1); //first = 1; r = 1;
    }
    Geometric_Double_Progression(double a, double base) 
    { //Set r to base
        first = a;
        r = base;
    }
    protected double nextValue()
    {
        cur = cur*r ; //cur = cur*r;
        if(cur<0)
        {
        	System.out.println("negative value!");
        }
       //throw new Exception("negative value!");
        return cur;
    }
} 