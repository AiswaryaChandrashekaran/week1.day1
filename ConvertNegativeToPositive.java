package week1.day1;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		int num= -25;
		
		if (num<0)
		{
			num=num* -1;
			System.out.println("Number converted to positive number" + num);
		}
		
		else
		{
			System.out.println("Number is a positive number" + num);
		}

	}

}
