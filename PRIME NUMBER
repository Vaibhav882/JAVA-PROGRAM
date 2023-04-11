package firstclass;

import java.util.Scanner;

public class Primenumber {

	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number is");
		String input = scanner.nextLine();
		
		int maxnumber = Integer.parseInt(input);
		System.out.println("Prime numbre 1 to "+maxnumber+" are");
		
		for(int num=2;num<=maxnumber;num++)
		{
			boolean isPrime = true;
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					isPrime = false;
				}
			}
			if(isPrime==true)
				System.out.print(num+"  ");
		}
		
		
	}
