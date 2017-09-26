package edu.nccu.misds.stu105306094.hw2 ;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
         System.out.println("Please type Datatype First Base N");
         Scanner sc = new Scanner(System.in);
         
         while(sc.hasNextLine())
         {
        	 int type = sc.nextInt();
        	 
        	 switch(type)
        	 {
        	     case 0:
        	       Geometric_Progression<Integer>intGeom = new Geometric_Progression<Integer>(sc.nextInt(),sc.nextInt());
        	       intGeom.printProgression(sc.nextInt());
        	       break;
        	     case 1:
        	    	 Geometric_Double_Progression<Integer>floatGeom = new Geometric_Double_Progression<Integer>(sc.nextInt(),sc.nextInt());
          	       floatGeom.printProgression(sc.nextInt());
          	       break;
          	     default : 
          	    	 System.out.println("InvalidType !");
          	    	 sc.nextInt();
          	    	 sc.nextInt();
          	    	 sc.nextInt();
          	    	 break;
        	 }
         }
         sc.close();
    } 
}