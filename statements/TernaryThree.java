package statements;

public class TernaryThree {

	public static void main(String[] args) {
		int x=451,y=1800,z=99,largest;
		
	largest	= (x>y) ? (x>z?x:z)  : (y>z?y:z);
	
	System.out.println("largest of x,y,z : " + largest);

	}

}
