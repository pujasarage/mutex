import java.util.*;

class OddEven
{
	public static void main(String args[])
	{
		int number[]= new int[5];
		String evensqr;
		String evencube;
		String oddsqr;
		String oddcube;
		Scanner scanner =new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{	
			number[i]=scanner.nextInt();

		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Number :"+number[i]);
		}
		for(int i=0;i<5;i++)
		{
			if(number[i]%2==0)
			{
				System.out.println("Number is Even :"+number[i]);
				int sqrno=number[i]*number[i];
				evensqr="square of no :"+sqrno;
				System.out.println("Square :"+evensqr);
				int cube=number[i]*number[i]*number[i];
				evencube="cube of no :"+cube;
				System.out.println("Cube :"+evencube);
			}
			else
			{
				System.out.println("Number is Odd :"+number[i]);
				int sqrno=number[i]*number[i];
				oddsqr="square of no :"+sqrno;
				System.out.println("Square :"+oddsqr);
				int cube=number[i]*number[i]*number[i];
				oddcube="cube of no :"+cube;
				System.out.println("Cube :"+oddcube);
			}
		}
	}
}
