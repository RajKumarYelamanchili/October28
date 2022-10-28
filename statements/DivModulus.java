package statements;

public class DivModulus {

	public static void main(String[] args) {
		int a=746966;
		int b=10;
		//b=a/b;//divide by 10,  all digits except last one
		
	//	% --Modulus and it gives remainder
		b=a%b; //modulus by 10 --->take the last digit
		
		System.out.println(b);

	}

}
