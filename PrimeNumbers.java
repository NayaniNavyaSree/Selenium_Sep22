package Java_Package;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		//for(int num=1;num<=100;num++)
		{
		for(int i=1;i<=100;i++)
				{
				if(num%i==0)
					count++;		
				}
				if(count==2)
				System.out.println(num);
			//System.out.println(num);
		}

	}

}
