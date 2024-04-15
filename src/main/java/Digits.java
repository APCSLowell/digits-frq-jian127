import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ 
	 digitList new ArrayList<Integer>;
		if(num == 0){
			digitList.add(0);
		}
		int number = num;
		while( n > 0){
			digitList,add(0,n%10);
			n=n/10;
		}
	}

	public boolean isStrictlyIncreasing()
	{ 
		if(digitList.digits() == 0){
			return true;
		}
		

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
