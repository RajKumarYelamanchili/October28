package statements;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++)
		{
			if (i==4 || i==6)
				 continue;
			System.out.println(i);
		}
		System.out.println("Out of loop");
	}

}
