package strings;

import java.util.Scanner;

public class Pangram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String x = s.nextLine();
		String y=x.toLowerCase();
		String s2="abcdefghijklmnopqrstuvwxyz";
		String v[]=s2.split("",0);
		int c=0;
		for(int i=0;i<=v.length-1;i++)
		{
			
			if(y.contains(v[i]))
				
				c=c+1;
		}
		if(c==26)
			System.out.println("pangram");
		else
			System.out.println("not a Pangram");

	}

}
