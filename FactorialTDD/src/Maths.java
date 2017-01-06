
public class Maths {
	
	public int getFactorial(int num)
	{
		int fact = 1;
		if(num<0)
		{
			throw new IllegalArgumentException();
		}
		
		if(num==0)
		{
			return 1;
		}
		
		while( num > 0 )
		{
			fact = fact * num--;
			
		}
		return fact;
	}

}
