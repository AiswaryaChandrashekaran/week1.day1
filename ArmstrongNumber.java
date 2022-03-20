package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		 int num=152;
		 int sum=1;
		 int total=0;
		 int temp=num;
		 while (num>0)
		 {
			int rem= num % 10;
			for (int i=1; i<=3; i++)
			{
				 sum= sum * rem;
			}
			 total=total+sum;
			 sum=1;
			 num= num/ 10;
		 }
		 
		 if (total==temp)
		 {
			 System.out.println("Number is armstrong number");
		 }

		 else
		 {
			 System.out.println("Number is NOT armstrong number"); 
		 }
	}

}
