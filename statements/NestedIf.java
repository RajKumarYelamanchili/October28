package statements;
public class NestedIf {
	public static void main(String[] args) {
		int n1=111,n2=22,n3=444,largest;
	if(n1>=n2)	
	{
		if(n1>=n3)
		{
			largest = n1;
		}
		else
		{
			largest = n3;
		}
	}
	else
	{
		if (n2 >= n3)
		{
				largest =   n2;
		}
		else
		{
			  largest= n3;
		}
	
	}
	System.out.println("the largest of n1,n2,n3 is " + largest);	
	}//end of main
}//end of class
