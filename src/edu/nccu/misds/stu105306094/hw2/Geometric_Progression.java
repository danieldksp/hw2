package edu.nccu.misds.stu105306094.hw2;
public class Geometric_Progression<extends Number> extends Progression<T>
{
	private T base;
	
	public Geometric_Progression(T first,T base)  // d=1 by default
	{
		super(first);
		this.base = base ;// first=cur=1,d=1;
	}
	
	private T multiply(T a , T b)
	{
		if(a instanceof Integer)
		{
			Integer erasedValue = a.intValue()*b.intValue();
			return (T)erasedValue;
		}
		else if(a instanceof Float)
		{
			Integer erasedValue = a.floatValue()*b.floatValue();
			return (T)erasedValue;
		}
		else 
		{
			return null;
		}
	}
	
	public T nextValue()
	{
		curr = multiply(curr , base);
		return curr;
	}
}