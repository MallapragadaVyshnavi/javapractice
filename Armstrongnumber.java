import java.util.Scanner;
import java.lang.*;
public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int n1,count=0,digit;
		double sum=0;
		n1=n;
		while(n1!=0)
		{
			n1=n1/10;
			count=count+1;
		}
		n1=n;
		while(n1!=0)
		{
			digit=n1%10;
			sum=sum+Math.pow(digit,count);	
			n1=n1/10;
		}
		if(sum==n)
			System.out.println(n+ " is an Armstrong Number");
		else
			System.out.println(n + " Not an Armstrong number");
	}

}
