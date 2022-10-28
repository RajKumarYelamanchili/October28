package statements;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the number you want to find Reverse: ");
	int num	= sc.nextInt();  //1234
	int originalNum = num;
	
	int rev =0;
	
	while(num!=0)
	{
		 rev  =  rev*10 + num%10;
		 num  = num/10;
	}
	
	System.out.println("reverse of " + num + " is "+ rev);
	
	if (originalNum == rev)
	{
		System.out.println("PALINDROME");
	}
	else
	{
		System.out.println("NOT A PALINDROME");
	}

	}

}
