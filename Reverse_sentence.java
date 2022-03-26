package reverse;
import java.util.*;
public class Reverse_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		StringBuilder q = new StringBuilder(a);
		q=q.reverse();
		System.out.println(q);
		String b[]=q.toString().split(" ");
		StringBuilder x;
		for(int i=0;i<b.length;i++)
		{
			x=new StringBuilder(b[i]);
			b[i]=x.reverse().toString();
		}
		String c=String.join(" ", b);
		System.out.println(c);
	}
}
